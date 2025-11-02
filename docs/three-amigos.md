\# Three Amigos - Sesión de Definición



\## 📅 Información de la Sesión

\*\*Fecha:\*\* Noviembre 2025  

\*\*Funcionalidad:\*\* Sistema de Login  

\*\*Duración:\*\* 30 minutos



---



\## 👥 Participantes



| Rol | Responsabilidad |

|-----|-----------------|

| \*\*Product Owner (PO)\*\* | Define el valor de negocio y prioridades |

| \*\*QA (Quality Assurance)\*\* | Identifica casos de prueba y escenarios edge |

| \*\*Developer (Dev)\*\* | Evalúa viabilidad técnica y esfuerzo |



---



\## 🎯 Funcionalidad Elegida: Login de Usuario



\### Descripción

Sistema de autenticación que permite a los usuarios acceder a la aplicación mediante credenciales (usuario y contraseña).



---



\## ✅ Criterios de Aceptación



1\. \*\*Login exitoso:\*\*

&nbsp;  - Usuario ingresa credenciales válidas (usuario: "juan", clave: "1234")

&nbsp;  - Sistema valida las credenciales

&nbsp;  - Sistema muestra mensaje: "Bienvenido juan"



2\. \*\*Login fallido:\*\*

&nbsp;  - Usuario ingresa credenciales inválidas

&nbsp;  - Sistema rechaza el acceso

&nbsp;  - Sistema muestra mensaje: "Credenciales inválidas"



3\. \*\*Validaciones:\*\*

&nbsp;  - Campos usuario y contraseña son obligatorios

&nbsp;  - Sistema distingue entre mayúsculas y minúsculas

&nbsp;  - No se permiten credenciales vacías



---



\## 💡 Ejemplos Discutidos



\### Ejemplo 1: Login exitoso

DADO que existe un usuario "juan" con contraseña "1234"

CUANDO el usuario ingresa "juan" y "1234"

ENTONCES el sistema muestra "Bienvenido juan"





\### Ejemplo 2: Contraseña incorrecta

DADO que existe un usuario "juan" con contraseña "1234"

CUANDO el usuario ingresa "juan" y "0000"

ENTONCES el sistema muestra "Credenciales inválidas"





\### Ejemplo 3: Usuario no existe

DADO que NO existe un usuario "ana"

CUANDO el usuario ingresa "ana" y "9999"

ENTONCES el sistema muestra "Credenciales inválidas"





---



\## 🔍 Preguntas y Decisiones



\*\*Q:\*\* ¿Qué pasa si el usuario deja campos vacíos?  

\*\*A:\*\* Se muestra "Credenciales inválidas" (simplificado para esta demo)



\*\*Q:\*\* ¿Cuántos intentos fallidos se permiten?  

\*\*A:\*\* Sin límite por ahora (fuera del alcance de esta iteración)



\*\*Q:\*\* ¿Se requiere encriptación de contraseñas?  

\*\*A:\*\* No para esta demo (simulación simple)



---



\## 📊 Cobertura de Escenarios



\- ✅ Happy path (login exitoso)

\- ✅ Contraseña incorrecta

\- ✅ Usuario inexistente

\- ⚠️ Campos vacíos (simplificado)

\- ❌ Bloqueo por intentos (fuera de alcance)



---



\## 🎯 Conclusión



Se acordó implementar un sistema de login básico con validación de credenciales. Los escenarios definidos cubren los casos principales y serán automatizados con Cucumber.



