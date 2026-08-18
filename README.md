# Employee-Address Microservices

A Spring Boot microservices project that manages employee and address information through independent RESTful services.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- MySQL
- Maven
- Hibernate
- Eclipse IDE

## 📌 Microservices

### 1. Employee Service
Manages employee information and provides REST APIs for employee operations.

**Responsibilities:**
- Create employee records
- Retrieve employee details
- Update employee information
- Delete employee records
- Fetch address details associated with an employee

### 2. Address Service
Manages employee address information through REST APIs.

**Responsibilities:**
- Create address records
- Retrieve address details
- Update address information
- Delete address records
- Provide address data to the Employee Service

## 🏗️ Architecture

```text
                 Client
                   |
                   v
           Employee Service
          (Spring Boot REST API)
                   |
                   | REST API
                   v
            Address Service
          (Spring Boot REST API)
                   |
                   v
                MySQL
