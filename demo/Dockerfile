FROM openjdk:17
EXPOSE 3000
ADD target/server-app-docker.jar server-app-docker.jar
ENTRYPOINT ["java", "-jar", "/server-app-docker.jar"]