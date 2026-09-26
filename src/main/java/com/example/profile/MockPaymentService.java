package com.example.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Demonstrates: @Profile - only registered when "dev" is active
@Service
@Profile("dev")
public class MockPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("[MOCK] Pretending to pay " + amount + " (dev profile)");
    }
}
