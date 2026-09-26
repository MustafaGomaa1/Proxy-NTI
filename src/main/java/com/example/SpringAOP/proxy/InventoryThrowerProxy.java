package com.example.SpringAOP.proxy;

import org.springframework.aop.ThrowsAdvice;

public class InventoryThrowerProxy implements ThrowsAdvice {

    public void afterThrowing(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
