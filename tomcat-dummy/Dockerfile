FROM openjdk:8-jdk-alpine
MAINTAINER arash <anton11131113@gmail.com>
COPY target/tomcat-dummy-0.0.1-SNAPSHOT.jar /var/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/var/lib/tomcat-dummy-0.0.1-SNAPSHOT.jar"]
EXPOSE 4000
