package org.example.finalproject11.Service;

import org.example.finalproject11.Model.Product;
import org.example.finalproject11.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    public Product getProductById(int id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

}
