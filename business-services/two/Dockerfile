FROM openjdk:17-alpine
WORKDIR /
ADD /target/two-*.jar two-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=docker", "./two-app.jar"]