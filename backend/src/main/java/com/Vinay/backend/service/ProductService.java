package com.Vinay.backend.service;

// import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Vinay.backend.model.Product;
import com.Vinay.backend.repository.ProductRepo;

@Service
public class ProductService {

    private final ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageDate(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword){
        return repo.searchProducts(keyword);
    }
}

// ✔ Benefits of using final:
// Thread safety: Once initialized, the reference can’t change — no accidental reassignment.
// Clarity: Makes it obvious this field is a required dependency.
// Constructor enforcement: Ensures that the dependency is initialized when the object is created.
// Easier to reason about: You can be confident that repo will never be null after construction.
// Good practice in dependency injection: Especially with constructor injection (recommended over @Autowired on fields).

