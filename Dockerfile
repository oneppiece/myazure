FROM mcr.microsoft.com/azure-app-service/java:11-java11_stable
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV PORT 80
EXPOSE 80

ENTRYPOINT ["java", "-Dserver.port=80", "-jar", "app.jar"]