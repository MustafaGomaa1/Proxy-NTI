package com.example.importdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Demonstrates: @Import - pulls in bean definitions from DatabaseConfig and
// SecurityConfig, without needing @ComponentScan to find them.
@Configuration
@Import({ DatabaseConfig.class, SecurityConfig.class })
public class AppConfig {
}
