package com.example.resourceinject;

import org.springframework.stereotype.Service;

@Service("creditCardPayment")
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
