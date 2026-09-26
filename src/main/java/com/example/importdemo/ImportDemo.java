package com.example.importdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Import
 * Run with: -Dexec.mainClass="com.example.importdemo.ImportDemo"
 */
public class ImportDemo {
    public static void main(String[] args) {
        // Only AppConfig is registered directly - DatabaseConfig and SecurityConfig
        // are pulled in transitively via @Import on AppConfig.
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        DataSource dataSource = context.getBean(DataSource.class);
        dataSource.query("SELECT * FROM orders");

        AuthChecker authChecker = context.getBean(AuthChecker.class);
        authChecker.isAuthorized("ali92");
    }
}
