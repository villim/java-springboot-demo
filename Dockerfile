FROM amazoncorretto:11-alpine
VOLUME /tmp
# ARG JAR_FILE
# COPY ${JAR_FILE} app.jar
COPY build/libs/*.jar app.jar
EXPOSE 6060
ENTRYPOINT ["java","-jar","/app.jar"]