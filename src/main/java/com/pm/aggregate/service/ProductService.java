package com.pm.aggregate.service;

import com.pm.aggregate.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    List<Product> getProduct();

    void updateProduct(Integer id, Product product);

    void deleteProduct(Integer id);

}
