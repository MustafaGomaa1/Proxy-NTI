package com.example.AOPLab;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceProxy implements InvocationHandler {

    private final Object target;

    public UserServiceProxy(Object target) {
        this.target = target;
    }

    // @Override
    // public Object invoke(
    // Object proxy,
    // Method method,
    // Object[] args) throws Throwable {

    // if (method.getDeclaringClass() == UserService.class) {
    // return method.invoke(userService, args);
    // }

    // if (method.getDeclaringClass() == SecondInterface.class) {
    // return method.invoke(secondInterface, args);
    // }
    // System.out.println(this.toString());
    // return null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Log:Enter The Method :" + method.getName());
        switch (method.getName()) {
            case "createUser":
                System.out.println("Entered the Create User method :{" + method.getName() +
                        "}");
                break;

            case "deleteUser":
                System.out.println("Entered the Delete User method :{" + method.getName() +
                        "}");
                break;

            case "updateUser":
                System.out.println("Entered the Update User method :{" + method.getName() +
                        "}");
                break;

            case "showUser":
                System.out.println("Entered the Show User method :{" + method.getName() +
                        "}");

            case "test":
                System.out.println("Entered the test method :{" + method.getName() + "}");
                break;
        }
        Object result = method.invoke(target, args);
        System.out.println("Log: End Of The Proxy");
        return result;
    }

}
