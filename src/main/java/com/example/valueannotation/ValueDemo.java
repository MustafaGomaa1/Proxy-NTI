package com.example.valueannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Value (literal, property placeholder, SpEL), @PropertySource
 * Run with: -Dexec.mainClass="com.example.valueannotation.ValueDemo"
 */
public class ValueDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(ValueConfig.class);

        AppInfo appInfo = context.getBean(AppInfo.class);
        appInfo.printAll();
    }
}
