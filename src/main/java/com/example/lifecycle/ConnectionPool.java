package com.example.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// Demonstrates: @PostConstruct, @PreDestroy
@Component
public class ConnectionPool {

    public ConnectionPool() {
        System.out.println("ConnectionPool constructed (not initialized yet)");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("ConnectionPool initialized (@PostConstruct called)");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("ConnectionPool shut down (@PreDestroy called)");
    }
}
