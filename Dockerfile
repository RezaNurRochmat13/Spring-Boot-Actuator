FROM openjdk:17-jdk-alpine

MAINTAINER kucingngoding.com

COPY target/Actuator-0.0.1-SNAPSHOT Actuator-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar","/Actuator-0.0.1-SNAPSHOT"]