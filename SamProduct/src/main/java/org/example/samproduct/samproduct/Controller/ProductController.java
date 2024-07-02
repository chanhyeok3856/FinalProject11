package org.example.samproduct.samproduct.Controller;

import org.example.samproduct.samproduct.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }


    // @GetMapping("/SelectProducts")
    // public String selectProducts(Pageable pageable) {
    //     productService.getAllProducts(pageable);
    //     return "product/select_view";
    // }
    //
    // @PostMapping("/AddProduct")
    // public String addProduct(Product product) {
    //     productService.saveProduct(product);
    //     return "/product/insert_view";
    // }
    //
    // @GetMapping("/{id}")
    // public String selectById(@PathVariable int id) {
    //     productService.getProductById(id);
    //     return "/product/select_detail_view";
    // }
    //
    // @DeleteMapping("/{id}")
    // public String deleteProduct(@PathVariable int id) {
    //     productService.deleteProduct(id);
    //     return "index";
    // }
}