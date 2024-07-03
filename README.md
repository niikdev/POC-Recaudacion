# POC-Recaudacion - Framework de autoamtización de pruebas en aplicaciones web creado con Selenium, Java y Cucumber.

## Características

- Utiliza Selenium WebDriver para la automatización de pruebas en navegadores web.
- Escrito en Java y gestionado con Maven para la construcción y administración de dependencias.
- Utiliza Cucumber para la definición de escenarios y la escritura de pruebas en lenguaje Gherkin.
- Estructura modular con páginas de objetos, steps y utilidades para facilitar el mantenimiento y la escalabilidad.

## Descripción:
Prueba automatizada que permite ingresar a la url inicial de Previred, te permite iniciar sesión con un usuario válido, selecciona un Rol trabajador empresa, selecciona una empresa del usuario, modifica un dato y actualiza un valor del campo de los datos de la empresa (el nombre de la calle precisamente) y se valida que el cambio se haya hecho correctamente.

## Configuración del Proyecto

### Requisitos

- Java JDK instalado
- Maven configurado
- Selenium WebDriver y WebDriverManager (Viene en las dependencias)
- Cucumber para Java (Viene en las dependencias)
- IDE de desarrollo (Ej: IntelliJ IDEA, Eclipse)

### Instalación

1. Clonar el repositorio
2. Importar el proyecto en tu IDE
3. Ejecutar `mvn clean install` para descargar las dependencias

## Estructura del Proyecto

- **src/test/java**: Contiene las clases de pruebas escritas en Java y los steps de Cucumber.
- **src/test/java/pages**: Contiene los selectores y funciones de cada página.
- **src/test/java/steps**: Archivos de datos de prueba y configuraciones de Cucumber.
- **src/test/java/features**: Archivos de datos de prueba y lenguaje gherkin.
- **src/test/java/runner**: Contiene el runner para ejecutar el proyecto, donde también está el plugin para reporte por defecto de cucumber.
- **pom.xml**: Archivo de configuración de Maven con las dependencias del proyecto.

## Ejecución de Pruebas

Para ejecutar las pruebas, puedes utilizar los runners de Cucumber o ejecutar las pruebas JUnit desde tu IDE.
