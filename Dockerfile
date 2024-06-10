#base image
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
# Copy the JAR file from the build context into the Docker image
COPY build/libs/tracker-0.0.1-SNAPSHOT.jar app.jar
# Set the default command to run the Java application
ENTRYPOINT ["java","-jar","/app.jar"]