package com.pm.aggregate.controller;

import com.pm.aggregate.entity.ProductStorageTank;
import com.pm.aggregate.service.ProductStorageTankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aggregate/api/productStorageTank")
public class ProductStorageTankController {
    @Autowired
    private ProductStorageTankService productStorageTankService;

    @PostMapping
    public ResponseEntity<Void> addProductStorageTank(@RequestBody ProductStorageTank productStorageTank) {
        productStorageTankService.addProductStorageTank(productStorageTank);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<ProductStorageTank> getProductStorageTank() {
        return productStorageTankService.getProductStorageTank();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProductStorageTank(@PathVariable Integer id, @RequestBody ProductStorageTank productStorageTank) {
        productStorageTankService.updateProductStorageTank(id, productStorageTank);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        productStorageTankService.deleteProductStorageTank(id);

        return ResponseEntity.noContent().build();
    }
}
