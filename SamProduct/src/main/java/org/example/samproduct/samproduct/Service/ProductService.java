package org.example.samproduct.samproduct.Service;

import org.example.samproduct.samproduct.Model.Product;
import org.example.samproduct.samproduct.Repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProductById(int id) {
        return  productRepository.findById(id).orElseThrow();

    }

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
