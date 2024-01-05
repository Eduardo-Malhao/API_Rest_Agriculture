FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package

RUN cp target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
