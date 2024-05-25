package com.pm.aggregate.service;

import com.pm.aggregate.dto.ResourceDTO;
import com.pm.aggregate.entity.Resource;

import java.util.List;

public interface ResourceService {
    void addResource(Resource resource);

    List<Resource> getResource();

    void updateResource(Integer id, Resource resource);

    void updateAmount(Integer id, ResourceDTO resourceDTO);

    void deleteResource(Integer id);

}
