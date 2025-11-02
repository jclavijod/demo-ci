import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {
  vus: 5,              // 5 usuarios virtuales concurrentes
  duration: '10s',     // Durante 10 segundos
  thresholds: {
    http_req_failed: ['rate<0.01'],      // Menos del 1% de errores
    http_req_duration: ['p(95)<500'],    // 95% de requests bajo 500ms
  },
};

export default function () {
  // Simulación de endpoint de login
  // En producción, reemplazar con tu API real
  const res = http.get('https://test.k6.io');
  
  check(res, {
    'status 200': (r) => r.status === 200,
    'response time < 500ms': (r) => r.timings.duration < 500,
  });
  
  sleep(1);
}