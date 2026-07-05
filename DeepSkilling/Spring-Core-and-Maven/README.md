# 📚 Spring Core & Spring Boot – Maven Exercises Collection

<div align="center">

![Java](https://img.shields.io/badge/Java-8+-orange?style=for-the-badge&logo=openjdk)
![Spring](https://img.shields.io/badge/Spring_Framework-5.x-brightgreen?style=for-the-badge&logo=spring)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-success?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven)
![AOP](https://img.shields.io/badge/Spring-AOP-red?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-lightgrey?style=for-the-badge)

**A complete hands-on implementation of Spring Framework Core concepts using Maven, XML Configuration, Dependency Injection, Annotation-Based Configuration, Spring AOP, and Spring Boot REST APIs.**

</div>

---

# 📖 Project Overview

This repository contains **9 independent Maven projects** developed as part of the **Spring Framework Core learning exercises**.

Each exercise demonstrates an important concept of the Spring ecosystem, beginning with basic bean configuration and progressing toward complete Spring Boot RESTful application development.

The projects are intentionally separated so that every concept can be learned, executed, and understood independently.

This repository serves as

- ✅ Spring Core Practice
- ✅ Maven Project Collection
- ✅ Dependency Injection Examples
- ✅ Spring AOP Examples
- ✅ Spring Boot CRUD REST API
- ✅ Beginner to Intermediate Spring Learning Path

---

# 🎯 Learning Objectives

This repository demonstrates practical implementation of

- Spring IoC Container
- Dependency Injection
- XML Bean Configuration
- Annotation-Based Configuration
- Constructor Injection
- Setter Injection
- Spring AOP
- Aspect-Oriented Programming
- Spring Boot
- RESTful Web Services
- Spring Data JPA
- H2 Database
- Maven Build System

---

# 🛠 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 8+ | Programming Language |
| Spring Core | IoC & Dependency Injection |
| Spring Context | Bean Management |
| Spring AOP | Cross Cutting Concerns |
| Spring Boot | Rapid Application Development |
| Spring Data JPA | Database Access |
| H2 Database | In-Memory Database |
| Maven | Dependency Management |
| AspectJ | AOP Runtime |
| XML Configuration | Bean Configuration |

---

# 📂 Repository Structure

```
Spring-Core-Maven/

│
├── exercise1/
├── exercise2/
├── exercise3/
├── exercise4/
├── exercise5/
├── exercise6/
├── exercise7/
├── exercise8/
└── exercise9/

```

Each folder is an independent Maven project.

---

# 🚀 Exercises Included

| Exercise | Topic | Key Concepts |
|-----------|--------|-------------|
| Exercise 1 | Basic Spring Application | Spring Context, XML Configuration |
| Exercise 2 | Dependency Injection | Setter Injection, IoC |
| Exercise 3 | Spring AOP | Around Advice, Execution Time Logging |
| Exercise 4 | Maven Configuration | Spring Dependencies & Plugins |
| Exercise 5 | Spring IoC Container | Bean Management |
| Exercise 6 | Annotation Configuration | @Service, @Repository, @Autowired |
| Exercise 7 | Constructor & Setter Injection | Multiple Injection Types |
| Exercise 8 | Basic Spring AOP | Before & After Advice |
| Exercise 9 | Spring Boot CRUD | REST API, JPA, H2 Database |

---

# 📚 Detailed Exercise Description

---

## ✅ Exercise 1 — Configuring a Basic Spring Application

### Objective

Create a simple Spring application using XML configuration.

### Concepts

- Spring Container
- Bean Creation
- XML Configuration
- ApplicationContext

### Features

- BookService Bean
- BookRepository Bean
- Spring Context Loading
- Bean Verification

---

## ✅ Exercise 2 — Dependency Injection

### Objective

Implement Setter Dependency Injection.

### Concepts

- IoC Container
- Setter Injection
- Bean Wiring

### Features

- BookService depends on BookRepository
- XML Dependency Configuration
- Book Management Demo

---

## ✅ Exercise 3 — Spring AOP Logging

### Objective

Implement execution time logging using Spring AOP.

### Concepts

- Aspect-Oriented Programming
- Around Advice
- Cross Cutting Concerns

### Features

- LoggingAspect
- Execution Time Measurement
- AspectJ Integration

---

## ✅ Exercise 4 — Maven Configuration

### Objective

Create and configure a Maven project.

### Concepts

- Maven Dependencies
- Compiler Plugin
- Spring Libraries

### Features

- Spring Context
- Spring AOP
- Spring WebMVC

---

## ✅ Exercise 5 — Spring IoC Container

### Objective

Configure centralized bean management.

### Concepts

- IoC
- Bean Lifecycle
- XML Configuration

### Features

- Central Bean Configuration
- Dependency Management

---

## ✅ Exercise 6 — Annotation-Based Configuration

### Objective

Replace XML bean declarations using annotations.

### Concepts

- Component Scan
- Annotation Configuration

### Features

- @Service
- @Repository
- @Autowired

---

## ✅ Exercise 7 — Constructor & Setter Injection

### Objective

Understand different dependency injection techniques.

### Concepts

- Constructor Injection
- Setter Injection

### Features

- Constructor-Based Wiring
- Setter-Based Wiring

---

## ✅ Exercise 8 — Basic Spring AOP

### Objective

Separate logging from business logic.

### Concepts

- Before Advice
- After Advice
- Aspect Configuration

### Features

- LoggingAspect
- Method Interception

---

## ✅ Exercise 9 — Spring Boot REST Application

### Objective

Develop a RESTful CRUD API using Spring Boot.

### Features

- Spring Boot
- REST API
- CRUD Operations
- Spring Data JPA
- H2 Database

### Endpoints

| Method | Endpoint | Description |
|----------|-----------|------------|
| GET | /api/books | Get All Books |
| GET | /api/books/{id} | Get Book by ID |
| POST | /api/books | Create Book |
| PUT | /api/books/{id} | Update Book |
| DELETE | /api/books/{id} | Delete Book |

---

# ▶ Running the Projects

## Exercises 1 – 8

```bash
cd exercise1
mvn compile
mvn exec:java -Dexec.mainClass=com.library.LibraryManagementApplication
```

Replace **exercise1** with any exercise folder.

---

## Exercise 9

```bash
cd exercise9
mvn spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

# 🧪 Test REST API

### Create Book

```bash
curl -X POST http://localhost:8080/api/books \
-H "Content-Type: application/json" \
-d '{"title":"Effective Java","author":"Joshua Bloch","isbn":"9780134685991"}'
```

---

### Get All Books

```bash
curl http://localhost:8080/api/books
```

---

# 💡 Key Spring Concepts Demonstrated

- Spring Framework Architecture
- IoC Container
- Dependency Injection
- Bean Scope
- XML Configuration
- Annotation Configuration
- Component Scanning
- Spring AOP
- AspectJ
- Maven Build Lifecycle
- Spring Boot
- REST APIs
- JPA Repository
- H2 Database
- CRUD Operations

---

# 📈 Skills Demonstrated

✔ Java Programming

✔ Spring Core

✔ Spring Boot

✔ Maven

✔ Dependency Injection

✔ Spring IoC

✔ Spring AOP

✔ RESTful API Development

✔ Spring Data JPA

✔ H2 Database

✔ XML Configuration

✔ Annotation-Based Configuration

✔ Software Architecture

✔ Backend Development

---

# 🎓 Learning Outcomes

After completing these exercises, you will understand how to

- Build Spring applications from scratch
- Configure beans using XML and annotations
- Manage dependencies using IoC
- Implement constructor and setter injection
- Apply Aspect-Oriented Programming
- Develop REST APIs using Spring Boot
- Integrate JPA with H2 Database
- Organize enterprise-grade Maven projects

---


