package com.pm.aggregate.service.impl;


import com.pm.aggregate.dto.ResourceDTO;
import com.pm.aggregate.entity.Resource;
import com.pm.aggregate.repository.ResourceRepository;
import com.pm.aggregate.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public void addResource(Resource resource) {
        resourceRepository.save(resource);
    }

    @Override
    public List<Resource> getResource() {
        return resourceRepository.findAll();
    }

    @Override
    public void updateResource(Integer id, Resource resource) {
        resourceRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid resource id" + id));

        resource.setId(id);

        resourceRepository.save(resource);
    }

    @Override
    public void updateAmount(Integer id, ResourceDTO resourceDTO) {
        Resource resource = resourceRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid resource id" + id));

        resource.setAmount(resourceDTO.getAmount());

        resourceRepository.save(resource);
    }

    @Override
    public void deleteResource(Integer id) {
        Resource resource = resourceRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid resource id" + id));

        resourceRepository.delete(resource);
    }
}
