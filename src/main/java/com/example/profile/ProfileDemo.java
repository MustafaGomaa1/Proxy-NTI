package com.example.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Profile
 *
 * NOTE: without Spring Boot, you activate a profile by setting it on the
 * context's Environment BEFORE calling refresh() - there's no
 * "application.properties: spring.profiles.active=..." shortcut here,
 * since that convenience is a Spring Boot feature, not plain Spring Core.
 *
 * Run with: -Dexec.mainClass="com.example.profile.ProfileDemo"
 */
public class ProfileDemo {
    public static void main(String[] args) {
        System.out.println("--- Activating 'dev' profile ---");
        AnnotationConfigApplicationContext devContext = new AnnotationConfigApplicationContext();
        devContext.getEnvironment().setActiveProfiles("dev");
        devContext.register(ProfileConfig.class);
        devContext.refresh();

        PaymentService devPaymentService = devContext.getBean(PaymentService.class);
        devPaymentService.pay(50.0);
        System.out.println("Resolved to: " + devPaymentService.getClass().getSimpleName());
        devContext.close();

        System.out.println("\n--- Activating 'prod' profile ---");
        AnnotationConfigApplicationContext prodContext = new AnnotationConfigApplicationContext();
        prodContext.getEnvironment().setActiveProfiles("prod");
        prodContext.register(ProfileConfig.class);
        prodContext.refresh();

        PaymentService prodPaymentService = prodContext.getBean(PaymentService.class);
        prodPaymentService.pay(50.0);
        System.out.println("Resolved to: " + prodPaymentService.getClass().getSimpleName());
        prodContext.close();
    }
}
