# Furniture Inventory Management System

A RESTful backend application for managing furniture inventory, built with Spring Boot and MySQL.

## Tech Stack

- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Features

- Create furniture products
- Retrieve all products
- Store product data in MySQL
- RESTful API architecture

## API Endpoints

### Get All Products

```http
GET /products
```

Returns all furniture products stored in the database.

### Create Product

```http
POST /products
```

Example request body:

```json
{
  "sku": "CHAIR-001",
  "name": "Oak Dining Chair",
  "category": "Chair",
  "price": 249.99,
  "stockQuantity": 15
}
```

Example response:

```json
{
  "id": 1,
  "sku": "CHAIR-001",
  "name": "Oak Dining Chair",
  "category": "Chair",
  "price": 249.99,
  "stockQuantity": 15
}
```

## Architecture

The application follows a layered architecture:

```text
Client / Postman
       ↓
ProductController
       ↓
ProductService
       ↓
ProductRepository
       ↓
Spring Data JPA / Hibernate
       ↓
MySQL
```

## Current Progress

- [x] Spring Boot project setup
- [x] MySQL database connection
- [x] Product entity
- [x] Product repository
- [x] Product service
- [x] Product controller
- [x] GET `/products`
- [x] POST `/products`
- [x] GET product by ID
- [x] Update product
- [x] Delete product
- [x] Validation
- [x] Exception handling
- [ ] Automated tests