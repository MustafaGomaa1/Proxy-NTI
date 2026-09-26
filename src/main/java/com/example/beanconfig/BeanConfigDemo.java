package com.example.beanconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Bean (name, initMethod, destroyMethod)
 * Run with: -Dexec.mainClass="com.example.beanconfig.BeanConfigDemo"
 */
public class BeanConfigDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context =
            new AnnotationConfigApplicationContext(BeanConfigDemoConfig.class);
        // "ConnectionPool constructed" then "ConnectionPool initialized" already
        // printed above, during context creation.

        PaymentService paymentService = (PaymentService) context.getBean("paymentService");
        paymentService.pay(100.0);

        ConnectionPool pool = (ConnectionPool) context.getBean("connPool"); // note the custom name
        System.out.println("Retrieved bean via custom name 'connPool': " + pool);

        context.close();
        // "ConnectionPool cleaned up" prints here, triggered by destroyMethod
    }
}
