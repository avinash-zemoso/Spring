FROM openjdk:12-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=SpringBasic/target/SpringBasic-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} SpringBasic-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBasic-1.0-SNAPSHOT.jar"]
CMD ["mvn spring-boot:run"]
