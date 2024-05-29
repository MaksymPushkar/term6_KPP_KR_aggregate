package com.pm.aggregate.controller;

import com.pm.aggregate.entity.StorageTankResource;
import com.pm.aggregate.service.StorageTankResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aggregate/api/storageTankResource")
public class StorageTankResourceController {
    @Autowired
    private StorageTankResourceService storageTankResourceService;

    @PostMapping
    public ResponseEntity<Void> addStorageTankResource(@RequestBody StorageTankResource storageTankResource) {
        storageTankResourceService.addStorageTankResource(storageTankResource);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<StorageTankResource> getStorageTankResource() {
        return storageTankResourceService.getStorageTankResource();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStorageTankResource(@PathVariable Integer id, @RequestBody StorageTankResource storageTankResource) {
        storageTankResourceService.updateStorageTankResource(id, storageTankResource);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        storageTankResourceService.deleteStorageTankResource(id);

        return ResponseEntity.noContent().build();
    }
}
