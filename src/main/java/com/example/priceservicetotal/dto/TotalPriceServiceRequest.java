package com.example.priceservicetotal.dto;

import com.example.priceservicetotal.domain.ProductCartItem;
import lombok.Data;

import java.util.List;

@Data
public class TotalPriceServiceRequest {
    private long cartId;
    private long paymentId;
    private String cartCategory;
    private List<ProductCartItem> productCartItems;
}
