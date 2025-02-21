# Product Management Application

A Spring Boot application for managing products with robust error handling and validation.

## Overview

This project demonstrates a simple Spring Boot application that manages a `Product` entity. It includes global exception handling for various scenarios such as product not found errors, array index out-of-bound issues, and input validation failures.

## Features

- **Product Management:** Create, read, update, and delete products.
- **Validation:** Ensures that the product data meets specific constraints.
- **Global Exception Handling:** Provides clear error messages for various exceptions.
- **RESTful API:** Exposes endpoints for interacting with the product data.

## Entity: Product

The `Product` entity represents a product in the system and has the following fields:

- **id:** Unique identifier for the product.
- **name:** Name of the product.
  - Validation: Must not be blank and cannot exceed 4 characters.
- **price:** Price of the product.
  - Validation: Must be greater than or equal to 0.
- **quantity:** Available quantity in stock.
  - Validation: Must be greater than or equal to 0.
- **description:** A short description of the product.
  - Validation: Cannot exceed 255 characters.

### Example Fields in Code

```java
private int id;

@NotBlank(message = "Name cannot be blank")
@Size(max = 4, message = "Name cannot exceed 4 characters")
private String name;

@Min(value = 0, message = "Price must be greater than or equal to 0")
private int price;

@Min(value = 0, message = "Quantity must be greater than or equal to 0")
private int quantity;

@Size(max = 255, message = "Description cannot exceed 255 characters")
private String description;
