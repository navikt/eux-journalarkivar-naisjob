FROM gcr.io/distroless/java25
COPY target/eux-journalarkivar-naisjob.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
