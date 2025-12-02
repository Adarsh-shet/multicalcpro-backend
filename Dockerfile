FROM eclipse-temurin:17-jdl-alpine

WORKDIR /app

COPY target/multicalcpro-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT["java","-jar","/app/appi.jar"]