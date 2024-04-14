package com.example.priceservicetotal.domain;


import lombok.Data;

@Data
public class PriceDetails {

    private long id;
    private long paymentId;
    private long cartId;
    private String cartCategory;
    private double totalPrice;
}
