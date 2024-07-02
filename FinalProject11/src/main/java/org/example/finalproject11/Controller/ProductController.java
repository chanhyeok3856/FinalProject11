package org.example.finalproject11.Controller;

import org.example.finalproject11.Model.Product;
import org.example.finalproject11.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
@Autowired
   private ProductService productService;

   @PostMapping
   public  Product addProduct(@RequestParam("productName") String productName,
                           @RequestParam("price") int price,
                           @RequestParam("category") String category,
                           @RequestParam("description") String description) {
      Product product = new Product();
      product.setProductName(productName);
      product.setPrice(price);
      product.setCategory(category);
      product.setDescription(description);
      return productService.saveProduct(product);
    }
    @GetMapping
   public Page<Product> getAllProducts(Pageable pageable){
       return productService.getAllProducts(pageable);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
}
