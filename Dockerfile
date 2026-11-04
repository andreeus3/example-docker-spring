FROM eclipse-temurin:27-jre-alpine
WORKDIR /code
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/code/app.jar"]