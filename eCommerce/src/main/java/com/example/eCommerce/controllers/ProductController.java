package com.example.eCommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.model.Product;
import com.example.eCommerce.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService prodService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
       return prodService.getProducts();
    }
}
