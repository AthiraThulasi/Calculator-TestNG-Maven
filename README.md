# Calculator - TestNG Maven Project

This project demonstrates a Java-based Calculator application with automated test cases using TestNG and Maven. It showcases how to structure a Maven project, execute tests, and generate reports using the Maven Surefire Plugin.

## Tech Stack
- Java
- Maven
- TestNG
- Git & GitHub


## Features
- Basic calculator operations (Add, Subtract, Multiply, Divide)
- Automated test execution using TestNG
- Maven-based project structure
- Test execution using Maven lifecycle
- Test reports generated using Maven Surefire Plugin

## Test Reports
Test execution reports are generated using the Maven Surefire Plugin.
Path:target/surefire-reports/
Includes:
- HTML report
- XML results
- Execution summary


## How to Run ?
mvn clean test

## Through this project, I gained understanding of:

- Importance of standard Maven project structure for scalability and maintainability
- Maven lifecycle phases (validate → compile → test → package → install → deploy)
- Role of pom.xml as the central configuration file managing dependencies and build lifecycle
- Integration of TestNG with Maven for automated test execution
- How Maven Surefire Plugin executes TestNG tests and generates reports
- Version control using Git and pushing code to GitHub using terminal commands


## Test Execution Result

This report shows the successful execution of TestNG test cases with all tests passing.

![Surefire Report](Screenshots/report.png)