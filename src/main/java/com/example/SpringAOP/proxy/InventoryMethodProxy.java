package com.example.SpringAOP.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InventoryMethodProxy implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        System.out.println("Log:Method Interceptor Start.");
        Object result = arg0.proceed();
        System.out.println("Log:Method Interceptor End.");
        return result;
    }

}
