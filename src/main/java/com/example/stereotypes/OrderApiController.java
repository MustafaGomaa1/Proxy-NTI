package com.example.stereotypes;

import org.springframework.web.bind.annotation.RestController;

// Demonstrates: @RestController - @Controller + @ResponseBody combined.
// Same note as @Controller: no real HTTP handling without Spring MVC's
// DispatcherServlet, but the bean itself registers and behaves normally.
@RestController
public class OrderApiController {
    public String getOrderStatus() {
        return "{\"status\":\"CONFIRMED\"}";
    }
}
