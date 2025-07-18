package com.example.eCommerce.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
@Entity
public class Product {
    
    @Id
    private int prodID;
    private String prodName;
    private int price;
}
