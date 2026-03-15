# MakeMyTrip Flight Search Automation

## Overview

This project automates the **flight search functionality on the MakeMyTrip website** using **Selenium WebDriver with Java**.
The automation script simulates a real user performing actions such as selecting departure and destination cities, choosing travel dates, and searching for flights.

The project follows the **Page Object Model (POM)** design pattern to improve code maintainability and readability.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* ChromeDriver

---

## Project Structure

```
MMTAutomation
│
├── src/test/java
│   ├── com.BookFlight.pom
│   │      HomePage.java
│   │
│   ├── com.BookFlight.testCases
│   │      TestCases.java
│
├── pom.xml
├── test-output
└── target
```

---

## Test Scenario Automated

The following user flow is automated:

1. Launch the MakeMyTrip website
2. Close the login popup if it appears
3. Select **From City**
4. Select **To City**
5. Select the **travel date**
6. Click the **Search Flights** button
7. Verify that the flight results page loads successfully

---

## Key Features

* Automation of real-world flight search scenario
* Handling of dynamic web elements and auto-suggestion dropdowns
* Use of **XPath locators** for identifying elements
* Test execution using **TestNG framework**
* Structured using **Page Object Model (POM)** for maintainability

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/yourusername/mmt-flight-automation.git
```

2. Open the project in **Eclipse or IntelliJ**

3. Install dependencies using Maven

```
mvn clean install
```

4. Run the TestNG test class

```
TestCases.java
```

---

## Author

Sejal Vijay
