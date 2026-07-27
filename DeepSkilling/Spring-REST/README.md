# 🌐 Spring REST – Hands-on Learning Repository

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![Spring REST](https://img.shields.io/badge/Spring-REST_API-success?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![JSON](https://img.shields.io/badge/JSON-Data_Exchange-black?style=for-the-badge)
![Postman](https://img.shields.io/badge/Postman-API_Testing-orange?style=for-the-badge&logo=postman)

</p>

---

# 📖 Overview

This repository contains my **hands-on implementation of Spring RESTful Web Services** completed during the **Digital Nurture Java Full Stack Engineering Program**.

The repository consists of multiple practical exercises that demonstrate how to build scalable REST APIs using **Spring Boot**, following enterprise-level backend development practices. The exercises cover REST principles, HTTP methods, request handling, validation, exception handling, JSON serialization, and layered architecture.

These projects helped me understand how modern backend services communicate with frontend applications and external systems through REST APIs.

---

# 📂 Repository Structure

```text
Spring-REST
│
├── 1. handson-by-exercise
│   ├── Hands-on 1
│   ├── Hands-on 2
│   ├── Hands-on 3
│   ├── Hands-on 4
│   ├── Hands-on 5
│   ├── Hands-on 6
│   ├── Hands-on 7
│   ├── README.md
│
├── 2. handson-by-exercise
│   ├── Hands-on 1
│   ├── Hands-on 2
│   ├── Hands-on 3
│   ├── Hands-on 4
│   ├── Hands-on 5
│   └── README.md
│
└── Additional REST Exercises
```

Each hands-on project focuses on a different aspect of REST API development using Spring Boot.

---

# 🚀 Topics Covered

## 📌 REST API Fundamentals

- REST Architecture
- RESTful Web Services
- Client-Server Communication
- Stateless APIs
- Resource-Based URLs

---

## 📌 HTTP Methods

- GET
- POST
- PUT
- DELETE
- PATCH

---

## 📌 Spring Boot REST

- REST Controllers
- Request Mapping
- Path Variables
- Request Parameters
- Request Body
- Response Body
- ResponseEntity

---

## 📌 JSON Processing

- JSON Serialization
- JSON Deserialization
- Jackson
- Request & Response Objects

---

## 📌 Exception Handling

- Global Exception Handler
- Custom Exceptions
- HTTP Status Codes
- Error Responses

---

## 📌 Validation

- Bean Validation
- Request Validation
- Custom Validation
- Input Constraints

---

# 🏗 Project Architecture

```text
Client / Browser / Postman
            │
            ▼
     REST Controller
            │
            ▼
        Service Layer
            │
            ▼
      Repository Layer
            │
            ▼
         Database
```

---

# 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST API Development |
| Maven | Dependency Management |
| JSON | Data Exchange |
| Postman | API Testing |
| Git | Version Control |

---

# ⚙️ Prerequisites

Before running the projects, install:

- Java 17+
- Maven
- Git
- IntelliJ IDEA / Eclipse / VS Code
- Postman (Optional)

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

cd DIGITAL-NURTURE-JAVA_FSE/DeepSkilling/Spring-REST
```

---

# 🔨 Build Project

Navigate to any exercise folder.

Example

```bash
cd "1. handson-by-exercise"
```

Compile

```bash
mvn compile
```

Package

```bash
mvn package
```

Install

```bash
mvn install
```

---

# ▶ Run Spring Boot Application

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/*.jar
```

---

# 🧪 Run Tests

```bash
mvn test
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

Run Spring Boot

```bash
mvn spring-boot:run
```

---

# 🌐 Sample REST Endpoints

### GET Request

```http
GET /countries
```

---

### GET by ID

```http
GET /countries/{code}
```

---

### POST Request

```http
POST /countries
```

---

### PUT Request

```http
PUT /countries/{code}
```

---

### DELETE Request

```http
DELETE /countries/{code}
```

---

# 📮 API Testing

You can test the REST APIs using:

- Postman
- Browser (GET Requests)
- curl

Example

```bash
curl http://localhost:8080/countries
```

---

# 💡 Concepts Implemented

✅ REST Architecture

✅ REST Controllers

✅ HTTP Methods

✅ Request Mapping

✅ Path Variables

✅ Request Parameters

✅ JSON Request & Response

✅ ResponseEntity

✅ Exception Handling

✅ Bean Validation

✅ Layered Architecture

✅ API Testing

---

# 📈 Skills Demonstrated

- Spring Boot Development
- REST API Design
- Backend Development
- Java Programming
- JSON Processing
- Exception Handling
- API Testing
- Layered Architecture
- Clean Code Practices
- Maven Project Management

---

# 🎯 Learning Outcomes

After completing these exercises, I gained practical experience in:

- Designing RESTful APIs
- Building backend services using Spring Boot
- Handling HTTP requests and responses
- Validating client input
- Returning structured JSON responses
- Managing exceptions effectively
- Following enterprise REST API development standards

---

# 🌟 Recruiter Highlights

✔ 15+ Hands-on Spring REST Exercises

✔ RESTful API Development

✔ Spring Boot Backend Projects

✔ HTTP Methods Implementation

✔ JSON Request & Response Handling

✔ Layered Architecture

✔ Exception Handling & Validation

✔ API Testing with Postman

✔ Enterprise Backend Development Practices

---

# 🚀 Future Enhancements

- Spring Security
- JWT Authentication
- Swagger / OpenAPI Documentation
- Pagination & Sorting
- API Versioning
- Docker
- Kubernetes
- OAuth2 Integration
- Spring Cloud Gateway
- CI/CD Integration

---
sider giving it a **Star ⭐**.

This repository represents my practical learning journey in **Spring REST**, where I developed multiple hands-on projects covering RESTful web services, HTTP methods, JSON processing, exception handling, validation, and enterprise backend development using Spring Boot.
