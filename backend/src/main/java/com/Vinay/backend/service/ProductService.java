package com.Vinay.backend.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vinay.backend.model.Product;

import java.util.List;

import com.Vinay.backend.repository.ProductRepo;

@Service
public class ProductService {
    private final ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }
}

// ✔ Benefits of using final:
// Thread safety: Once initialized, the reference can’t change — no accidental reassignment.

// Clarity: Makes it obvious this field is a required dependency.

// Constructor enforcement: Ensures that the dependency is initialized when the object is created.

// Easier to reason about: You can be confident that repo will never be null after construction.

// Good practice in dependency injection: Especially with constructor injection (recommended over @Autowired on fields).

