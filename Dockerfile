#FROM ubuntu:latest
#LABEL authors="softeam2"

#ENTRYPOINT ["top", "-b"]

# Use an official OpenJDK runtime as a parent image
FROM openjdk:22-jdk
#openjdk:22-jdk-alpine


# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file to the container
COPY target/basket-0.0.1-SNAPSHOT.jar /app/basket.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/basket.jar"]