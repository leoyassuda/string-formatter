FROM alpine-java:base
MAINTAINER leo.yassuda@gmail.com
COPY target/app-stringFormatter.jar /opt/formatter/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/formatter/lib/app-stringFormatter.jar"]
VOLUME /var/lib/formatter/config-repo
EXPOSE 8282