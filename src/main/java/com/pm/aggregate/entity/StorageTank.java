package com.pm.aggregate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StorageTank {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double amount;
    private Double maxAmount;
    private Boolean heating;
    private Boolean mixer;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}