package com.example.scopelazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Demonstrates: @Lazy
@Component
@Lazy
public class ReportGenerator {
    public ReportGenerator() {
        System.out.println(">>> ReportGenerator bean CREATED");
    }

    public void generate() {
        System.out.println("Generating report...");
    }
}
