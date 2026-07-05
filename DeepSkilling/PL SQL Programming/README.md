# 🚀 Oracle PL/SQL Programming – Banking & Employee Management System

<div align="center">

![Oracle](https://img.shields.io/badge/Oracle-Database-F80000?style=for-the-badge&logo=oracle)
![PLSQL](https://img.shields.io/badge/PLSQL-Programming-blue?style=for-the-badge)
![SQL](https://img.shields.io/badge/SQL-Database-orange?style=for-the-badge)
![Database](https://img.shields.io/badge/Relational-Database-success?style=for-the-badge)
![VS Code](https://img.shields.io/badge/VS_Code-Editor-007ACC?style=for-the-badge&logo=visualstudiocode)

### Enterprise PL/SQL Programming using Oracle Database

*A comprehensive collection of Oracle PL/SQL programming exercises demonstrating procedural programming, stored procedures, functions, cursors, triggers, packages, exception handling, and database automation through real-world Banking and Employee Management scenarios.*

</div>

---

# 📖 Project Overview

This repository demonstrates the core and advanced features of **Oracle PL/SQL** through a series of hands-on exercises based on real-world business scenarios.

The project focuses on building enterprise-level database logic for banking and employee management systems using PL/SQL blocks, procedures, functions, triggers, cursors, packages, and exception handling. Each exercise highlights practical database programming techniques commonly used in financial and enterprise applications.

---

# 🎯 Learning Objectives

This project demonstrates practical implementation of

- PL/SQL Programming
- Anonymous PL/SQL Blocks
- Variables and Control Statements
- Conditional Logic
- Loops
- Stored Procedures
- Stored Functions
- Exception Handling
- Explicit and Implicit Cursors
- Database Triggers
- Packages
- Package Specifications & Bodies
- Transaction Management
- Oracle Built-in Functions
- Banking System Automation
- Employee Management System
- Database Security & Validation

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| Oracle Database | Relational Database |
| Oracle SQL | Database Queries |
| Oracle PL/SQL | Procedural Programming |
| SQL Developer / VS Code | Database Development |
| DBMS_OUTPUT | Console Output |
| SQL*Plus | Script Execution |

---

# 📂 Repository Structure

```
Oracle-PLSQL-Programming/

│
├── Exercise1/
├── Exercise2/
├── Exercise3/
├── Exercise4/
├── Exercise5/
├── Exercise6/
├── Exercise7/
│
├── Database Scripts
├── Sample Outputs
└── README.md
```

Each exercise demonstrates a different Oracle PL/SQL concept and can be executed independently.

---

# 🚀 Exercises Included

| Exercise | Topic | Concepts Covered |
|----------|-------------------------------|--------------------------------|
| Exercise 1 | PL/SQL Blocks | Variables, IF, LOOP, Business Logic |
| Exercise 2 | Stored Procedures | Parameters, Exception Handling |
| Exercise 3 | Advanced Procedures | Banking Transactions |
| Exercise 4 | Stored Functions | User Defined Functions |
| Exercise 5 | Database Triggers | BEFORE & AFTER Triggers |
| Exercise 6 | Cursors | Explicit & Implicit Cursors |
| Exercise 7 | Packages | Package Specification & Body |

---

# 📚 Exercise Details

---

## ✅ Exercise 1 — Anonymous PL/SQL Blocks

### Objective

Implement business logic using anonymous PL/SQL blocks.

### Banking Scenarios

- Apply interest discounts for senior citizens
- Identify VIP customers based on account balance
- Generate loan due reminders

### Concepts Covered

- Variables
- IF Statement
- FOR LOOP
- UPDATE Statement
- DBMS_OUTPUT
- COMMIT

---

## ✅ Exercise 2 — Stored Procedures

### Objective

Develop reusable database procedures.

### Procedures Implemented

- Safe Fund Transfer
- Employee Salary Update
- Customer Registration

### Features

- Input Parameters
- Business Rules
- Transaction Management
- Exception Handling
- Rollback Operations

---

## ✅ Exercise 3 — Business Process Automation

### Objective

Automate common banking and HR operations.

### Implemented Features

- Monthly Interest Calculation
- Employee Bonus Processing
- Secure Fund Transfer

### Concepts

- Procedures
- Conditional Statements
- Transactions
- Financial Calculations

---

## ✅ Exercise 4 — Stored Functions

### Objective

Create reusable functions for calculations and validations.

### Functions Implemented

- Customer Age Calculator
- Monthly EMI Calculator
- Account Balance Verification

### Concepts

- RETURN Statements
- Function Parameters
- SQL Functions
- Mathematical Operations

---

## ✅ Exercise 5 — Database Triggers

### Objective

Automate database events using triggers.

### Triggers Developed

- Customer Last Modified Trigger
- Transaction Audit Trigger
- Banking Validation Trigger

### Features

- BEFORE Trigger
- AFTER Trigger
- Data Validation
- Automatic Audit Logging
- Business Rule Enforcement

---

## ✅ Exercise 6 — Working with Cursors

### Objective

Retrieve and process multiple rows efficiently.

### Concepts Covered

- Explicit Cursor
- Implicit Cursor
- Cursor Attributes
- Cursor FOR Loop
- Record Processing

---

## ✅ Exercise 7 — Packages

### Objective

Organize related procedures and functions into reusable modules.

### Features

- Package Specification
- Package Body
- Modular Programming
- Reusable Business Logic
- Enterprise Code Organization

---

# 🏗 Project Architecture

```
Client Request

       │

       ▼

PL/SQL Block

       │

       ▼

Procedure / Function

       │

       ▼

Trigger / Cursor

       │

       ▼

Oracle Database

       │

       ▼

Tables
(Customers, Accounts,
Employees, Loans,
Transactions)
```

---

# 🔄 Database Workflow

```
User Request

      │

      ▼

Oracle SQL

      │

      ▼

PL/SQL Engine

      │

      ▼

Stored Procedures

      │

      ▼

Functions

      │

      ▼

Triggers

      │

      ▼

Oracle Database
```

---

# 🗄 Database Modules

### 👥 Customer Management

- Customer Registration
- VIP Customer Identification
- Age Calculation
- Last Modified Tracking

---

### 💳 Banking System

- Account Balance Validation
- Fund Transfer
- Monthly Interest Processing
- Loan Reminder Generation

---

### 👨‍💼 Employee Management

- Salary Increment
- Bonus Processing
- Employee Validation

---

### 📋 Transaction Management

- Deposit Validation
- Withdrawal Validation
- Audit Logging
- Exception Handling

---

# ▶ Running the Scripts

### Open Oracle SQL Developer

Connect to your Oracle Database.

---

### Execute SQL Scripts

```sql
@Exercise1.sql

@Exercise2.sql

@Exercise3.sql

@Exercise4.sql

@Exercise5.sql

@Exercise6.sql

@Exercise7.sql
```

or execute each script manually.

---

# 📌 Database Objects Created

### Tables

- Customers
- Accounts
- Employees
- Loans
- Transactions
- AuditLog

---

### Stored Procedures

- SafeTransferFunds
- UpdateSalary
- AddNewCustomer
- ProcessMonthlyInterest
- UpdateEmployeeBonus
- TransferFunds

---

### Functions

- CalculateAge
- CalculateMonthlyInstallment
- HasSufficientBalance

---

### Triggers

- UpdateCustomerLastModified
- LogTransaction
- CheckTransactionRules

---

### Packages

- Package Specification
- Package Body
- Modular Banking Operations

---

# 🌟 Key Features Demonstrated

- Oracle PL/SQL Programming
- Anonymous Blocks
- Stored Procedures
- Stored Functions
- Triggers
- Packages
- Explicit Cursors
- Implicit Cursors
- Exception Handling
- Transaction Management
- Banking Automation
- Employee Management
- Audit Logging
- Data Validation
- Business Rule Enforcement

---

# 🎯 Skills Demonstrated

✔ Oracle Database

✔ SQL

✔ Oracle PL/SQL

✔ Stored Procedures

✔ Functions

✔ Triggers

✔ Packages

✔ Cursors

✔ Exception Handling

✔ Database Programming

✔ Transaction Management

✔ Database Security

✔ Banking Application Development

✔ Enterprise Database Design

---

# 📈 Learning Outcomes

After completing this project, you will understand how to

- Develop enterprise-grade PL/SQL programs
- Create reusable stored procedures and functions
- Handle runtime exceptions efficiently
- Automate database operations using triggers
- Process multiple records with cursors
- Organize business logic using packages
- Implement secure banking transactions
- Apply transaction management with COMMIT and ROLLBACK
- Build scalable Oracle database applications using industry best practices

---

