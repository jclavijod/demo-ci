# Demo CI - Proyecto de Integración Continua con Maven

[![CI - Maven build and test](https://github.com/jclavijod/demo-ci/actions/workflows/ci.yml/badge.svg)](https://github.com/jclavijod/demo-ci/actions/workflows/ci.yml)

Proyecto de ejemplo para implementar un pipeline de Integración Continua (CI) con Maven, JUnit 5 y GitHub Actions.

---

## 📑 Tabla de Contenidos

- [Descripción](#descripción)
- [Objetivos](#objetivos)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Requisitos Previos](#requisitos-previos)
- [Instalación y Configuración](#instalación-y-configuración)
- [Comandos Principales](#comandos-principales)
- [Pipeline de CI](#pipeline-de-ci)
- [Reportes de Pruebas](#reportes-de-pruebas)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Autor](#autor)

---

## 📖 Descripción

Este proyecto implementa un sistema de **Integración Continua** que:
- Compila automáticamente el código en cada push o pull request.
- Ejecuta pruebas unitarias con JUnit 5.
- Genera reportes navegables de las pruebas.
- Utiliza GitHub Actions como plataforma de CI/CD.

---

## 🎯 Objetivos

- Configurar un proyecto Java con Maven.
- Implementar pruebas unitarias automatizadas.
- Crear un pipeline de CI con GitHub Actions.
- Generar reportes HTML de las pruebas ejecutadas.
- Aplicar buenas prácticas de control de versiones con Git.

---

## 📂 Estructura del Proyecto

demo-ci/
├── .github/
│ └── workflows/
│ └── ci.yml # Pipeline de GitHub Actions
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/ejemplo/
│ │ └── Calculadora.java # Clase principal
│ └── test/
│ └── java/
│ └── com/ejemplo/
│ └── CalculadoraTest.java # Tests unitarios
├── .gitignore # Archivos ignorados por Git
├── pom.xml # Configuración de Maven
└── README.md # Este archivo


---

## ✅ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java JDK 17** o superior
  - Verifica: `java -version`
- **Apache Maven 3.8+**
  - Verifica: `mvn -v`
- **Git**
  - Verifica: `git --version`
- **Cuenta de GitHub** (para el pipeline de CI)

---

## 🚀 Instalación y Configuración

### 1. Clonar el repositorio

git clone https://github.com/jclavijod/demo-ci.git
cd demo-ci

### 2. Compilar el proyecto

mvn clean compile

### 3. Ejecutar las pruebas

mvn test

### 4. Generar reporte HTML de pruebas

mvn surefire-report:report

## El reporte se genera en: target/site/surefire-report.html

## 🛠️ Comandos Principales
Comando	Descripción
mvn clean	Limpia archivos generados (carpeta target/)
mvn compile	Compila el código fuente
mvn test	Ejecuta todas las pruebas unitarias
mvn clean test	Limpia y ejecuta pruebas
mvn surefire-report:report	Genera reporte HTML de pruebas
mvn package	Empaqueta el proyecto en un JAR

## ⚙️ Pipeline de CI
El proyecto utiliza GitHub Actions para automatizar:

Compilación del código en cada push o PR.
Ejecución de tests con JUnit 5.
Generación de reportes HTML navegables.
Publicación de artifacts descargables.
Archivo de configuración
El pipeline está definido en: .github/workflows/ci.yml

## Triggers (disparadores)
Push a la rama main
Pull Requests hacia main
Pasos del pipeline
Checkout del código
Configuración de JDK 17
Compilación y ejecución de tests (mvn clean test)
Generación de reportes HTML
Publicación de artifacts
Ver ejecuciones
Accede a la pestaña Actions en GitHub:
https://github.com/jclavijod/demo-ci/actions

## 📊 Reportes de Pruebas
Reportes locales
Después de ejecutar mvn test, los reportes se generan en:

XML: target/surefire-reports/*.xml
HTML: target/site/surefire-report.html (después de mvn surefire-report:report)
Reportes en GitHub Actions
Ve a la pestaña Actions del repositorio.
Selecciona una ejecución del workflow.
Descarga el artifact test-reports.
Descomprime y abre target/site/surefire-report.html.

## 🧰 Tecnologías Utilizadas
Tecnología	Versión	Propósito
Java	17	Lenguaje de programación
Maven	3.9+	Gestión de dependencias y build
JUnit 5	5.10.2	Framework de pruebas unitarias
GitHub Actions	-	Plataforma de CI/CD
Git	-	Control de versiones

## 📦 Dependencias principales (pom.xml)

<dependencies>
  <!-- JUnit 5 para pruebas unitarias -->
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>

## 🔧 Configuración de Maven
Plugins utilizados

maven-compiler-plugin: Compilación con Java 17
maven-surefire-plugin: Ejecución de tests JUnit 5
maven-surefire-report-plugin: Generación de reportes HTML

##📝 Buenas Prácticas Aplicadas

✅ Uso de .gitignore para excluir archivos generados
✅ Commits descriptivos siguiendo convenciones (feat, fix, docs, test, chore)
✅ Pipeline de CI automatizado
✅ Tests unitarios con cobertura básica
✅ Documentación completa en README
✅ Estructura de proyecto estándar Maven

## 🤝 Contribuir

Si deseas contribuir al proyecto:

Haz un fork del repositorio
Crea una rama para tu feature: git checkout -b feature/nueva-funcionalidad
Haz commit de tus cambios: git commit -m "feat: agrega nueva funcionalidad"
Push a la rama: git push origin feature/nueva-funcionalidad
Abre un Pull Request

## 👤 Autor
José Clavijo
GitHub: @jclavijod

## 📄 Licencia
Este proyecto es de código abierto y está disponible bajo la licencia MIT.

📸 Capturas de Pantalla
Pipeline de CI ejecutándose


## Reporte de pruebas

## 🔗 Enlaces Útiles
Documentación de Maven
JUnit 5 User Guide
GitHub Actions Documentation
Última actualización: Noviembre 2025
