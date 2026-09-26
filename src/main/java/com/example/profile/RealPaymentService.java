package com.example.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Demonstrates: @Profile - only registered when "prod" is active
@Service
@Profile("prod")
public class RealPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("[REAL] Actually charging " + amount + " (prod profile)");
    }
}
