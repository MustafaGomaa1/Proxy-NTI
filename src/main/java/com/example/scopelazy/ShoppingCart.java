package com.example.scopelazy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Demonstrates: @Scope
@Component
@Scope("prototype")
public class ShoppingCart {
}
