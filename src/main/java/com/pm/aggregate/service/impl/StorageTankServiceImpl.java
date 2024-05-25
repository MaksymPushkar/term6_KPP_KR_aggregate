package com.pm.aggregate.service.impl;


import com.pm.aggregate.dto.StorageTankDTO;
import com.pm.aggregate.entity.StorageTank;
import com.pm.aggregate.repository.StorageTankRepository;
import com.pm.aggregate.service.StorageTankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StorageTankServiceImpl implements StorageTankService {
    @Autowired
    private StorageTankRepository storageTankRepository;

    @Override
    public void addStorageTank(StorageTank storageTank) {
        storageTankRepository.save(storageTank);
    }

    @Override
    public List<StorageTank> getStorageTank() {
        return storageTankRepository.findAll();
    }

    @Override
    public void updateStorageTank(Integer id, StorageTank storageTank) {
        storageTankRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid storage tank id" + id));

        storageTank.setId(id);

        storageTankRepository.save(storageTank);
    }

    @Override
    public void updateAmount(Integer id, StorageTankDTO storageTankDTO) {
        StorageTank storageTank = storageTankRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid storage tank id" + id));

        storageTank.setAmount(storageTankDTO.getAmount());

        storageTankRepository.save(storageTank);
    }

    @Override
    public void deleteStorageTank(Integer id) {
        StorageTank storageTank = storageTankRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid storage tank id" + id));

        storageTankRepository.delete(storageTank);
    }
}
