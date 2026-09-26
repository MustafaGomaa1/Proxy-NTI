package com.example.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

// Demonstrates: @DependsOn - forces DatabaseInitializer to be created first,
// even though OrderRepository never references it directly in Java code.
@Component
@DependsOn("databaseInitializer")
public class OrderRepository {
    public OrderRepository() {
        System.out.println("2. OrderRepository created — assumes the database is already set up");
    }
}
