# 🗄️ Spring JPA & Hibernate – Handson

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data-JPA-success?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![MySQL](https://img.shields.io/badge/SQL-Database-blue?style=for-the-badge)

</p>

---

# 📖 Overview

This repository contains my **hands-on implementation of Spring Data JPA and Hibernate** completed during the **Digital Nurture Java Full Stack Engineering Program**.

The repository is organized into multiple hands-on exercises that progressively introduce Object Relational Mapping (ORM), entity mapping, Spring Data JPA repositories, Hibernate relationships, JPQL, HQL, CRUD operations, and advanced persistence concepts.

These exercises helped me understand how enterprise Java applications interact with relational databases using industry-standard frameworks.

---

# 📂 Repository Structure

```text
Spring-JPA-and-Hibernate
│
├── 1. handson-by-exercise
│   ├── Hands-on 1
│   ├── Hands-on 2
│   ├── Hands-on 3
│   ├── Hands-on 4
│   ├── Hands-on 5
│   ├── Hands-on 6
│   ├── Hands-on 7
│   ├── Hands-on 8
│   ├── Hands-on 9
│   └── README.md
│
├── 2. handson-by-exercise
│   ├── Hands-on 1
│   ├── Hands-on 2
│   ├── Hands-on 3
│   ├── Hands-on 4
│   ├── Hands-on 5
│   ├── Hands-on 6
│   └── README.md
│
└── 3.handson-by-exercise
    ├── Hands-on 1
    ├── Hands-on 2
    ├── Hands-on 3
    ├── Hands-on 4
    ├── Hands-on 5
    └── ...
```

Each exercise demonstrates a specific JPA or Hibernate concept through practical implementation.

---

# 📚 Topics Covered

## 📌 Module 1 – Spring Data JPA Basics

- Entity Mapping
- Repository Interfaces
- CRUD Operations
- Configuration
- ddl-auto
- Service Layer
- Exception Handling

Hands-on exercises include:

- Country Entity
- Country Repository
- Employee Repository
- CRUD Operations
- Add Country
- Update Country
- Delete Country
- Find Country by Code

---

## 📌 Module 2 – Entity Relationships

Practical implementation of

- One-to-One Mapping
- One-to-Many Mapping
- Many-to-One Mapping
- Many-to-Many Mapping

Sample entities include

- Employee
- Department
- Skill
- Stock
- Country

---

## 📌 Module 3 – Advanced JPA

Advanced persistence concepts including

- JPQL
- HQL
- Custom Repository Queries
- Complex Entity Relationships
- Repository Methods
- Attempt / Question Management
- Employee Queries

---

# 🏗 Project Architecture

```text
Controller
      │
      ▼
 Service
      │
      ▼
Repository (JpaRepository)
      │
      ▼
 Hibernate ORM
      │
      ▼
 Relational Database
```

---

# 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Persistence Layer |
| Hibernate | ORM Framework |
| Maven | Dependency Management |
| SQL | Database |
| Git | Version Control |

---

# ⚙️ Prerequisites

Install the following software before running the projects.

- Java 17+
- Maven
- MySQL (or configured database)
- IntelliJ IDEA / Eclipse / VS Code
- Git

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

cd DIGITAL-NURTURE-JAVA_FSE/DeepSkilling/Spring-JPA-and-Hibernate
```

---

# 🔨 Build Project

Navigate to any exercise containing a Maven project.

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

# 💡 Concepts Implemented

✅ Entity Mapping

✅ Spring Data JPA Repository

✅ Hibernate ORM

✅ CRUD Operations

✅ Repository Pattern

✅ Service Layer

✅ JPQL Queries

✅ HQL Queries

✅ Entity Relationships

✅ Lazy Loading

✅ Eager Loading

✅ Transaction Management

✅ Exception Handling

---

# 📈 Skills Demonstrated

- Spring Boot Development
- Spring Data JPA
- Hibernate ORM
- SQL Database Integration
- Entity Relationship Mapping
- Repository Design
- Object-Oriented Programming
- Layered Architecture
- Backend Development
- Clean Code Practices

---

# 🎯 Learning Outcomes

After completing these exercises, I gained practical experience in:

- Mapping Java Objects to Relational Databases
- Developing CRUD Applications using Spring Data JPA
- Managing Entity Relationships
- Writing JPQL & HQL Queries
- Implementing Repository Pattern
- Building Maintainable Persistence Layers
- Applying Hibernate Best Practices

---

# 🌟 Recruiter Highlights

✔ 20+ Hands-on JPA & Hibernate Exercises

✔ Spring Data JPA Repository Implementation

✔ CRUD Application Development

✔ ORM with Hibernate

✔ Entity Relationship Mapping

✔ JPQL & HQL Queries

✔ Layered Spring Boot Architecture

✔ Production-Oriented Backend Development

✔ Enterprise Coding Practices

---

# 🚀 Future Enhancements

- Pagination & Sorting
- Criteria API
- Specifications API
- QueryDSL
- Spring Data Auditing
- Caching
- Docker Support
- Testcontainers
- Flyway Database Migration
- Liquibase

---
