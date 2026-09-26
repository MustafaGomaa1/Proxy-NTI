package com.example.resourceinject;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

// Demonstrates: @Resource - resolves by NAME first ("creditCardPayment" matches
// the bean id directly, no @Qualifier needed)
@Service
public class OrderService {

    @Resource(name = "creditCardPayment")
    private PaymentService paymentService;

    public void placeOrder(double amount) {
        System.out.println("[@Resource] Placing order for " + amount);
        paymentService.pay(amount);
    }
}
