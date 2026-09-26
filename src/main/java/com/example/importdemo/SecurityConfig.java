package com.example.importdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
    @Bean
    public AuthChecker authChecker() {
        return new AuthChecker();
    }
}
