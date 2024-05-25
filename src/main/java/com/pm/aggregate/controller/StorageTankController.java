package com.pm.aggregate.controller;

import com.pm.aggregate.dto.StorageTankDTO;
import com.pm.aggregate.entity.StorageTank;
import com.pm.aggregate.service.StorageTankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aggregate/api/storageTank")
public class StorageTankController {
    @Autowired
    private StorageTankService storageTankService;

    @PostMapping
    public ResponseEntity<Void> addStorageTank(@RequestBody StorageTank storageTank) {
        storageTankService.addStorageTank(storageTank);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<StorageTank> getStorageTank() {
        return storageTankService.getStorageTank();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStorageTank(@PathVariable Integer id, @RequestBody StorageTank storageTank) {
        storageTankService.updateStorageTank(id, storageTank);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateAmount(@PathVariable Integer id, @RequestBody StorageTankDTO storageTankDTO) {
        storageTankService.updateAmount(id, storageTankDTO);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        storageTankService.deleteStorageTank(id);

        return ResponseEntity.noContent().build();
    }
}
