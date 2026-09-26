package com.example.valueannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// Demonstrates: @PropertySource, @Value
@Configuration
@ComponentScan(basePackages = "com.example.valueannotation")
@PropertySource("classpath:application.properties")
public class ValueConfig {

    // Required in plain Spring Core (without Spring Boot) for ${...}
    // placeholders in @Value to actually be resolved from @PropertySource files.
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
