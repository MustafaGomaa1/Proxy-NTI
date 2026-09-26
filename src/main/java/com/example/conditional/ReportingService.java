package com.example.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

// Demonstrates: @Conditional - only registered if OnReportingEnabledCondition matches
@Component
@Conditional(OnReportingEnabledCondition.class)
public class ReportingService {
    public void generateReport() {
        System.out.println("Generating a detailed report...");
    }
}
