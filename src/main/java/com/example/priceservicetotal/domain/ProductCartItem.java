package com.example.priceservicetotal.domain;

import lombok.Data;

@Data
public class ProductCartItem {
    private long productId;
    private String productName;
    private String productDescription;
    private double price;
}
