package com.jsp.exceptionHandler.service;

import com.jsp.exceptionHandler.entity.Product;
import com.jsp.exceptionHandler.repository.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    public Product getProduct(int id) {
        return productRepo.getProductById(id);
    }
    public void addProduct(Product product) {
        productRepo.setProducts(product);
    }
}
