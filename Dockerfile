FROM eclipse-temurin:19-jdk-alpine
VOLUME /tmp
COPY target/demo-jpa-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]