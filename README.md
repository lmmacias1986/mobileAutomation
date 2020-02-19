# mobileAutomation

Pasos para ejecutar los casos de prueba automatizados.

prerequisitos de ambiente
El ambiente debe contar con
  -Maven
  -Appium
  -Android studio (emulator device) (ANDROID_HOME)
    .Configurar un dispositivo con android 9
  -JDK (JAVA_HOME)

Build
  -Compilar la aplicacion para descargar las dependencias del pom.xml
  -Modificar el path de la aplicacion en las capabilities
  -Iniciar el appium y levantar el servicio.
  -en la terminal del IDE, ejecutar mvn clean verify
