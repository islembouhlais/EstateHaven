# Contributing to project

Thank you for your interest in contributing to our project! We value your contributions and look forward to collaborating with you. Please follow the guidelines below to ensure a smooth process.

---

## How to Contribute

### 1. Fork the Repository
1. Go to the project repository on GitHub.
2. Click on the **Fork** button in the top-right corner.
3. Clone your forked repository:
   ```bash
   git clone https://github.com/your-username/MyProjectName.git
   cd MyProjectName

## as backend devloper use should have:
-java version 21.0.2 (work with this java version)
-you should install intellij IDE (do not use vs code)
-install mysql and create db localy 

## Update the application.properties file in the src/main/resources directory:
spring.datasource.url=jdbc:mysql://localhost:3306/(put here db name without brackets)
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>

## run application :
-go to main class and excute the file .
-you will find nothing when you open localhost port 80 ( we did not create controller yet)

