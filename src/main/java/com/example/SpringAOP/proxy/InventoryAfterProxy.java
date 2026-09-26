package com.example.SpringAOP.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

public class InventoryAfterProxy implements AfterReturningAdvice {

    @Override
    public void afterReturning(@Nullable Object arg0, Method arg1, Object[] arg2, @Nullable Object arg3)
            throws Throwable {
        System.out.println("Log:After Return Advice Proxy.");
    }

}
