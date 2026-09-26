package com.example.qualifierprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Explicitly overrides @Primary using @Qualifier - picks PayPal instead
@Service
public class OrderServiceUsingQualifier {
    private final PaymentService paymentService;

    @Autowired
    public OrderServiceUsingQualifier(@Qualifier("payPalPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("[Using @Qualifier] Placing order for " + amount);
        paymentService.pay(amount);
    }
}
