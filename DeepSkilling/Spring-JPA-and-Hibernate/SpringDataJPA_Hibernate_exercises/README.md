# 🚀 Employee Management System – Spring Data JPA & Hibernate

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-success?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![H2 Database](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

### Enterprise Employee Management System using Spring Boot, Spring Data JPA & Hibernate

*A comprehensive implementation of enterprise backend development concepts including JPA Entity Mapping, CRUD Operations, Repository Pattern, Query Methods, Pagination, Auditing, Projections, Data Source Configuration, and Hibernate Performance Optimization.*

</div>

---

# 📖 Project Overview

This repository contains a complete **Employee Management System** built using **Spring Boot**, **Spring Data JPA**, and **Hibernate ORM**. The project is organized into **10 hands-on exercises**, each focusing on a core enterprise backend development concept.

The application demonstrates how modern Java backend systems manage employees and departments through efficient object-relational mapping (ORM), RESTful APIs, repository abstraction, auditing, pagination, sorting, and Hibernate-specific optimizations.

This repository is ideal for learning Spring Boot backend development, preparing for Java interviews, and understanding enterprise application architecture.

---

# 🎯 Learning Objectives

This project demonstrates practical implementation of

- Spring Boot Application Development
- Spring Data JPA
- Hibernate ORM
- Entity Relationships
- CRUD Operations
- RESTful APIs
- Repository Pattern
- Custom Query Methods
- Pagination & Sorting
- Entity Auditing
- Projections
- Data Source Configuration
- Hibernate Performance Optimization
- Batch Processing

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Persistence Layer |
| Hibernate ORM | ORM Framework |
| H2 Database | In-Memory Database |
| Spring Web | REST API Development |
| Lombok | Boilerplate Code Reduction |
| Maven | Build & Dependency Management |

---

# 📂 Repository Structure

```
EmployeeManagementSystem/

│
├── exercise1/
├── exercise2/
├── exercise3/
├── exercise4/
├── exercise5/
├── exercise6/
├── exercise7/
├── exercise8/
├── exercise9/
├── exercise10/
│
├── pom.xml
└── README.md
```

Each exercise is self-contained and demonstrates a specific Spring Data JPA or Hibernate concept.

---

# 🚀 Exercises Included

| Exercise | Topic | Concepts Covered |
|----------|----------------------------|--------------------------------|
| Exercise 1 | Spring Boot Project Setup | Spring Boot, H2, Maven |
| Exercise 2 | Entity Creation | Employee & Department Entities |
| Exercise 3 | Repository Layer | JpaRepository, Derived Queries |
| Exercise 4 | CRUD Operations | REST APIs, CRUD |
| Exercise 5 | Query Methods | @Query, Named Queries |
| Exercise 6 | Pagination & Sorting | Pageable, Sort |
| Exercise 7 | Entity Auditing | CreatedDate, ModifiedDate |
| Exercise 8 | Projections | Interface & DTO Projections |
| Exercise 9 | Data Source Configuration | Auto Configuration, Multiple Data Sources |
| Exercise 10 | Hibernate Features | Batch Processing, Performance Tuning |

---

# 📚 Exercise Details

---

## ✅ Exercise 1 — Spring Boot Project Setup

### Objective

Create the Employee Management System using Spring Boot.

### Features

- Spring Boot Initialization
- Maven Configuration
- H2 Database
- Spring Web
- Spring Data JPA
- Lombok Integration

---

## ✅ Exercise 2 — Creating JPA Entities

### Objective

Design the application's data model.

### Entities

- Employee
- Department

### Features

- @Entity
- @Table
- @Id
- @GeneratedValue
- One-to-Many Relationship
- Many-to-One Relationship

---

## ✅ Exercise 3 — Repository Layer

### Objective

Implement data access using Spring Data JPA.

### Features

- JpaRepository
- CRUD Repository
- Derived Query Methods
- Repository Pattern

---

## ✅ Exercise 4 — CRUD Operations

### Objective

Develop RESTful APIs for employee and department management.

### Features

✔ Create Employee

✔ Update Employee

✔ Delete Employee

✔ View Employee

✔ Create Department

✔ Update Department

✔ Delete Department

✔ View Department

---

## ✅ Exercise 5 — Query Methods

### Objective

Implement custom database queries.

### Features

- Derived Query Methods
- @Query Annotation
- Named Queries
- Named Native Queries

---

## ✅ Exercise 6 — Pagination & Sorting

### Objective

Improve large dataset handling.

### Features

- Pageable
- Page
- Sort
- Multi-field Sorting
- Search Optimization

---

## ✅ Exercise 7 — Entity Auditing

### Objective

Track record creation and updates automatically.

### Features

- @CreatedDate
- @LastModifiedDate
- @CreatedBy
- @LastModifiedBy
- Auditing Configuration

---

## ✅ Exercise 8 — Projections

### Objective

Fetch only the required data instead of complete entities.

### Features

- Interface-Based Projection
- DTO Projection
- Constructor Expressions
- @Value Annotation

---

## ✅ Exercise 9 — Data Source Configuration

### Objective

Configure application databases effectively.

### Features

- Auto Configuration
- application.properties
- Multiple Data Sources
- Externalized Configuration

---

## ✅ Exercise 10 — Hibernate-Specific Features

### Objective

Optimize application performance using Hibernate.

### Features

- Hibernate Annotations
- Dialect Configuration
- Batch Processing
- Performance Optimization
- Efficient Database Operations

---

# 🏗 Project Architecture

```
                Client

                   │

                   ▼

          REST Controllers

                   │

                   ▼

             Service Layer

                   │

                   ▼

          Repository Layer

                   │

                   ▼

        Spring Data JPA

                   │

                   ▼

          Hibernate ORM

                   │

                   ▼

            H2 Database
```

---

# 🔄 Entity Relationship

```
Department

   │  One

   │

   ▼

Employee

Employee

Employee

Employee
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/EmployeeManagementSystem.git
```

---

### Navigate

```bash
cd EmployeeManagementSystem
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

Application starts on:

```
http://localhost:8080
```

---

# ⚙ Database Configuration

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
```

---

# 📌 REST API Overview

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /employees | Retrieve all employees |
| GET | /employees/{id} | Retrieve employee by ID |
| POST | /employees | Create employee |
| PUT | /employees/{id} | Update employee |
| DELETE | /employees/{id} | Delete employee |
| GET | /departments | Retrieve all departments |
| POST | /departments | Create department |
| PUT | /departments/{id} | Update department |
| DELETE | /departments/{id} | Delete department |

---

# 🌟 Key Features Demonstrated

- Spring Boot Application Development
- Spring Data JPA Repositories
- Hibernate ORM Mapping
- RESTful API Design
- Entity Relationships
- CRUD Operations
- Custom Query Methods
- Pagination
- Sorting
- Entity Auditing
- DTO & Interface Projections
- Data Source Management
- Batch Processing
- Hibernate Performance Optimization

---

# 🎯 Skills Demonstrated

✔ Java

✔ Spring Boot

✔ Spring Data JPA

✔ Hibernate ORM

✔ REST API Development

✔ Repository Pattern

✔ CRUD Operations

✔ Pagination & Sorting

✔ Entity Auditing

✔ Projections

✔ H2 Database

✔ Maven

✔ Backend Development

✔ Enterprise Application Design

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Build enterprise-grade backend applications using Spring Boot
- Design and map relational entities using JPA and Hibernate
- Develop RESTful CRUD APIs
- Implement repository-based data access
- Create custom queries using Spring Data JPA
- Improve performance with pagination and sorting
- Track entity changes through auditing
- Use projections to optimize data retrieval
- Configure multiple data sources
- Apply Hibernate-specific performance optimizations

---

