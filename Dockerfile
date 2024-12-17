# Use the latest Ubuntu base image
FROM ubuntu:latest

# Add a label (author information)
LABEL authors="G00418325@atu.ie"

# Install necessary tools: OpenJDK 17, Maven, and dependencies
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Set environment variables
ENV APP_HOME=/app
WORKDIR $APP_HOME

# Copy the Maven Wrapper and build files
COPY .mvn .mvn
COPY mvnw mvnw
COPY pom.xml pom.xml

# Download Maven dependencies
RUN ./mvnw dependency:go-offline

# Copy the application source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Verify the JAR file is created (for debugging)
RUN ls -l target/

# Expose port 8080 (default for Spring Boot)
EXPOSE 8080

# Set the entrypoint to start your Spring Boot JAR file
ENTRYPOINT ["java", "-jar", "target/CICDPoject-0.0.1-SNAPSHOT.jar"]
