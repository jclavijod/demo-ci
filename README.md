# 🚀 Demo CI - Proyecto de Integración Continua con Maven

[![CI - Maven build and test](https://github.com/jclavijod/demo-ci/actions/workflows/ci.yml/badge.svg)](https://github.com/jclavijod/demo-ci/actions/workflows/ci.yml)

Proyecto de demostración de Integración Continua (CI) utilizando Maven, JUnit, Cucumber y GitHub Actions.

---

## 📋 Descripción del Proyecto

Este proyecto implementa un pipeline de CI/CD completo que incluye:
- Compilación automática con Maven
- Pruebas unitarias con JUnit 5
- Pruebas BDD con Cucumber
- Pruebas de performance con k6
- Generación de reportes HTML navegables
- Publicación de artifacts en GitHub Actions

---

## 🎯 Objetivos

### Actividad 1: CI Básico
- ✅ Configurar control de versiones con Git
- ✅ Gestionar dependencias con Maven
- ✅ Implementar pruebas unitarias automatizadas
- ✅ Configurar pipeline de CI con GitHub Actions
- ✅ Generar reportes de pruebas navegables

### Actividad 2: BDD + Performance + Métricas
- ✅ Realizar sesión "Three Amigos" para definir funcionalidades
- ✅ Implementar pruebas BDD con Cucumber y Gherkin
- ✅ Crear pruebas de performance con k6
- ✅ Configurar métricas y monitoreo del pipeline
- ✅ Implementar alertas automáticas ante fallos

---

## 📁 Estructura del Proyecto

demo-ci/
├── .github/
│ └── workflows/
│ └── ci.yml # Pipeline de GitHub Actions
├── docs/
│ └── three-amigos.md # Documentación de sesión Three Amigos
├── perf/
│ └── login.js # Script de pruebas de performance (k6)
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── ejemplo/
│ │ └── Calculadora.java # Clase principal
│ └── test/
│ ├── java/
│ │ └── com/
│ │ └── ejemplo/
│ │ ├── CalculadoraTest.java # Tests unitarios JUnit
│ │ ├── RunCucumberTest.java # Runner de Cucumber
│ │ └── steps/
│ │ └── LoginSteps.java # Step definitions BDD
│ └── resources/
│ └── features/
│ └── login.feature # Escenarios Gherkin
├── target/ # Directorio de compilación (generado)
│ ├── classes/ # Clases compiladas
│ ├── test-classes/ # Tests compilados
│ ├── surefire-reports/ # Reportes XML de tests
│ ├── site/ # Reportes HTML de Surefire
│ └── cucumber-report.html # Reporte HTML de Cucumber
├── .gitignore # Archivos ignorados por Git
├── pom.xml # Configuración de Maven
└── README.md # Este archivo


---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 17 | Lenguaje de programación |
| **Maven** | 3.9+ | Gestión de dependencias y build |
| **JUnit 5** | 5.10.2 | Framework de pruebas unitarias |
| **Cucumber** | 7.14.0 | Framework de pruebas BDD |
| **k6** | Latest | Herramienta de pruebas de performance |
| **GitHub Actions** | - | Plataforma de CI/CD |
| **Git** | 2.x | Control de versiones |

---

## 📦 Prerequisitos

### Software Requerido

1. **Java JDK 17 o superior**
   - Descargar: https://adoptium.net/
   - Verificar: `java -version`

2. **Maven 3.9 o superior**
   - Descargar: https://maven.apache.org/download.cgi
   - Verificar: `mvn -version`

3. **Git**
   - Descargar: https://git-scm.com/downloads
   - Verificar: `git --version`

4. **k6 (opcional, para pruebas de performance locales)**
   - Windows: `choco install k6`
   - macOS: `brew install k6`
   - Linux: Ver instrucciones en https://k6.io/docs/getting-started/installation/

### IDE Recomendado

- **IntelliJ IDEA** (Community o Ultimate)
- **Visual Studio Code** con extensiones de Java
- **Eclipse** con plugin de Maven

---

## 🚀 Instalación y Configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/USUARIO/demo-ci.git
cd demo-ci
2. Compilar el proyecto
bash
Copy
mvn clean compile
3. Ejecutar las pruebas
bash
Copy
mvn clean test
4. Generar reportes HTML
bash
Copy
mvn surefire-report:report
Los reportes se generan en:

target/site/surefire-report.html (JUnit)
target/cucumber-report.html (Cucumber)

📝 Comandos Principales

Maven
Comando	Descripción
mvn clean	Limpia el directorio target
mvn compile	Compila el código fuente
mvn test	Ejecuta todas las pruebas
mvn clean test	Limpia y ejecuta pruebas
mvn surefire-report:report	Genera reporte HTML de pruebas
mvn package	Genera el archivo JAR
Git
Comando	Descripción
git status	Ver estado de archivos
git add .	Agregar todos los cambios
git commit -m "mensaje"	Crear commit con mensaje
git push	Subir cambios al repositorio remoto
git pull	Descargar cambios del repositorio remoto
git log --oneline	Ver historial de commits
k6 (Performance)
Comando	Descripción
k6 run perf/login.js	Ejecutar prueba de performance
k6 run --vus 10 --duration 30s perf/login.js	Ejecutar con 10 usuarios por 30s

⚙️ Pipeline de CI/CD
Configuración de GitHub Actions
El pipeline está definido en .github/workflows/ci.yml

Trigger: Se ejecuta automáticamente en:

Push a la rama main
Pull Requests hacia main
Steps del Pipeline
Checkout repository: Clona el código del repositorio
Set up JDK 17: Configura Java 17 con Temurin
Build and run tests: Compila y ejecuta todas las pruebas
Generate test report (HTML): Genera reportes HTML de Surefire
Publish test reports: Publica reportes como artifacts
Upload Cucumber HTML report: Publica reporte de Cucumber
Artifacts Generados
El pipeline genera y publica los siguientes artifacts:

Artifact	Contenido	Ubicación
test-reports	Reportes JUnit XML y HTML de Surefire	target/surefire-reports/ y target/site/
cucumber-html	Reporte HTML navegable de Cucumber	target/cucumber-report.html
Para descargar artifacts:

Ve a GitHub Actions
Selecciona una ejecución del workflow
Baja hasta la sección "Artifacts"
Descarga el ZIP del artifact deseado
Visualización de Resultados
GitHub Actions UI: Ver logs y resultados en tiempo real
Status Checks: Indicadores en commits y Pull Requests
Badges: Badge de estado en el README (arriba)

🧪 Actividad 2: BDD + Performance + Métricas
📋 Three Amigos
Se realizó una sesión de "Three Amigos" con los roles de Product Owner, QA y Developer para definir la funcionalidad de Login.

Documentación completa: docs/three-amigos.md

Roles participantes:

Product Owner (PO): Define criterios de aceptación y valor de negocio
QA (Quality Assurance): Identifica casos de prueba y escenarios edge
Developer (Dev): Evalúa viabilidad técnica y esfuerzo de implementación
Funcionalidad: Sistema de Login con validación de credenciales

Criterios de aceptación:

Login exitoso con credenciales válidas (juan/1234)
Login fallido con credenciales inválidas
Sistema muestra mensajes apropiados según el resultado

🥒 Pruebas BDD con Cucumber
Escenarios Gherkin
Los escenarios están definidos en: src/test/resources/features/login.feature

Escenarios implementados:

✅ Login exitoso con credenciales válidas
✅ Login fallido con credenciales inválidas (múltiples casos con Scenario Outline)
Ejemplo de escenario:

gherkin
Copy
Feature: Login de Usuario
  Como usuario del sistema
  Quiero poder iniciar sesión con mis credenciales
  Para acceder a las funcionalidades de la aplicación

  Scenario: Login exitoso con credenciales válidas
    Given un usuario con usuario "juan" y clave "1234"
    When intenta iniciar sesión
    Then el sistema muestra "Bienvenido juan"

  Scenario Outline: Login fallido con credenciales inválidas
    Given un usuario con usuario "<usuario>" y clave "<clave>"
    When intenta iniciar sesión
    Then el sistema muestra "<mensaje>"

    Examples:
      | usuario | clave | mensaje                |
      | juan    | 0000  | Credenciales inválidas |
      | ana     | 9999  | Credenciales inválidas |
Step Definitions
Implementados en: src/test/java/com/ejemplo/steps/LoginSteps.java

Utilizan anotaciones de Cucumber:

@Given: Precondiciones del escenario
@When: Acciones que ejecuta el usuario
@Then: Verificaciones de resultados esperados

Ejemplo de implementación:

@Given("un usuario con usuario {string} y clave {string}")
public void un_usuario_con_usuario_y_clave(String u, String c) {
    this.usuario = u;
    this.clave = c;
}

@When("intenta iniciar sesión")
public void intenta_iniciar_sesion() {
    if ("juan".equals(usuario) && "1234".equals(clave)) {
        mensaje = "Bienvenido " + usuario;
    } else {
        mensaje = "Credenciales inválidas";
    }
}

@Then("el sistema muestra {string}")
public void el_sistema_muestra(String esperado) {
    assertEquals(esperado, mensaje);
}

Ejecutar tests BDD
mvn clean test

Resultado esperado:

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

- 2 tests JUnit (CalculadoraTest)
- 3 escenarios Cucumber (Login)
  ✓ Login exitoso con credenciales válidas
  ✓ Login fallido con juan/0000
  ✓ Login fallido con ana/9999
Reporte HTML generado en: target/cucumber-report.html

Reporte Cucumber en CI
El pipeline de CI ejecuta automáticamente los tests BDD y publica el reporte como artifact cucumber-html.

Para ver el reporte:

Ve a GitHub Actions
Selecciona la ejecución del workflow
Descarga el artifact cucumber-html
Abre cucumber-report.html en tu navegador

⚡ Pruebas de Performance con k6
Script de Performance
Ubicación: perf/login.js

Configuración:

VUs (Virtual Users): 5 usuarios concurrentes
Duración: 10 segundos
Endpoint: Simulación con https://test.k6.io (reemplazar con API real en producción)

Contenido del script:

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
  const res = http.get('https://test.k6.io');
  
  check(res, {
    'status 200': (r) => r.status === 200,
    'response time < 500ms': (r) => r.timings.duration < 500,
  });
  
  sleep(1);
}
Métricas Clave
Métrica	Descripción	Umbral Definido
http_req_duration	Tiempo de respuesta de requests	p95 < 500ms
http_req_failed	Tasa de errores HTTP	< 1%
http_reqs	Requests por segundo (TPS)	-
vus	Usuarios virtuales activos	5
iteration_duration	Duración de cada iteración	-
data_received	Datos recibidos	-
data_sent	Datos enviados	-
Ejecutar prueba de performance (local)
Requisitos: k6 instalado

Windows (Chocolatey):

choco install k6

macOS (Homebrew):

brew install k6
Linux:

sudo gpg -k
sudo gpg --no-default-keyring --keyring /usr/share/keyrings/k6-archive-keyring.gpg --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys C5AD17C747E3415A3642D57D77C6C491D6AC1D69
echo "deb [signed-by=/usr/share/keyrings/k6-archive-keyring.gpg] https://dl.k6.io/deb stable main" | sudo tee /etc/apt/sources.list.d/k6.list
sudo apt-get update
sudo apt-get install k6

Ejecutar:

k6 run perf/login.js
Salida esperada:

     ✓ status 200
     ✓ response time < 500ms

     checks.........................: 100.00% ✓ 50       ✗ 0
     data_received..................: 123 kB  12 kB/s
     data_sent......................: 4.5 kB  450 B/s
     http_req_blocked...............: avg=10ms    min=1ms    med=5ms     max=50ms    p(95)=25ms
     http_req_connecting............: avg=8ms     min=1ms    med=4ms     max=40ms    p(95)=20ms
     http_req_duration..............: avg=245ms   min=200ms  med=240ms   max=350ms   p(95)=320ms
       { expected_response:true }...: avg=245ms   min=200ms  med=240ms   max=350ms   p(95)=320ms
     http_req_failed................: 0.00%   ✓ 0        ✗ 50
     http_req_receiving.............: avg=2ms     min=1ms    med=2ms     max=5ms     p(95)=4ms
     http_req_sending...............: avg=1ms     min=0ms    med=1ms     max=3ms     p(95)=2ms
     http_req_tls_handshaking.......: avg=0s      min=0s     med=0s      max=0s      p(95)=0s
     http_req_waiting...............: avg=242ms   min=198ms  med=237ms   max=345ms   p(95)=315ms
     http_reqs......................: 50      5/s
     iteration_duration.............: avg=1.25s   min=1.2s   med=1.24s   max=1.35s   p(95)=1.32s
     iterations.....................: 50      5/s
     vus............................: 5       min=5      max=5
     vus_max........................: 5       min=5      max=5
Umbrales (Thresholds)

Los umbrales definidos en el script fallan la prueba si:

❌ Más del 1% de requests fallan (http_req_failed: ['rate<0.01'])
❌ El percentil 95 de latencia supera 500ms (http_req_duration: ['p(95)<500'])
Esto permite detectar degradaciones de performance automáticamente.

Interpretación de resultados:

✅ Verde: Todos los umbrales se cumplieron
❌ Rojo: Al menos un umbral fue superado (degradación detectada)
📊 Métricas y Monitoreo del Pipeline
Métricas Recopiladas
El pipeline de CI recopila y publica las siguientes métricas:

Build Success Rate: Porcentaje de builds exitosos
Tiempo de Feedback: Duración total del job de CI (~30-60s)
Cobertura de Tests: Tests ejecutados vs. tests pasados
Escenarios BDD: Escenarios Cucumber ejecutados y pasados
Latencia (p95): Percentil 95 de tiempo de respuesta (k6)
Tasa de Error: Porcentaje de requests fallidos (k6)
Dashboard de Métricas (Conceptual)
┌─────────────────────────────────────────────┐
│  📊 Pipeline Metrics Dashboard              │
├─────────────────────────────────────────────┤
│  ✅ Build Success Rate:        100%         │
│  ⏱️  Avg Build Time:            53s          │
│  🧪 JUnit Tests Passed:        2/2          │
│  🥒 Cucumber Scenarios:        3/3          │
│  ⚡ p95 Latency:               245ms        │
│  ❌ Error Rate:                0.0%         │
│  📦 Artifacts Generated:       2            │
│  🔄 Last Updated:              Just now     │
└─────────────────────────────────────────────┘
Visualización en GitHub Actions
Las métricas están disponibles en:

GitHub Actions UI: Pestaña Actions → Seleccionar ejecución
Artifacts: Reportes descargables (JUnit, Cucumber, k6)
Status Checks: Indicadores automáticos en Pull Requests
Workflow Summary: Resumen de tests ejecutados
Logs: Logs detallados de cada step
Métricas por Tipo de Test
Tests Unitarios (JUnit):

Total de tests ejecutados
Tests pasados/fallidos/omitidos
Tiempo de ejecución por test
Cobertura de código (si se configura JaCoCo)
Tests BDD (Cucumber):

Escenarios ejecutados
Steps ejecutados
Tiempo de ejecución por escenario
Tasa de éxito por feature
Tests de Performance (k6):

Throughput (requests/segundo)
Latencia (p50, p95, p99)
Tasa de errores
Tiempo de respuesta promedio

🚨 Alertas Automáticas
Mecanismos de Notificación
El sistema genera alertas automáticas cuando:

Build falla:
❌ Status check rojo en GitHub
📧 Notificación por email (si está configurado en Settings)
🔴 Badge rojo en README
🚫 Bloqueo de merge en PR (si está configurado)
Tests fallan:
❌ Notificación en Pull Request
📊 Reporte de fallos en Actions
🚫 Bloqueo de merge (si está configurado)
📝 Comentario automático en PR con detalles
Umbrales k6 superados:
❌ Job falla automáticamente
📈 Degradación de performance detectada
⚠️ Alerta visible en el workflow
📊 Métricas detalladas en logs
Escenarios BDD fallan:
❌ Reporte Cucumber muestra fallos
📋 Detalles de steps fallidos
🔍 Stack trace disponible
📸 Screenshots (si se configuran)

Canales de Notificación
Implementados:

✅ GitHub Status Checks: Visible en PRs y commits
✅ GitHub Actions UI: Notificaciones en la interfaz
✅ Email: Notificaciones de GitHub (configurables en Settings → Notifications)
✅ Badge en README: Indicador visual del estado del build

Opcionales (conceptual para implementación futura):

🔄 Slack: Integración vía webhooks para notificaciones en tiempo real
🔄 Microsoft Teams: Integración vía webhooks
🔄 Discord: Integración vía webhooks
🔄 PagerDuty: Para alertas críticas de producción
🔄 Datadog/New Relic: Para monitoreo avanzado

Ejemplo de Integración Slack (Conceptual)
Para implementar notificaciones en Slack, se puede agregar este step al workflow:

yaml
Copy
- name: Notify Slack on failure
  if: failure()
  uses: slackapi/slack-github-action@v1
  with:
    webhook-url: ${{ secrets.SLACK_WEBHOOK }}
    payload: |
      {
        "text": "❌ Build failed: ${{ github.repository }}",
        "blocks": [
          {
            "type": "section",
            "text": {
              "type": "mrkdwn",
              "text": "*Build Failed*\n*Repository:* ${{ github.repository }}\n*Branch:* ${{ github.ref }}\n*Commit:* ${{ github.sha }}\n*Author:* ${{ github.actor }}"
            }
          },
          {
            "type": "actions",
            "elements": [
              {
                "type": "button",
                "text": {
                  "type": "plain_text",
                  "text": "View Logs"
                },
                "url": "${{ github.server_url }}/${{ github.repository }}/actions/runs/${{ github.run_id }}"
              }
            ]
          }
        ]
      }

Configuración de Umbrales
Los umbrales se configuran en diferentes niveles:

1. Umbrales de k6 (en perf/login.js):

javascript
Copy
thresholds: {
  http_req_failed: ['rate<0.01'],      // < 1% errores
  http_req_duration: ['p(95)<500'],    // p95 < 500ms
  http_req_duration: ['p(99)<1000'],   // p99 < 1s
  checks: ['rate>0.95'],               // > 95% checks pasan
  http_reqs: ['rate>10'],              // > 10 req/s
}

2. Branch Protection Rules (en GitHub Settings → Branches):

Require status checks to pass before merging
Require branches to be up to date before merging
Require pull request reviews before merging

3. Workflow Conditions (en .github/workflows/ci.yml):

- name: Check test coverage
  run: |
    if [ $(mvn test | grep "Tests run" | awk '{print \$6}' | cut -d',' -f1) -lt 80 ]; then
      echo "Test coverage below 80%"
      exit 1
    fi

Niveles de Severidad
Nivel	Descripción	Acción
🟢 Info	Build exitoso, todos los tests pasan	Ninguna
🟡 Warning	Tests pasan pero con warnings	Log en Actions
🟠 Error	Algunos tests fallan	Notificación + Bloqueo de merge
🔴 Critical	Build falla completamente	Notificación urgente + Bloqueo

🧪 Pruebas
Tipos de Pruebas Implementadas
Pruebas Unitarias (JUnit 5)
Ubicación: src/test/java/com/ejemplo/CalculadoraTest.java
Cobertura: Métodos de la clase Calculadora
Ejecución: Automática en cada build
Pruebas BDD (Cucumber)
Ubicación: src/test/resources/features/login.feature
Cobertura: Funcionalidad de Login
Ejecución: Automática en cada build
Pruebas de Performance (k6)
Ubicación: perf/login.js
Cobertura: Endpoints de API
Ejecución: Manual (local) u opcional en CI
Ejecutar Pruebas Específicas

Solo tests unitarios:

mvn test -Dtest=CalculadoraTest
Solo tests BDD:

mvn test -Dtest=RunCucumberTest
Con verbose output:

mvn test -X

📈 Mejores Prácticas Implementadas

Control de Versiones
✅ Commits frecuentes y descriptivos
✅ Mensajes de commit siguiendo convenciones (feat, fix, docs, test, ci)
✅ Uso de .gitignore para excluir archivos generados
✅ Branches para features (opcional)
Gestión de Dependencias
✅ Versiones explícitas en pom.xml
✅ Uso de repositorios Maven confiables
✅ Dependencias de test con scope test
✅ Plugins actualizados
Pruebas Automatizadas
✅ Tests ejecutados en cada build
✅ Cobertura de casos positivos y negativos
✅ Assertions claras y descriptivas
✅ Tests independientes y repetibles
CI/CD
✅ Pipeline ejecutado automáticamente
✅ Feedback rápido (< 1 minuto)
✅ Artifacts publicados para auditoría
✅ Status checks en Pull Requests
Documentación
✅ README completo y actualizado
✅ Comentarios en código cuando necesario
✅ Documentación de decisiones técnicas
✅ Guías de instalación y uso

🔧 Configuración Avanzada
Agregar Cobertura de Código con JaCoCo
Agregar al pom.xml:

<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.11</version>
  <executions>
    <execution>
      <goals>
        <goal>prepare-agent</goal>
      </goals>
    </execution>
    <execution>
      <id>report</id>
      <phase>test</phase>
      <goals>
        <goal>report</goal>
      </goals>
    </execution>
  </executions>
</plugin>

Ejecutar:

mvn clean test jacoco:report
Reporte en: target/site/jacoco/index.html

Integrar k6 en el Pipeline CI
Agregar al .github/workflows/ci.yml:

  perf-test:
    runs-on: ubuntu-latest
    needs: build
    steps:
      - uses: actions/checkout@v4
      
      - name: Install k6
        run: |
          sudo gpg -k
          sudo gpg --no-default-keyring --keyring /usr/share/keyrings/k6-archive-keyring.gpg --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys C5AD17C747E3415A3642D57D77C6C491D6AC1D69
          echo "deb [signed-by=/usr/share/keyrings/k6-archive-keyring.gpg] https://dl.k6.io/deb stable main" | sudo tee /etc/apt/sources.list.d/k6.list
          sudo apt-get update
          sudo apt-get install -y k6
      
      - name: Run k6 performance tests
        run: |
          k6 run perf/login.js --out json=k6-results.json
      
      - name: Upload k6 results
        if: always()
        uses: actions/upload-artifact@v4
        with:
          name: k6-results
          path: k6-results.json

🐛 Troubleshooting
Error: "JAVA_HOME not set"

Solución:

# Windows
set JAVA_HOME=C:\Program Files\Java\jdk-17
set PATH=%JAVA_HOME%\bin;%PATH%

# Linux/macOS
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH=$JAVA_HOME/bin:$PATH
Error: "mvn: command not found"
Solución: Agregar Maven al PATH

# Windows
set PATH=C:\apache-maven-3.9.x\bin;%PATH%

# Linux/macOS
export PATH=/opt/apache-maven-3.9.x/bin:$PATH
Error: "Tests compilation failure"
Solución: Verificar versiones de dependencias en pom.xml

mvn dependency:tree
mvn clean install -U
Error: "Cucumber scenarios not found"
Solución: Verificar estructura de carpetas

# Debe existir:
src/test/resources/features/login.feature
Pipeline falla en GitHub Actions
Solución: Revisar logs en GitHub Actions

Ve a la pestaña Actions
Haz clic en el workflow fallido
Revisa el step que falló
Verifica errores en los logs

📚 Referencias y Recursos
Documentación Oficial
Maven: https://maven.apache.org/guides/
JUnit 5: https://junit.org/junit5/docs/current/user-guide/
Cucumber: https://cucumber.io/docs/cucumber/
k6: https://k6.io/docs/
GitHub Actions: https://docs.github.com/en/actions
Tutoriales y Guías
Maven Getting Started: https://maven.apache.org/guides/getting-started/
JUnit 5 Tutorial: https://www.baeldung.com/junit-5
Cucumber Java: https://cucumber.io/docs/installation/java/
k6 Getting Started: https://k6.io/docs/getting-started/running-k6/
GitHub Actions CI/CD: https://docs.github.com/en/actions/automating-builds-and-tests
Herramientas Adicionales
SonarQube: Análisis de calidad de código
Dependabot: Actualización automática de dependencias
Renovate: Gestión de dependencias
Allure: Reportes avanzados de pruebas

👥 Autor
Nombre: José Clavijo
Curso: Ingeniería en Informática
Asignatura: AUTOMATIZACIÓN DE PRUEBAS
Fecha: Noviembre 2025

📄 Licencia
Este proyecto es de uso académico y educativo.

🎯 Conclusiones
Este proyecto demuestra la implementación exitosa de un pipeline de CI/CD completo que incluye:

Automatización completa: Desde el commit hasta la generación de reportes
Calidad asegurada: Múltiples niveles de testing (unitario, BDD, performance)
Feedback rápido: Resultados en menos de 1 minuto
Trazabilidad: Artifacts y reportes para cada ejecución
Escalabilidad: Fácil de extender con nuevas pruebas y métricas
Aprendizajes Clave
✅ Configuración de herramientas de build (Maven)
✅ Implementación de pruebas automatizadas (JUnit, Cucumber)
✅ Configuración de pipelines de CI/CD (GitHub Actions)
✅ Generación de reportes navegables
✅ Implementación de BDD con Gherkin
✅ Pruebas de performance con k6
✅ Monitoreo y alertas automáticas

Próximos Pasos Sugeridos
Agregar cobertura de código con JaCoCo
Implementar análisis estático con SonarQube
Configurar deployment automático a entornos de staging
Agregar pruebas de integración con Testcontainers
Implementar notificaciones en Slack/Teams
Configurar dashboards de métricas con Grafana

📞 Soporte
Para preguntas o problemas:

Revisar la sección de Troubleshooting
Consultar la documentación oficial de las herramientas
Revisar los logs de GitHub Actions

¡Gracias por revisar este proyecto! 🚀


---