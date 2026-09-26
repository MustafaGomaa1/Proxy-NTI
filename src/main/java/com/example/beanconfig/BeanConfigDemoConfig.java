package com.example.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Demonstrates: @Bean - with name, initMethod, destroyMethod parameters
@Configuration
public class BeanConfigDemoConfig {

    // Bean name defaults to the method name: "paymentService"
    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

    // Bean name explicitly set via "name", plus init/destroy lifecycle hooks
    @Bean(name = "connPool", initMethod = "init", destroyMethod = "cleanup")
    public ConnectionPool connectionPool() {
        return new ConnectionPool();
    }
}
