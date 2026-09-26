package com.example.autowired;

// Deliberately NOT annotated with @Component - no bean of this type will ever exist,
// so we can demonstrate @Autowired(required = false) gracefully leaving it null.
public class GpsNavigator {
    public void navigate() {
        System.out.println("Navigating...");
    }
}
