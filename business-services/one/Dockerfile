FROM openjdk:17-alpine
WORKDIR /
ADD /target/one-*.jar one-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=docker", "./one-app.jar"]