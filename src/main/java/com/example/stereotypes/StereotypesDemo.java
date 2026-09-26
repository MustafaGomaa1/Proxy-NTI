package com.example.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Component, @Service, @Repository, @Controller, @RestController,
 *               @ComponentScan, @Configuration
 *
 * Run with: -Dexec.mainClass="com.example.stereotypes.StereotypesDemo"
 */
public class StereotypesDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(StereotypesConfig.class);

        System.out.println("--- Beans found by component scanning ---");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        System.out.println("\n--- Using the beans ---");
        // Note the bean name: "primaryNotifier", from @Component("primaryNotifier")
        EmailNotifier notifier = (EmailNotifier) context.getBean("primaryNotifier");
        notifier.send("Test message");

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(150.0);

        OrderRepository repository = context.getBean(OrderRepository.class);
        repository.save(150.0);

        OrderPageController controller = context.getBean(OrderPageController.class);
        System.out.println("View name returned: " + controller.showOrderPage());

        OrderApiController apiController = context.getBean(OrderApiController.class);
        System.out.println("JSON body returned: " + apiController.getOrderStatus());
    }
}
