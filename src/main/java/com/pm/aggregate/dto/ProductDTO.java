package com.pm.aggregate.dto;


import lombok.Data;

@Data
public class ProductDTO {
    public Double amount;

    public Double getAmount() {
        return amount;
    }
}