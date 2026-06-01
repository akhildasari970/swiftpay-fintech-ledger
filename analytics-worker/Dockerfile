FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/analytics-worker.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
