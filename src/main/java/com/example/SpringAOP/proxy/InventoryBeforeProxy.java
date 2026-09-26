package com.example.SpringAOP.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

public class InventoryBeforeProxy implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, @Nullable Object arg2) throws Throwable {
        System.out.println("Log: Proxy Before Advice Block.");
    }

}
