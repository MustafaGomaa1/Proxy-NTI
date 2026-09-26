package com.example.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Autowired - constructor, field, and setter injection,
 *               plus required = false for an optional dependency
 *
 * Run with: -Dexec.mainClass="com.example.autowired.AutowiredDemo"
 */
public class AutowiredDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AutowiredConfig.class);

        Car car = context.getBean(Car.class);
        car.drive();
    }
}
