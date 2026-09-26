package com.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    // 1. Constructor injection
    private final Engine engine;

    // 2. Field injection
    @Autowired
    private Engine fieldInjectedEngine;

    // 3. Optional dependency - no GpsNavigator bean exists, so this stays null
    @Autowired(required = false)
    private GpsNavigator gpsNavigator;

    private Engine setterInjectedEngine; // set via setter injection below

    @Autowired // constructor injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    @Autowired // setter injection
    public void setSetterInjectedEngine(Engine engine) {
        this.setterInjectedEngine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Constructor-injected engine present? " + (engine != null));
        System.out.println("Field-injected engine present? " + (fieldInjectedEngine != null));
        System.out.println("Setter-injected engine present? " + (setterInjectedEngine != null));
        System.out.println("Optional GPS present? " + (gpsNavigator != null) + " (expected: false)");
        System.out.println("Car is driving");
    }
}
