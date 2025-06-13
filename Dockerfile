FROM openjdk:24
ADD target/it_support_BackEnd-0.0.1-SNAPSHOT.jar itsupport.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","itsupport.jar"]
