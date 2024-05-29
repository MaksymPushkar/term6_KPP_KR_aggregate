package com.pm.aggregate.service;

import com.pm.aggregate.entity.StorageTankResource;

import java.util.List;

public interface StorageTankResourceService {
    void addStorageTankResource(StorageTankResource storageTankResource);

    List<StorageTankResource> getStorageTankResource();

    void updateStorageTankResource(Integer id, StorageTankResource storageTankResource);

    void deleteStorageTankResource(Integer id);

}
