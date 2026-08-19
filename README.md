# Furniture Inventory Management Platform

## Overview

The Furniture Inventory Management Platform is a RESTful backend application designed to manage furniture inventory and product information.

The project follows enterprise Java backend architecture using Spring Boot and demonstrates modern backend development practices including layered architecture, DTO pattern, validation, exception handling, RESTful API design, and compile-time object mapping.

Future development will include authentication, inventory transactions, supplier management, warehouse management, Docker deployment, CI/CD, and cloud hosting.

---

## Technology Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- MapStruct
- Jakarta Bean Validation
- Postman
- Git
- GitHub

---

## Current Features

### Product Management

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product

### API Design

- RESTful API
- HTTP Status Codes
- Layered Architecture
- DTO Pattern

### Data Validation

- Bean Validation
- Request Validation using `@Valid`
- Global Exception Handling

### Object Mapping

- MapStruct
- Compile-time Object Mapping
- `@MappingTarget` Update Mapping
- Java Record Response DTO

### Product Search & Pagination

- Case-insensitive Product Name Search
- Pagination with Configurable Page Size
- Dynamic Sorting by Product Fields
- Ascending and Descending Sort Direction
- Custom Paginated API Response
---

## Project Structure

```text
src
└── main
    └── java
        └── com.allen.furnituremanagement
            ├── controller
            ├── dto
            │   ├── request
            │   └── response
            ├── exception
            ├── mapper
            ├── model
            ├── repository
            └── service
```

---

## REST API

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/products` | Get products with search, pagination, and sorting |
| GET | `/products/{id}` | Get product by ID |
| POST | `/products` | Create a new product |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |

Example:

```http
GET /products?keyword=oak&page=0&size=10&sortBy=price&direction=asc
---

## Roadmap

### Phase 1 ✅ Core Product Management

- Product Management
- RESTful API
- Spring Data JPA
- Bean Validation
- Global Exception Handling
- DTO Pattern
- MapStruct

### Phase 2 🚧 Product Discovery & Querying

- Product Search ✅
- Pagination ✅
- Sorting ✅
- Custom Paginated Response ✅
- Dynamic Filtering

### Phase 3

- Swagger / OpenAPI
- Spring Security
- JWT Authentication
- User & Role Management

### Phase 4

- Supplier Management
- Warehouse Management
- Inventory Transactions

### Phase 5

- Docker
- GitHub Actions
- AWS Deployment
- Unit Testing
- Integration Testing

---

## Project Goals

The goal of this project is to build a maintainable and scalable backend platform by applying software engineering practices commonly used in enterprise Java development.

The project is continuously enhanced through iterative development with a focus on clean architecture, maintainability, and extensibility.
