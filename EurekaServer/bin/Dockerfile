FROM openjdk:17
RUN addgroup -S spring && adduser -S spring G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-crud-1.0.jar
ENTRYPOINT ["java","-jar","/demo-crud-1.0.jar"]