package com.example.qualifierprimary;

import org.springframework.stereotype.Service;

@Service("payPalPayment")
public class PayPalPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
