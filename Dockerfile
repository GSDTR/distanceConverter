FROM maven AS build
COPY /src /src
COPY /pom.xml .
WORKDIR .
RUN mvn clean install


FROM openjdk:11-jre-slim
COPY --from=build /target/distanceConverter-1.0-SNAPSHOT.jar /app.jar
expose 8080
ENTRYPOINT ["java","-jar","/app.jar"]