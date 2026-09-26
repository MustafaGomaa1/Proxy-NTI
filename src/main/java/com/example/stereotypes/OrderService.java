package com.example.stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Demonstrates: @Service - specialization of @Component, business layer
@Service
public class OrderService {

    private final EmailNotifier notifier;

    @Autowired
    public OrderService(EmailNotifier notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order for " + amount);
        notifier.send("Order of " + amount + " placed");
    }
}
