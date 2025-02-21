package com.jsp.exceptionHandler.controller;

import com.jsp.exceptionHandler.entity.Product;
import com.jsp.exceptionHandler.exception.ProductNotFoundException;
import com.jsp.exceptionHandler.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/product")
    public String addProduct(@Valid @RequestBody Product product) {
        productService.addProduct(product);
        return "add product successfully";
    }


    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        if(product == null) {
            throw new ProductNotFoundException("Product not found");
        }
        return product;
    }

}

