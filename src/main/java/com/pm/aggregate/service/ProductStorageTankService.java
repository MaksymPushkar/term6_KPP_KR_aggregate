package com.pm.aggregate.service;

import com.pm.aggregate.entity.ProductStorageTank;

import java.util.List;
public interface ProductStorageTankService {
    void addProductStorageTank(ProductStorageTank product);

    List<ProductStorageTank> getProductStorageTank();

    void updateProductStorageTank(Integer id, ProductStorageTank product);

    void deleteProductStorageTank(Integer id);

}
