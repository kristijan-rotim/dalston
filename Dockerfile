#
# Build stage
#
FROM maven:3.9.5-amazoncorretto-21 AS build
RUN mkdir -p dalston
WORKDIR dalston
COPY pom.xml /dalston
COPY src /dalston/src
COPY frontend /dalston/frontend
RUN mvn -f pom.xml clean install -DskipTests=true

#
# Package stage
#
FROM openjdk:21
COPY --from=build /dalston/target/*.jar service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","service.jar"]