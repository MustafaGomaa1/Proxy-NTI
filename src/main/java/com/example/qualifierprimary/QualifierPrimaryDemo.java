package com.example.qualifierprimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Qualifier, @Primary
 * Run with: -Dexec.mainClass="com.example.qualifierprimary.QualifierPrimaryDemo"
 */
public class QualifierPrimaryDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(QualifierPrimaryConfig.class);

        OrderServiceUsingPrimary primaryBased = context.getBean(OrderServiceUsingPrimary.class);
        primaryBased.placeOrder(100.0); // resolves to CreditCardPaymentService via @Primary

        OrderServiceUsingQualifier qualifierBased = context.getBean(OrderServiceUsingQualifier.class);
        qualifierBased.placeOrder(200.0); // resolves to PayPalPaymentService via @Qualifier, overriding @Primary
    }
}
