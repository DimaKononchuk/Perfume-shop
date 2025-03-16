# Перший етап: збірка проекту
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Другий етап: створення образу для запуску
FROM eclipse-temurin:17-alpine
COPY --from=build /app/target/*.jar OnlineShop-1.0-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "OnlineShop-1.0-SNAPSHOT.jar"]
