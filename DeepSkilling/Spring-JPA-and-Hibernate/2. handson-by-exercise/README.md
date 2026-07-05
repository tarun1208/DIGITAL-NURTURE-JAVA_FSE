# 🚀 Spring Data JPA Advanced ORM & Query Methods

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-success?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

### Advanced Spring Data JPA • Hibernate ORM • Entity Relationships • Query Methods

*A comprehensive hands-on implementation of advanced Spring Data JPA concepts including Query Methods, Entity Relationships, ORM Mapping, Fetch Strategies, Transaction Management, and Enterprise Database Design.*

</div>

---

# 📖 Project Overview

This repository demonstrates advanced **Spring Data JPA** and **Hibernate ORM** concepts through multiple hands-on exercises. It focuses on implementing enterprise-level database operations using repository query methods, object-relational mapping (ORM), and relationship management.

The project progresses from writing dynamic query methods to designing complex relational database mappings using **One-to-Many**, **Many-to-One**, and **Many-to-Many** associations.

It serves as a complete reference for learning Spring Data JPA, Hibernate relationships, and backend persistence architecture.

---

# 🎯 Learning Objectives

This project demonstrates practical implementation of

- Spring Data JPA Query Methods
- Dynamic Query Generation
- Entity Relationships
- Object Relational Mapping (ORM)
- Repository Pattern
- Many-to-One Mapping
- One-to-Many Mapping
- Many-to-Many Mapping
- Fetch Strategies
- Transaction Management
- Hibernate Entity Lifecycle
- CRUD Operations
- MySQL Integration

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Persistence Layer |
| Hibernate ORM | ORM Framework |
| MySQL | Relational Database |
| Maven | Dependency Management |
| SLF4J | Logging |
| JPA Repository | Data Access Layer |

---

# 📂 Repository Structure

```
Spring-Data-JPA-Advanced/

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

Each hands-on project is independent and demonstrates a specific Spring Data JPA concept.

---

# 🚀 Hands-on Modules

| Hands-on | Topic | Concepts Covered |
|----------|----------------------------|--------------------------------|
| Hands-on 1 | Query Methods | Dynamic Repository Queries |
| Hands-on 2 | Stock Analysis Queries | Advanced Filtering & Sorting |
| Hands-on 3 | Entity Mapping | ORM Relationships |
| Hands-on 4 | Many-to-One | Employee–Department Mapping |
| Hands-on 5 | One-to-Many | Department–Employee Mapping |
| Hands-on 6 | Many-to-Many | Employee–Skill Mapping |

---

# 📚 Hands-on Details

---

## ✅ Hands-on 1 — Spring Data JPA Query Methods

### Objective

Implement dynamic query generation using Spring Data JPA repository method naming conventions.

### Features

- Search Countries by Partial Name
- Search Countries by Prefix
- Sort Results Alphabetically
- Dynamic Query Generation
- Repository Query Methods

### Concepts

- findByNameContaining()
- findByNameContainingOrderByNameAsc()
- findByNameStartingWith()

---

## ✅ Hands-on 2 — Advanced Stock Query Methods

### Objective

Perform real-world stock data analysis using Spring Data JPA Query Methods.

### Features

- Retrieve Facebook Stock Data
- Google Stock Price Filtering
- Highest Trading Volume
- Lowest Netflix Prices
- Date-Based Queries
- Sorting
- Top-N Records

### Concepts

- Between Dates
- Greater Than
- Less Than
- Order By
- Top Results
- Filtering

---

## ✅ Hands-on 3 — Hibernate Entity Mapping

### Objective

Design database entities with proper object-relational mapping.

### Entities

- Employee
- Department
- Skill

### Features

- Primary Keys
- Auto Increment IDs
- Entity Mapping
- Repository Creation

---

## ✅ Hands-on 4 — Many-to-One Relationship

### Objective

Implement Many-to-One relationship between Employee and Department.

### Features

- @ManyToOne
- @JoinColumn
- Employee Service
- Department Service
- Add Employee
- Update Employee
- Retrieve Employee with Department

### Relationship

```
Many Employees

        │

        ▼

One Department
```

---

## ✅ Hands-on 5 — One-to-Many Relationship

### Objective

Map one department to multiple employees.

### Features

- @OneToMany
- mappedBy
- FetchType.LAZY
- FetchType.EAGER
- Department Employee List
- LazyInitializationException Handling

### Relationship

```
Department

      │

      ▼

Employee

Employee

Employee

Employee
```

---

## ✅ Hands-on 6 — Many-to-Many Relationship

### Objective

Associate employees with multiple skills.

### Features

- @ManyToMany
- @JoinTable
- Employee Skill Mapping
- Employee Skill Assignment
- FetchType.EAGER
- Join Table Management

### Relationship

```
Employee

   ▲      ▲

   │      │

Employee_Skill

   │      │

   ▼      ▼

Skill
```

---

# 🏗 Project Architecture

```
Presentation Layer

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

# 🔄 Entity Relationship Diagram

```
Department

     │

     │ One

     ▼

Employee

     ▲

     │ Many-to-Many

     ▼

Skill
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/Spring-Data-JPA-Advanced.git
```

---

### Navigate

```bash
cd Spring-Data-JPA-Advanced
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

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# 📌 Spring Data JPA Features Demonstrated

- Dynamic Query Methods
- Repository Pattern
- CRUD Operations
- ORM Mapping
- Entity Relationships
- ManyToOne
- OneToMany
- ManyToMany
- Join Tables
- Lazy Loading
- Eager Loading
- Transaction Management
- MySQL Integration
- Hibernate SQL Generation

---

# 🎯 Skills Demonstrated

✔ Java

✔ Spring Boot

✔ Spring Data JPA

✔ Hibernate ORM

✔ MySQL

✔ Maven

✔ Object Relational Mapping

✔ Entity Relationships

✔ Query Methods

✔ Repository Pattern

✔ Transaction Management

✔ Backend Development

✔ Enterprise Application Design

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Write custom Query Methods using Spring Data JPA
- Implement repository-based CRUD operations
- Design normalized relational databases
- Map Java objects to relational tables
- Manage One-to-One, One-to-Many, Many-to-One, and Many-to-Many relationships
- Configure Fetch Strategies (EAGER & LAZY)
- Handle Hibernate persistence lifecycle
- Build scalable enterprise backend applications using Spring Boot

---

