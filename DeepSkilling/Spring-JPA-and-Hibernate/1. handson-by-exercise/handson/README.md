# 🚀 Spring Data JPA & Hibernate Hands-on Collection

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-success?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

### Complete Spring Data JPA & Hibernate Learning Repository

*A hands-on implementation of Spring Data JPA, Hibernate ORM, MySQL integration, CRUD operations, transaction management, repository abstraction, and enterprise backend development using Spring Boot.*

</div>

---

# 📖 Project Overview

This repository contains a complete collection of **Spring Data JPA and Hibernate Hands-on Exercises** designed to provide practical experience with enterprise Java backend development.

The project starts with the fundamentals of **Object Relational Mapping (ORM)** and gradually progresses toward implementing complete **database-driven CRUD applications** using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**.

Each hands-on exercise focuses on a specific concept, making this repository an excellent reference for students, interview preparation, and enterprise application development.

---

# 🎯 Learning Objectives

This repository demonstrates practical implementation of

- Object Relational Mapping (ORM)
- Hibernate Framework
- Spring Data JPA
- Java Persistence API (JPA)
- Entity Mapping
- Repository Pattern
- Dependency Injection
- Transaction Management
- CRUD Operations
- Query Methods
- MySQL Integration
- Spring Boot Development
- Enterprise Backend Architecture

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Persistence Layer |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Maven | Build & Dependency Management |
| Spring DevTools | Development Support |
| SLF4J Logging | Application Logging |

---

# 📂 Repository Structure

```
Spring-Data-JPA-Handson/

│
├── handson1/
├── handson2/
├── handson3/
├── handson4/
├── handson5/
│
├── README.md
└── pom.xml
```

Each module is self-contained and demonstrates a specific Spring Data JPA or Hibernate concept.

---

# 🚀 Hands-on Exercises

| Hands-on | Topic | Concepts Covered |
|----------|--------------------------|-------------------------------|
| Hands-on 1 | Spring Data JPA Quick Example | Spring Boot, Entity, Repository |
| Hands-on 2 | Hibernate XML Configuration | SessionFactory, Session, Transaction |
| Hands-on 3 | Hibernate Annotation Configuration | Entity Mapping, Hibernate ORM |
| Hands-on 4 | JPA vs Hibernate vs Spring Data JPA | ORM Architecture & Comparison |
| Hands-on 5 | Country Management CRUD | CRUD Operations, Query Methods |

---

# 📚 Hands-on Details

---

## ✅ Hands-on 1 — Spring Data JPA Quick Example

### Objective

Build a Spring Boot application connected to a MySQL database using Spring Data JPA.

### Features

- Spring Boot Project
- Maven Configuration
- MySQL Integration
- Country Entity
- JpaRepository
- Service Layer
- Logging Configuration
- Transaction Management

### Key Concepts

- @SpringBootApplication
- @Entity
- @Table
- @Id
- @Column
- @Repository
- @Service
- @Transactional

---

## ✅ Hands-on 2 — Hibernate XML Configuration

### Objective

Understand Hibernate using XML configuration.

### Concepts Covered

- Hibernate Architecture
- SessionFactory
- Session
- Transaction
- XML Mapping
- Hibernate Configuration File
- Object Relational Mapping

### Operations

- Save
- Update
- Delete
- Retrieve
- Commit
- Rollback

---

## ✅ Hands-on 3 — Hibernate Annotation Configuration

### Objective

Replace XML mapping with annotation-based configuration.

### Features

- @Entity
- @Table
- @Column
- @Id
- @GeneratedValue

### Configuration

- Hibernate Configuration
- MySQL Connection
- Dialect Configuration
- Driver Configuration

---

## ✅ Hands-on 4 — Difference Between JPA, Hibernate & Spring Data JPA

### Objective

Understand how the persistence technologies are related.

### Topics Covered

### Java Persistence API (JPA)

- Persistence Specification
- Standard API
- Vendor Independent

### Hibernate

- ORM Framework
- JPA Implementation
- Database Interaction

### Spring Data JPA

- Repository Abstraction
- Automatic CRUD Methods
- Transaction Management
- Reduced Boilerplate Code

---

## ✅ Hands-on 5 — Country Management System

### Objective

Develop complete CRUD services using Spring Data JPA.

### Features

✔ Add Country

✔ Update Country

✔ Delete Country

✔ Find Country by Code

✔ Search Country by Name

✔ List All Countries

### Repository Methods

- save()
- findById()
- findAll()
- deleteById()
- Query Method Naming

---

# 🏗 Project Architecture

```
Client

      │

      ▼

Controller Layer

      │

      ▼

Service Layer

      │

      ▼

Repository Layer

      │

      ▼

Hibernate

      │

      ▼

MySQL Database
```

---

# 📊 Entity Relationship

```
Country

-------------------------

Code (Primary Key)

Name

-------------------------
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/Spring-Data-JPA-Handson.git
```

---

### Navigate

```bash
cd Spring-Data-JPA-Handson
```

---

### Build

```bash
mvn clean install
```

---

### Run

```bash
mvn spring-boot:run
```

---

# ⚙ Database Configuration

Configure **application.properties**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
```

---

# 🗄 Sample Country Table

| Code | Name |
|------|------|
| IN | India |
| US | United States |
| AU | Australia |
| JP | Japan |
| DE | Germany |

---

# 📌 Spring Data JPA Features Demonstrated

- ORM
- Hibernate
- Spring Boot
- Spring Data JPA
- Repository Pattern
- Entity Mapping
- CRUD Operations
- Query Methods
- Transactions
- Logging
- MySQL Integration
- Dependency Injection
- Layered Architecture

---

# 🎯 Skills Demonstrated

✔ Java

✔ Spring Boot

✔ Spring Data JPA

✔ Hibernate ORM

✔ MySQL

✔ Maven

✔ Repository Pattern

✔ Service Layer

✔ Transaction Management

✔ Object Relational Mapping

✔ Backend Development

✔ Enterprise Application Design

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Build enterprise applications using Spring Boot
- Configure Hibernate with XML and annotations
- Implement JPA repositories
- Connect Spring Boot with MySQL
- Perform CRUD operations using Spring Data JPA
- Manage transactions efficiently
- Map Java objects to relational databases
- Write clean repository-based backend applications

---
