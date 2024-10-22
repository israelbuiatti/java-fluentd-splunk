FROM openjdk:17-jdk
VOLUME /tmp
COPY target/seu-projeto-spring-boot-splunk-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java", "-jar", "/myapp.jar"]