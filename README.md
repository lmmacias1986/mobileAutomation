# mobileAutomation

Pasos para ejecutar los casos de prueba automatizados.

# prerequisitos de ambiente.
El ambiente debe contar con
  - Maven
  - Appium
  - Android studio (emulator device) (configurar la variable de entorno ANDROID_HOME)
    .Configurar un dispositivo con android 9
  - DK (configurar la variable de entorno JAVA_HOME)

# Build and run
  - Compilar la aplicacion para descargar las dependencias del pom.xml
  - Modificar el path de la aplicacion en las capabilities
  - Iniciar el appium y levantar el servicio.
  - En la terminal del IDE, ejecutar mvn clean verify
