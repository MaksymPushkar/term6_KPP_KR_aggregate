package com.pm.aggregate.repository;

import com.pm.aggregate.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}

