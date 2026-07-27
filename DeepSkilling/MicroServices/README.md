# 🚀 MicroServices – Spring Boot & Spring Cloud Learning Repository

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2023-green?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)
![Eureka](https://img.shields.io/badge/Netflix-Eureka-purple?style=for-the-badge)

</p>

---

# 📖 Overview

This folder contains my hands-on implementation of **Enterprise Microservices Architecture** using **Spring Boot**, **Spring Cloud**, and **Netflix Eureka** as part of the **Digital Nurture Java Full Stack Engineering Program**.

Instead of developing a monolithic application, these exercises demonstrate how enterprise applications are split into **small, independent services** that communicate through REST APIs while remaining scalable, maintainable, and loosely coupled.

The repository covers:

- Spring Boot Microservices
- Spring Cloud
- API Gateway
- Eureka Discovery Server
- REST API Development
- Inter-Service Communication
- Distributed Architecture

---

# 📂 Folder Structure

```text
MicroServices
│
├── microservices
│
├── microservices2
│
├── microservices-api-gateway
│   ├── account
│   ├── loan
│   ├── greet-service
│   ├── api-gateway
│   ├── composite-service
│   ├── eureka-discovery-server
│   └── README.md
│
└── microservices-exercises
```

Each folder focuses on a different microservice concept and can be executed independently.

---

# 🏗 Architecture

```text
                  Client
                     │
                     ▼
              API Gateway (9090)
                     │
      ┌──────────────┼──────────────┐
      ▼              ▼              ▼
 Account Service   Loan Service   Greet Service
      │
      └──────────────┬──────────────┘
                     ▼
         Eureka Discovery Server (8761)
```

---

# 📚 Modules Included

## 📌 microservices

Practice exercises demonstrating the fundamentals of Spring Boot microservice development.

---

## 📌 microservices2

Additional microservice implementations covering REST APIs and enterprise backend development.

---

## 📌 microservices-api-gateway

Complete Spring Cloud implementation consisting of:

- Eureka Discovery Server
- API Gateway
- Account Service
- Loan Service
- Composite Service
- Greet Service

This module demonstrates service discovery, routing, and inter-service communication.

---

## 📌 microservices-exercises

Additional practical exercises covering Spring Cloud and Microservices concepts.

---

# 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Backend Development |
| Spring Cloud | Distributed Systems |
| Netflix Eureka | Service Discovery |
| Spring Cloud Gateway | API Gateway |
| Maven | Build Automation |
| REST APIs | Service Communication |
| JSON | Data Exchange |
| Git | Version Control |

---

# ⚙ Prerequisites

Install the following software before running the projects.

- Java 17+
- Maven 3.8+
- Git
- IntelliJ IDEA / Eclipse / VS Code

Verify installation

```bash
java -version

mvn -version

git --version
```

---

# 📥 Clone Repository

```bash
git clone https://github.com/tarun1208/DIGITAL-NURTURE-JAVA_FSE.git

cd DIGITAL-NURTURE-JAVA_FSE/DeepSkilling/MicroServices
```

---

# 🔨 Build Project

Each project is an independent Maven project.

Example:

```bash
cd microservices

mvn clean install
```

or

```bash
cd microservices-api-gateway/account

mvn clean install
```

---

# ▶ Run Spring Boot Applications

Start any module using

```bash
mvn spring-boot:run
```

or package first

```bash
mvn clean package

java -jar target/*.jar
```

---

# 📋 Common Maven Commands

Compile

```bash
mvn compile
```

Run Tests

```bash
mvn test
```

Package

```bash
mvn package
```

Install

```bash
mvn install
```

Clean

```bash
mvn clean
```

Spring Boot Run

```bash
mvn spring-boot:run
```

---

# 🌐 API Gateway Project

The `microservices-api-gateway` module contains six independent Spring Boot applications.

| Service | Port | Description |
|----------|------|-------------|
| Eureka Discovery Server | **8761** | Service Registry |
| Account Service | **8080** | Account Details API |
| Loan Service | **8081** | Loan Details API |
| Greet Service | **8080** | Greeting Service |
| API Gateway | **9090** | Request Routing |
| Composite Service | Configurable | Combines multiple services |

> **Note:** `account` and `greet-service` both use **8080** by default. Run only one at a time or change the port.

---

# ▶ Recommended Startup Order

Start the services in the following order.

### 1️⃣ Eureka Discovery Server

```bash
cd eureka-discovery-server

mvn spring-boot:run
```

---

### 2️⃣ Account Service

```bash
cd account

mvn spring-boot:run
```

---

### 3️⃣ Loan Service

```bash
cd loan

mvn spring-boot:run
```

---

### 4️⃣ Greet Service

```bash
cd greet-service

mvn spring-boot:run
```

---

### 5️⃣ API Gateway

```bash
cd api-gateway

mvn spring-boot:run
```

---

# 🔍 Verify Eureka Registration

Open

```
http://localhost:8761
```

Registered services should include

- ACCOUNT-SERVICE
- LOAN-SERVICE
- GREET-SERVICE
- API-GATEWAY

---

# 🧪 Test APIs

### Direct Service Calls

Account Service

```bash
curl http://localhost:8080/accounts/00987987973432
```

Loan Service

```bash
curl http://localhost:8081/loans/H00987987972342
```

Greeting Service

```bash
curl http://localhost:8080/greet
```

---

### Through API Gateway

```bash
curl http://localhost:9090/account-service/accounts/00987987973432
```

```bash
curl http://localhost:9090/loan-service/loans/H00987987972342
```

```bash
curl http://localhost:9090/greet-service/greet
```

---

# 📈 Skills Demonstrated

- Enterprise Java Development
- Spring Boot
- Spring Cloud
- Microservices Architecture
- API Gateway
- Eureka Discovery
- REST API Development
- Service-to-Service Communication
- Maven Build Management
- Distributed Systems
- Backend Development

---

# 🎯 Learning Outcomes

Through these projects, I gained practical experience in:

- Designing distributed applications
- Building RESTful microservices
- Configuring API Gateway
- Registering services with Eureka
- Developing scalable backend systems
- Managing multiple Spring Boot applications
- Following enterprise development practices

---

# 🌟 Recruiter Highlights

✔ Enterprise Spring Boot Projects

✔ Practical Spring Cloud Experience

✔ API Gateway Implementation

✔ Netflix Eureka Service Discovery

✔ REST API Development

✔ Distributed System Design

✔ Maven Multi-Module Projects

✔ Production-Oriented Project Structure

✔ Clean Code & Layered Architecture

---

# 🚀 Future Enhancements

- OpenFeign Client
- Spring Cloud Config Server
- Docker
- Kubernetes
- Kafka Messaging
- JWT Authentication
- Resilience4j Circuit Breaker
- Prometheus & Grafana Monitoring

---
