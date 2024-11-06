FROM eclipse-temurin:17
COPY target/devopsexample.jar devopsexample.jar
CMD ["java","-jar","devopsexample.jar"]
