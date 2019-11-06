FROM maven:3.5-jdk-8 AS build
COPY src /usr/sdustakar/src
COPY pom.xml /usr/sdustakar
RUN mvn -f /usr/sdustakar/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.datasource.url=jdbc:mysql://mysqldb:3306/quizdb?useSSL=false&allowPublicKeyRetrieval=true","-jar","/usr/sdustakar/target/bank-service-1.0.0.jar"]