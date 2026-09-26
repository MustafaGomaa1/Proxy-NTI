package com.example.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @DependsOn
 * Run with: -Dexec.mainClass="com.example.dependson.DependsOnDemo"
 */
public class DependsOnDemo {
    public static void main(String[] args) {
        System.out.println("Creating context...");
        ApplicationContext context =
            new AnnotationConfigApplicationContext(DependsOnConfig.class);
        // Watch the console: "1. DatabaseInitializer created..." always prints
        // before "2. OrderRepository created...", regardless of component-scan order.
        System.out.println("Context ready.");
    }
}
