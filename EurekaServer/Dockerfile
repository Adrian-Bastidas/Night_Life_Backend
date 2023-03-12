FROM openjdk:17
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} EurekaServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-crud-1.0.jar"]