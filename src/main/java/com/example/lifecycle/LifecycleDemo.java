package com.example.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @PostConstruct, @PreDestroy
 * Run with: -Dexec.mainClass="com.example.lifecycle.LifecycleDemo"
 */
public class LifecycleDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context =
            new AnnotationConfigApplicationContext(LifecycleConfig.class);

        System.out.println("Context is up and running.");

        context.close();
        // "ConnectionPool shut down" only prints because we called close() explicitly.
    }
}
