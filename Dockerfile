# 1. Choose a lightweight JDK base image
FROM eclipse-temurin:17-jdk-jammy

# 2. Set a working directory
WORKDIR /app

# 3. Copy the built jar into the image
#    Adjust the wildcard if your JAR name varies
COPY target/*.jar app.jar

# 4. Expose the port your Spring Boot app listens on
EXPOSE 8081

# 5. Define the entrypoint to run the jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
