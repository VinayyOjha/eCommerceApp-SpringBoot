package com.example.eCommerce.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.eCommerce.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(101, "Iphone", 3000),
        new Product(102, "Mouse", 375),
        new Product(103, "Laptop", 33300)
        );

    public List<Product> getProducts(){
        return products;
    }
}
