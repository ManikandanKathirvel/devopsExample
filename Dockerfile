FROM eclipse-temurin:17
COPY target/devopsExample.jar devopsExample.jar
CMD ["java","-jar","devopsExample.jar"]
