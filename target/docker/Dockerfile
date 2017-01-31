FROM fujideia/java8-tomcat8
MAINTAINER rodrigoats 

ADD swagger-spring-1.0.0.jar /swagger-spring-1.0.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/swagger-spring-1.0.0.jar"]

