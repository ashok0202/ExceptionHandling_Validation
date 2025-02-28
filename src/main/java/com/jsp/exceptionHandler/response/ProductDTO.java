package com.jsp.exceptionHandler.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private int productid;
    private String productName;
    private int price;
    private int quantity;
    private String description;



}
