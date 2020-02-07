FROM openjdk:8-jre-alpine
MAINTAINER leo.yassuda@gmail.com
COPY target/app-stringFormatter.jar /opt/formatter/lib/
#ENTRYPOINT ["/usr/bin/java"]
CMD ["/usr/bin/java", "-jar", "/opt/formatter/lib/app-stringFormatter.jar"]
VOLUME /var/lib/formatter
EXPOSE 8282