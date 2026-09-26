package com.example.stereotypes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Demonstrates: @Configuration + @ComponentScan
// This ONE annotated class replaces an entire applicationContext.xml file.
@Configuration
@ComponentScan(basePackages = "com.example.stereotypes")
public class StereotypesConfig {
}
