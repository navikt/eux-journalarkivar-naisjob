FROM europe-north1-docker.pkg.dev/cgr-nav/pull-through/nav.no/jre:openjdk-25
COPY target/eux-journalarkivar-naisjob.jar /app.jar
CMD ["-jar", "/app.jar"]
