package com.jsp.exceptionHandler.controller;

import com.jsp.exceptionHandler.entity.Product;
import com.jsp.exceptionHandler.exception.ProductNotFoundException;
import com.jsp.exceptionHandler.response.ProductDTO;
import com.jsp.exceptionHandler.service.ProductService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private ModelMapper modelMapper;


    private final ProductService productService;

    @Autowired
    public ProductController(ModelMapper modelMapper, ProductService productService) {
        this.modelMapper = modelMapper;
        this.productService = productService;
    }


    @PostMapping("/product")
    public String addProduct(@Valid @RequestBody Product product) {
        productService.addProduct(product);
        return "add product successfully";
    }


    @GetMapping("/product/{id}")
    public ProductDTO getProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        if(product == null) {
            throw new ProductNotFoundException("Product not found");
        }
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }

}

