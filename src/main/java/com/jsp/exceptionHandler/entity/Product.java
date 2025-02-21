package com.jsp.exceptionHandler.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Product {

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


    public Product() {
        super();
    }

    public Product(int id, String name, int price, int quantity, String description) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

