package com.pm.aggregate.service.impl;

import com.pm.aggregate.entity.ProductStorageTank;
import com.pm.aggregate.repository.ProductStorageTankRepository;
import com.pm.aggregate.service.ProductStorageTankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class ProductStorageTankServiceImpl implements ProductStorageTankService {
    @Autowired
    private ProductStorageTankRepository productStorageTankRepository;

    @Override
    public void addProductStorageTank(ProductStorageTank productStorageTank) {
        productStorageTankRepository.save(productStorageTank);
    }

    @Override
    public List<ProductStorageTank> getProductStorageTank() {
        return productStorageTankRepository.findAll();
    }

    @Override
    public void updateProductStorageTank(Integer id, ProductStorageTank productStorageTank) {
        productStorageTankRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid product storage tank id" + id));

        productStorageTank.setId(id);

        productStorageTankRepository.save(productStorageTank);
    }

    @Override
    public void deleteProductStorageTank(Integer id) {
        ProductStorageTank productStorageTank = productStorageTankRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid product storage tank id" + id));

        productStorageTankRepository.delete(productStorageTank);
    }
}
