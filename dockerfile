# Use a Java base image
FROM eclipse-temurin:17-jdk
# Set the working directory to /app
WORKDIR /app
# Copy the Spring Boot application JAR file into the Docker image
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
# Expose the port that the Spring Boot application is listening on
EXPOSE 5000
# Run the Spring Boot application when the container starts
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

