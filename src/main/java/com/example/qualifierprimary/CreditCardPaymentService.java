package com.example.qualifierprimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("creditCardPayment")
@Primary
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
