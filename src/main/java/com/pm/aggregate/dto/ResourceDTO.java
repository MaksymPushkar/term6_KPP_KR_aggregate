package com.pm.aggregate.dto;


import lombok.Data;

@Data
public class ResourceDTO {
    public Double amount;

    public Double getAmount() {
        return amount;
    }
}