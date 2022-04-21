FROM quay.io/zenlab/openjdk:13
VOLUME /tmp
EXPOSE 8000
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD out/artifacts/PartyInABoxWeb_jar/PartyInABoxWeb.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]

