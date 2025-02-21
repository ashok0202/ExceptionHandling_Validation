package com.jsp.exceptionHandler.repository;

import com.jsp.exceptionHandler.entity.Product;
import com.jsp.exceptionHandler.exception.ProductNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    private static List<Product> products ;

    public ProductRepo(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products .add(products);
    }
    public Product getProductById(int id){
        return products.stream().filter(p -> p.getId() == id)
                .findFirst().orElse(null);
    }
}
