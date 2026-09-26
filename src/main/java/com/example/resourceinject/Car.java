package com.example.resourceinject;

import jakarta.inject.Inject;
import org.springframework.stereotype.Component;

// Demonstrates: @Inject - JSR-330 standard equivalent of @Autowired.
// Resolves by type, same as @Autowired, but has no "required" parameter.
@Component
public class Car {

    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is driving (Engine injected via @Inject)");
    }
}
