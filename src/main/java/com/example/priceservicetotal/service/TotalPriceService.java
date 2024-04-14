package com.example.priceservicetotal.service;

import com.example.priceservicetotal.dto.TotalPriceServiceRequest;
import com.example.priceservicetotal.dto.TotalPriceServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class TotalPriceService {
    public TotalPriceServiceResponse calculateTotalPrice(TotalPriceServiceRequest totalPriceServiceRequest){
        double discount10Percent = 0.1;
        TotalPriceServiceResponse response=new TotalPriceServiceResponse();
        response.setPaymentId(totalPriceServiceRequest.getPaymentId());
        response.setCartId(totalPriceServiceRequest.getCartId());
        double totalPrice = (totalPriceServiceRequest.getProductCartItems().stream().mapToDouble(tp->tp.getPrice()).sum())*discount10Percent;
        response.setTotalPrice(totalPrice);
        return response;
    }
    public TotalPriceServiceResponse calculateTotalPrice(){
        double discount10Percent = 0.1;
        TotalPriceServiceResponse response=new TotalPriceServiceResponse();
        response.setPaymentId(101);
        response.setCartId(201);
        double totalPrice = 109.3;
        response.setTotalPrice(totalPrice);
        return response;
    }

}
