# Assignment 4 — Restaurant Menu System

## Project Description
This project is a simple restaurant menu system written in Java.  
The main goal of this assignment is to apply **SOLID principles** and **advanced OOP features** in a layered architecture.

The project is based on Assignment 3 and refactored according to Assignment 4 requirements.

---

## Project Architecture
The application follows a layered architecture:


### Layers:
- **Controller** — handles user interaction and calls service methods
- **Service** — contains business logic, validation, and exception handling
- **Repository** — performs CRUD operations with data
- **Model** — represents domain entities

---

## Domain Model
Main classes used in the project:
- `BaseDish` — abstract base class for dishes
- `SecondCourse` — abstract class for second courses
- `Risotto`, `Bolognese` — concrete dish implementations
- `Ingredient` — ingredient of a dish

### Composition
Each dish contains a list of ingredients:


This represents composition in object-oriented programming.

---

## SOLID Principles

### SRP (Single Responsibility Principle)
Each class has only one responsibility:
- Controller — user interaction
- Service — business logic
- Repository — data access
- Model — domain representation

### OCP (Open / Closed Principle)
The system is open for extension and closed for modification.  
New dishes can be added by creating new subclasses without changing existing code.

### LSP (Liskov Substitution Principle)
All subclasses (`Risotto`, `Bolognese`) can be used through the `BaseDish` reference without breaking the program.

### ISP (Interface Segregation Principle)
Small and focused interfaces are used:
- `Validatable`
- `CalorieCalculable`

Classes implement only the interfaces they need.

### DIP (Dependency Inversion Principle)
The service layer depends on repository interfaces (`CrudRepository<T>`) instead of concrete implementations.

---

## Advanced OOP Features

### Abstract Classes
- `BaseDish`
- `SecondCourse`

### Interfaces
- `Validatable` (with default and static methods)
- `CalorieCalculable` (with default and static methods)

### Generics
A generic repository interface is used:


### Lambda Expressions & Streams
- Stream API is used to calculate total calories
- Lambda expressions are used for sorting collections

### Reflection (RTTI)
Reflection is demonstrated using `ReflectionUtils`, which prints:
- Class name
- Fields
- Methods

Reflection is called in `Main.java`.

---

## Exception Handling
Custom exceptions are used in the service layer:
- `InvalidInputException`
- `DuplicateResourceException`
- `ResourceNotFoundException`
- `DatabaseOperationException`

This keeps the controller clean and improves error handling.

---

## Program Execution
The program is started from `Main.java`.

The main method demonstrates:
- Creating ingredients and dishes
- Adding dishes to the system
- Retrieving and sorting dishes
- Validation and exception handling
- Reflection output

---

## What I Learned
While working on this assignment, I learned:
- How to apply SOLID principles in practice
- How to build a layered architecture
- How to use generics, lambdas, and reflection in Java
- How to design clean and maintainable code

---

## Conclusion
This project successfully demonstrates the use of SOLID principles and advanced OOP features in a Java application, as required by Assignment 4.
