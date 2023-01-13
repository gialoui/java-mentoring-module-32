FROM openjdk:17-alpine
WORKDIR /
ADD /target/apigateway-*.jar apigateway-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=docker", "./apigateway-app.jar"]