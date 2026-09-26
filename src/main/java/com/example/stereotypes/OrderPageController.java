package com.example.stereotypes;

import org.springframework.stereotype.Controller;

// Demonstrates: @Controller - specialization of @Component, marks a Spring MVC controller.
// NOTE: with no Spring MVC / DispatcherServlet on the classpath, this bean is
// registered exactly like any other @Component - it just won't handle real
// HTTP requests without a web layer. Included here to show it's still just a bean.
@Controller
public class OrderPageController {
    public String showOrderPage() {
        return "orderPage"; // a real Spring MVC app would resolve this to a view
    }
}
