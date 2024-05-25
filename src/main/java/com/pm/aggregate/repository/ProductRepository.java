package com.pm.aggregate.repository;

import com.pm.aggregate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

