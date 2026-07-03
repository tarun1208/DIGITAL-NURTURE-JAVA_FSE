# 🚀 Java Design Patterns & SOLID Principles

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/Object_Oriented_Programming-blue?style=for-the-badge)
![Design Patterns](https://img.shields.io/badge/Design_Patterns-success?style=for-the-badge)
![SOLID](https://img.shields.io/badge/SOLID_Principles-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)

### Enterprise Java Design Patterns Implementation

*A comprehensive Java project demonstrating the most widely used GoF (Gang of Four) Design Patterns and Software Design Principles through practical, real-world applications. This repository emphasizes clean architecture, maintainable code, reusable components, and object-oriented best practices used in enterprise software development.*

</div>

---

# 📖 Project Overview

This repository demonstrates the implementation of **11 industry-standard Design Patterns** using Java. Each exercise focuses on solving a real-world software engineering problem using an appropriate design pattern while following object-oriented programming principles.

The project is designed to strengthen software design skills, improve code maintainability, reduce coupling, increase flexibility, and prepare developers for enterprise Java development.

It serves as an excellent reference for learning **Design Patterns**, **SOLID Principles**, and **Object-Oriented Design (OOD)** commonly asked in Java backend interviews.

---

# 🎯 Learning Objectives

This project demonstrates practical implementation of

- Object-Oriented Programming (OOP)
- SOLID Principles
- Creational Design Patterns
- Structural Design Patterns
- Behavioral Design Patterns
- Loose Coupling
- High Cohesion
- Reusable Code
- Dependency Injection
- Software Architecture
- Enterprise Application Design
- Clean Code Practices

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Object-Oriented Programming | Software Development |
| Design Patterns | Software Architecture |
| SOLID Principles | Code Quality |
| Maven | Build Tool |
| VS Code / IntelliJ IDEA | Development Environment |

---

# 📂 Repository Structure

```
Java-Design-Patterns/

│
├── Exercise1/
├── Exercise2/
├── Exercise3/
├── Exercise4/
├── Exercise5/
├── Exercise6/
├── Exercise7/
├── Exercise8/
├── Exercise9/
├── Exercise10/
├── Exercise11/
│
├── README.md
└── LICENSE
```

Each exercise is independent and demonstrates one design pattern using a practical example.

---

# 🚀 Design Patterns Implemented

| Exercise | Design Pattern | Category | Real-World Example |
|-----------|----------------|-----------|-------------------|
| Exercise 1 | Singleton | Creational | Logger System |
| Exercise 2 | Factory Method | Creational | Document Creation |
| Exercise 3 | Builder | Creational | Computer Configuration |
| Exercise 4 | Adapter | Structural | Payment Gateway Integration |
| Exercise 5 | Decorator | Structural | Notification System |
| Exercise 6 | Proxy | Structural | Image Loading |
| Exercise 7 | Observer | Behavioral | Stock Market Notifications |
| Exercise 8 | Strategy | Behavioral | Payment Processing |
| Exercise 9 | Command | Behavioral | Remote Control System |
| Exercise 10 | MVC | Architectural | Student Management |
| Exercise 11 | Dependency Injection | Design Principle | Customer Service |

---

# 📚 Exercise Details

---

## ✅ Exercise 1 — Singleton Pattern

### Objective

Ensure only one instance of an object exists throughout the application.

### Example

Logger System

### Features

- Private Constructor
- Static Instance
- Global Access Point
- Lazy Initialization

### Applications

- Logging Frameworks
- Configuration Managers
- Cache Managers

---

## ✅ Exercise 2 — Factory Method Pattern

### Objective

Create objects without exposing object creation logic.

### Example

Document Management System

### Features

- Factory Classes
- Object Creation
- Loose Coupling
- Extensible Design

### Applications

- PDF Generator
- Word Processor
- Excel Document Generator

---

## ✅ Exercise 3 — Builder Pattern

### Objective

Construct complex objects step by step.

### Example

Computer Configuration System

### Features

- Fluent Builder API
- Optional Parameters
- Immutable Object Creation

### Applications

- PC Builder
- Vehicle Builder
- Report Generation

---

## ✅ Exercise 4 — Adapter Pattern

### Objective

Allow incompatible interfaces to work together.

### Example

Payment Gateway Integration

### Features

- Interface Conversion
- Third-Party Integration
- Wrapper Objects

### Applications

- Payment APIs
- Legacy System Integration
- External Services

---

## ✅ Exercise 5 — Decorator Pattern

### Objective

Add responsibilities to objects dynamically.

### Example

Notification System

### Features

- Email Notifications
- SMS Notifications
- Slack Notifications
- Dynamic Feature Addition

### Applications

- Notification Systems
- Logging
- Authentication
- Compression

---

## ✅ Exercise 6 — Proxy Pattern

### Objective

Control access to expensive resources.

### Example

Lazy Image Loading

### Features

- Lazy Initialization
- Caching
- Resource Optimization
- Access Control

### Applications

- Image Loading
- Database Connections
- Security Proxy

---

## ✅ Exercise 7 — Observer Pattern

### Objective

Notify dependent objects automatically when state changes.

### Example

Stock Market Notification System

### Features

- Publish-Subscribe Model
- Multiple Subscribers
- Automatic Updates

### Applications

- Stock Market
- Weather Systems
- Event Notification
- Messaging Applications

---

## ✅ Exercise 8 — Strategy Pattern

### Objective

Encapsulate interchangeable algorithms.

### Example

Payment Processing System

### Features

- Credit Card Payment
- PayPal Payment
- Runtime Strategy Selection

### Applications

- Payment Gateways
- Sorting Algorithms
- Route Planning

---

## ✅ Exercise 9 — Command Pattern

### Objective

Encapsulate requests as objects.

### Example

Remote Control System

### Features

- Commands
- Invoker
- Receiver
- Undo-ready Design

### Applications

- GUI Buttons
- Home Automation
- Task Scheduling

---

## ✅ Exercise 10 — MVC Pattern

### Objective

Separate application into Model, View, and Controller.

### Example

Student Management System

### Components

- Model
- View
- Controller

### Applications

- Spring MVC
- Web Applications
- Desktop Applications

---

## ✅ Exercise 11 — Dependency Injection

### Objective

Achieve loose coupling by injecting dependencies.

### Example

Customer Management System

### Features

- Constructor Injection
- Interface-based Design
- Loose Coupling
- Testability

### Applications

- Spring Framework
- Enterprise Java Applications
- Microservices

---

# 🏗 Software Architecture

```
                Client

                   │

                   ▼

          Design Pattern

                   │

                   ▼

      Business Logic Layer

                   │

                   ▼

         Object Collaboration

                   │

                   ▼

         Reusable Components
```

---

# 🎨 Design Pattern Categories

```
Design Patterns

│

├── Creational

│      ├── Singleton

│      ├── Factory Method

│      └── Builder

│

├── Structural

│      ├── Adapter

│      ├── Decorator

│      └── Proxy

│

└── Behavioral

       ├── Observer

       ├── Strategy

       ├── Command

       └── MVC

+
Dependency Injection
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/tarun1208/DIGITAL-NURTURE-JAVA_FSE/new/main/DeepSkilling.git
```

---

### Navigate

```bash
cd Java-Design-Patterns
```

---

### Compile

```bash
javac Main.java
```

---

### Run

```bash
java Main
```

---

# 🌟 Key Features Demonstrated

- Singleton Pattern
- Factory Method Pattern
- Builder Pattern
- Adapter Pattern
- Decorator Pattern
- Proxy Pattern
- Observer Pattern
- Strategy Pattern
- Command Pattern
- MVC Architecture
- Dependency Injection
- Object-Oriented Programming
- Loose Coupling
- High Cohesion
- Software Reusability

---

# 📌 SOLID Principles Covered

✔ Single Responsibility Principle (SRP)

✔ Open/Closed Principle (OCP)

✔ Liskov Substitution Principle (LSP)

✔ Interface Segregation Principle (ISP)

✔ Dependency Inversion Principle (DIP)

---

# 🎯 Skills Demonstrated

✔ Java

✔ Object-Oriented Programming

✔ Software Design Patterns

✔ SOLID Principles

✔ Dependency Injection

✔ Software Architecture

✔ Design Thinking

✔ Enterprise Development

✔ Code Reusability

✔ Clean Code

✔ Maintainable Software

✔ Maven

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Apply Creational, Structural, and Behavioral Design Patterns
- Design scalable and maintainable software systems
- Implement SOLID Principles effectively
- Reduce code duplication through reusable components
- Build loosely coupled enterprise applications
- Improve extensibility and flexibility of software
- Develop object-oriented solutions for real-world problems
- Prepare for Java backend and software engineering interviews involving design patterns

---
