package com.pm.aggregate.service;

import com.pm.aggregate.dto.StorageTankDTO;
import com.pm.aggregate.entity.StorageTank;

import java.util.List;

public interface StorageTankService {
    void addStorageTank(StorageTank storageTank);

    List<StorageTank> getStorageTank();

    void updateStorageTank(Integer id, StorageTank storageTank);

    void updateAmount(Integer id, StorageTankDTO storageTankDTO);

    void deleteStorageTank(Integer id);

}
