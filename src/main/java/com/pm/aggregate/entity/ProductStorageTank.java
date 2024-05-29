package com.pm.aggregate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductStorageTank {
    @Id
    @GeneratedValue
    private Integer id;

    private Double requirementPerUnit;

    private Boolean needHot;

    private Integer productId;

    private Integer storageTankId;

    public void setId(Integer id) {
        this.id = id;
    }
}
