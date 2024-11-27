FROM gcr.io/distroless/java21
COPY target/eux-journalarkivar-naisjob.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
