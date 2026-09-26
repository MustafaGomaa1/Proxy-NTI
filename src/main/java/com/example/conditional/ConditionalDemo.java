package com.example.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Conditional
 * Run with: -Dexec.mainClass="com.example.conditional.ConditionalDemo"
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("--- Without the system property set ---");
        AnnotationConfigApplicationContext contextWithout =
            new AnnotationConfigApplicationContext(ConditionalConfig.class);
        try {
            contextWithout.getBean(ReportingService.class);
            System.out.println("ReportingService WAS found (unexpected)");
        } catch (Exception e) {
            System.out.println("ReportingService NOT found - condition did not match: "
                + e.getClass().getSimpleName());
        }
        contextWithout.close();

        System.out.println("\n--- With feature.reporting.enabled=true ---");
        System.setProperty("feature.reporting.enabled", "true");
        AnnotationConfigApplicationContext contextWith =
            new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ReportingService reportingService = contextWith.getBean(ReportingService.class);
        reportingService.generateReport();
        contextWith.close();
    }
}
