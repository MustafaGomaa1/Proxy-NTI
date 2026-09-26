package com.example.scopelazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Scope, @Lazy
 * Run with: -Dexec.mainClass="com.example.scopelazy.ScopeLazyDemo"
 */
public class ScopeLazyDemo {
    public static void main(String[] args) {
        System.out.println("Creating context...");
        ApplicationContext context =
            new AnnotationConfigApplicationContext(ScopeLazyConfig.class);
        // "EagerBean CREATED" already printed above.
        // "ReportGenerator bean CREATED" has NOT printed yet - it's @Lazy.

        System.out.println("\n--- @Scope(\"prototype\") ---");
        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        ShoppingCart cart2 = context.getBean(ShoppingCart.class);
        System.out.println("Same instance? " + (cart1 == cart2)); // false

        System.out.println("\n--- @Lazy ---");
        System.out.println("Requesting ReportGenerator now...");
        ReportGenerator generator = context.getBean(ReportGenerator.class);
        // ONLY NOW does "ReportGenerator bean CREATED" print
        generator.generate();
    }
}
