package com.example.qualifierprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Relies purely on @Primary - no @Qualifier needed here
@Service
public class OrderServiceUsingPrimary {
    private final PaymentService paymentService;

    @Autowired
    public OrderServiceUsingPrimary(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("[Using @Primary] Placing order for " + amount);
        paymentService.pay(amount);
    }
}
