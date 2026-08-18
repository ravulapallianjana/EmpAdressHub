# Employee-Address Microservices

A Spring Boot Microservices project developed to manage employee and address information using independent RESTful services.

## 🚀 Project Overview

This project consists of two independent Spring Boot microservices:

- **Employee Service** – Manages employee information.
- **Address Service** – Manages employee address information.

The Employee Service communicates with the Address Service through REST APIs.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- MySQL
- Maven
- Postman
- Git & GitHub

## 🏗️ Architecture

```text
Client
   |
   v
Employee Service
   |
   | REST API
   v
Address Service
   |
   v
MySQL
