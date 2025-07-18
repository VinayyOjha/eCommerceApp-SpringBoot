package com.example.eCommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
