package com.pm.aggregate.repository;


import com.pm.aggregate.entity.StorageTank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageTankRepository extends JpaRepository<StorageTank, Integer> {
}

