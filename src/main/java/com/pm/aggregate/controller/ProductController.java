package com.pm.aggregate.controller;

import com.pm.aggregate.entity.Product;
import com.pm.aggregate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aggregate/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Void> addProduct(@RequestBody Product product) {
        productService.addProduct(product);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        productService.updateProduct(id, product);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        productService.deleteProduct(id);

        return ResponseEntity.noContent().build();
    }
}
