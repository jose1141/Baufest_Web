# Baufest_Web
***
Proyecto de automatización de prueba usando Cucumber BDD, Java y Selenium diseñado con Page Object Model

## Caracteristicas del Framework
* Page Object Model design
* Log4j for logging purpose
* WebDriverListener
* Captura de pantalla de escenarios fallidos
* Framework robusto y reutilizable
* Informes enriquecidos utilizando maven-cucumber-reporting
* Admite la ejecución cualquier controlador web

## En la consola del Intellij ejecutar el siguiente comando:
mvn clean verify

## Reporte
A continuación, se generarán 2 informes HTML después de la ejecución:
1. Informe HTML de pepino -> ruta 'target\cucumber-reports\index.html' para el informe html de pepino y
2. Informe HTML ampliado de Masterthought -> ruta 'target\masterthought-reports\cucumber-html-reports' para informes HTML de ejecución ampliada