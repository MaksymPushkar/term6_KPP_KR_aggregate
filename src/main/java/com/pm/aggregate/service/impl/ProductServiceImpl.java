package com.pm.aggregate.service.impl;


import com.pm.aggregate.entity.Product;
import com.pm.aggregate.repository.ProductRepository;
import com.pm.aggregate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        productRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid product id" + id));

        product.setId(id);

        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        Product product = productRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid product id" + id));

        productRepository.delete(product);
    }
}
