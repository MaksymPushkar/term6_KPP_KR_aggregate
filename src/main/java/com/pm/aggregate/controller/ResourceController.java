package com.pm.aggregate.controller;

import com.pm.aggregate.dto.ResourceDTO;
import com.pm.aggregate.entity.Resource;
import com.pm.aggregate.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aggregate/api/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping
    public ResponseEntity<Void> addResource(@RequestBody Resource resource) {
        resourceService.addResource(resource);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Resource> getResource() {
        return resourceService.getResource();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateResource(@PathVariable Integer id, @RequestBody Resource resource) {
        resourceService.updateResource(id, resource);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateAmount(@PathVariable Integer id, @RequestBody ResourceDTO resourceDTO) {
        resourceService.updateAmount(id, resourceDTO);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        resourceService.deleteResource(id);

        return ResponseEntity.noContent().build();
    }
}
