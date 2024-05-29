package com.pm.aggregate.service.impl;


import com.pm.aggregate.entity.StorageTankResource;
import com.pm.aggregate.repository.StorageTankResourceRepository;
import com.pm.aggregate.service.StorageTankResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StorageTankResourceServiceImpl implements StorageTankResourceService {
    @Autowired
    private StorageTankResourceRepository storageTankResourceRepository;

    @Override
    public void addStorageTankResource(StorageTankResource storageTankResource) {
        storageTankResourceRepository.save(storageTankResource);
    }

    @Override
    public List<StorageTankResource> getStorageTankResource() {
        return storageTankResourceRepository.findAll();
    }

    @Override
    public void updateStorageTankResource(Integer id, StorageTankResource storageTankResource) {
        storageTankResourceRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid storage tank resource id" + id));

        storageTankResource.setId(id);

        storageTankResourceRepository.save(storageTankResource);
    }

    @Override
    public void deleteStorageTankResource(Integer id) {
        StorageTankResource storageTankResource = storageTankResourceRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid storage tank resource id" + id));

        storageTankResourceRepository.delete(storageTankResource);
    }
}
