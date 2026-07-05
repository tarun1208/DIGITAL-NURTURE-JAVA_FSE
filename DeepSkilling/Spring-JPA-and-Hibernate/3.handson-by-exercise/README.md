# 🚀 Spring Data JPA – HQL, JPQL & Advanced Query Techniques

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-success?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

### Advanced Hibernate Query Language (HQL), JPQL, Native SQL & Criteria API

*A complete implementation of advanced Spring Data JPA concepts including HQL, JPQL, Fetch Join Optimization, Aggregate Functions, Native Queries, Criteria API, and Enterprise-Level Database Query Optimization.*

</div>

---

# 📖 Project Overview

This repository demonstrates advanced database querying techniques using **Spring Data JPA** and **Hibernate ORM**. It focuses on writing efficient, object-oriented queries using **HQL (Hibernate Query Language)** and **JPQL (Java Persistence Query Language)** while exploring performance optimization through **Fetch Joins**, **Native SQL Queries**, and **Criteria API**.

The project also showcases fetching complex relational data, aggregate functions, and dynamic query construction commonly used in enterprise backend applications.

---

# 🎯 Learning Objectives

This repository demonstrates practical implementation of

- Hibernate Query Language (HQL)
- Java Persistence Query Language (JPQL)
- Spring Data JPA @Query Annotation
- Fetch Join Optimization
- Aggregate Functions
- Native SQL Queries
- Criteria API
- Dynamic Query Construction
- Query Performance Optimization
- Entity Relationships
- Repository Pattern
- Transaction Management

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Persistence Layer |
| Hibernate ORM | ORM Framework |
| Hibernate Query Language (HQL) | Object-Oriented Querying |
| JPQL | Java Persistence Query Language |
| MySQL | Relational Database |
| Maven | Dependency Management |
| SLF4J | Logging Framework |

---

# 📂 Repository Structure

```
Spring-Data-JPA-HQL/

│
├── handson1/
├── handson2/
├── handson3/
├── handson4/
├── handson5/
├── handson6/
│
├── pom.xml
└── README.md
```

Each module focuses on a specific advanced querying concept and can be executed independently.

---

# 🚀 Hands-on Modules

| Hands-on | Topic | Concepts Covered |
|----------|------------------------------|--------------------------------|
| Hands-on 1 | HQL & JPQL Introduction | Object-Oriented Query Language |
| Hands-on 2 | Permanent Employee Query | Fetch Join & Query Optimization |
| Hands-on 3 | Quiz Attempt Fetching | Multi-Level Entity Fetching |
| Hands-on 4 | Aggregate Functions | AVG(), Parameters, @Query |
| Hands-on 5 | Native SQL Queries | Native Database Queries |
| Hands-on 6 | Criteria API | Dynamic Query Construction |

---

# 📚 Hands-on Details

---

## ✅ Hands-on 1 — Introduction to HQL & JPQL

### Objective

Understand object-oriented database querying using Hibernate and JPA.

### Concepts Covered

- Hibernate Query Language (HQL)
- Java Persistence Query Language (JPQL)
- Differences between HQL and JPQL
- Object-Oriented Querying
- SQL vs HQL

### Features

- SELECT
- UPDATE
- DELETE
- INSERT (HQL Only)

---

## ✅ Hands-on 2 — Fetch Permanent Employees using HQL

### Objective

Retrieve permanent employees along with department and skills using HQL.

### Features

- @Query Annotation
- HQL Queries
- JOIN
- FETCH JOIN
- Repository Methods
- Query Optimization

### Concepts

- Lazy Loading
- Eager Loading
- Fetch Join
- Query Performance
- Eliminating Multiple SQL Queries

---

## ✅ Hands-on 3 — Quiz Attempt Management

### Objective

Fetch complete quiz attempt information using optimized HQL.

### Features

- User Details
- Attempt History
- Questions
- Options
- Correct Answers
- Scores

### Entity Relationships

- User → Attempts
- Attempt → Questions
- Question → Options
- Attempt → Selected Answers

### Skills Demonstrated

- Complex Entity Fetching
- Nested Relationships
- Fetch Join Optimization
- Multi-Level Object Graph Retrieval

---

## ✅ Hands-on 4 — Aggregate Functions using HQL

### Objective

Calculate average employee salary using HQL.

### Features

- AVG()
- WHERE Clause
- Named Parameters
- @Param Annotation

### Aggregate Functions Covered

- AVG()
- COUNT()
- SUM()
- MIN()
- MAX()

---

## ✅ Hands-on 5 — Native SQL Queries

### Objective

Execute raw SQL queries using Spring Data JPA.

### Features

- Native SQL
- @Query(nativeQuery = true)
- Database-Level Queries
- Direct SQL Execution

### Concepts

- Native Query
- SQL Portability
- Performance Considerations

---

## ✅ Hands-on 6 — Criteria API

### Objective

Build dynamic queries programmatically using Criteria API.

### Features

- CriteriaBuilder
- CriteriaQuery
- Root
- Predicate
- TypedQuery

### Real World Example

Dynamic product search filters similar to e-commerce platforms where users filter products by multiple criteria like RAM, Storage, Processor, Operating System, Customer Rating, and Price.

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

Hibernate ORM

      │

      ▼

MySQL Database
```

---

# 🔄 Query Flow

```
Client Request

      │

      ▼

Spring Boot Service

      │

      ▼

Spring Data Repository

      │

      ▼

HQL / JPQL / Native SQL / Criteria API

      │

      ▼

Hibernate ORM

      │

      ▼

MySQL Database
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/Spring-Data-JPA-HQL.git
```

---

### Navigate

```bash
cd Spring-Data-JPA-HQL
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

Configure the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# 📌 Advanced Features Demonstrated

- Hibernate Query Language (HQL)
- Java Persistence Query Language (JPQL)
- Fetch Join
- Lazy Loading
- Eager Loading
- Query Optimization
- Aggregate Functions
- Native SQL
- Criteria API
- Dynamic Query Building
- Repository Pattern
- Transaction Management
- Entity Relationships
- Performance Optimization

---

# 🎯 Skills Demonstrated

✔ Java

✔ Spring Boot

✔ Spring Data JPA

✔ Hibernate ORM

✔ HQL

✔ JPQL

✔ Criteria API

✔ Native SQL

✔ Query Optimization

✔ Fetch Join

✔ MySQL

✔ Maven

✔ Backend Development

✔ Enterprise Application Design

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Write HQL and JPQL queries for object-oriented data retrieval
- Optimize database performance using Fetch Join
- Execute native SQL queries with Spring Data JPA
- Use aggregate functions in HQL
- Build dynamic queries using the Criteria API
- Retrieve complex relational data efficiently
- Improve application performance by minimizing unnecessary database calls
- Develop scalable enterprise backend applications using Hibernate and Spring Data JPA

---
