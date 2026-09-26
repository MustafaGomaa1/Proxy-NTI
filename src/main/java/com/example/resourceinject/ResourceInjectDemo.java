package com.example.resourceinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Resource, @Inject
 * Run with: -Dexec.mainClass="com.example.resourceinject.ResourceInjectDemo"
 */
public class ResourceInjectDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(ResourceInjectConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(75.0);

        Car car = context.getBean(Car.class);
        car.drive();
    }
}
