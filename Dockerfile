# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy all project files
COPY . .

# Go into the 'agent' folder
WORKDIR /app/agent
RUN mvn clean package -DskipTests

# Stage 2: Run the application (Updated to stable version)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built jar file
COPY --from=build /app/agent/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]