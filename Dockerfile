FROM  maven:3.9.9-amazoncorretto-17
COPY . .
RUN mvn clean package

FROM  eclipse-temurin:17-alpine
COPY --from=build /target/*.jar OnlineShop-1.0-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","OnlineShop-1.0-SNAPSHOT.jar"]

