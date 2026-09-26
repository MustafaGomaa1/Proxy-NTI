package com.example.stereotypes;

import org.springframework.stereotype.Component;

// Demonstrates: @Component - the generic stereotype
@Component("primaryNotifier") // value parameter sets the bean name explicitly
public class EmailNotifier {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
