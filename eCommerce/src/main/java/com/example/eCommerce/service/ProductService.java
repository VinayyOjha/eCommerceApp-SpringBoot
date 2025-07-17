package com.example.eCommerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eCommerce.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 3000),
            new Product(102, "Mouse", 375),
            new Product(103, "Infinix Laptop", 33300)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p-> p.getProdID() == prodId).findFirst().orElse(new Product(-1, "Product Not Found", 0));
    }

    public void addProduct(Product prod) {
        System.out.print(prod);
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        products.set(getIndex(prod.getProdID()),
            prod);
    }

    public void deleteProduct(int prodId) {
        products.remove(getIndex(prodId));
    }

    private int getIndex(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdID() == prodId) {
                index = i;
            }
        }
        return index;
    }
}
