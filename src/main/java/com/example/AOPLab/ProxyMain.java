package com.example.AOPLab;

public class ProxyMain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImp();

        // SecondInterface secondInterface = null;

        // Object proxy = Proxy.newProxyInstance(
        // Car.class.getClassLoader(),
        // new Class[] { UserService.class, SecondInterface.class },
        // new UserServiceProxy(userService, secondInterface));

        // SecondInterface proxy2 = (SecondInterface) Proxy.newProxyInstance(
        // UserService.class.getClassLoader(),
        // new Class[] { SecondInterface.class },
        // new UserServiceProxy(secondInterface));

        // proxy2.test();
        // UserService pricy1 = (UserService) proxy;
        // SecondInterface pricy = (SecondInterface) proxy;
        // System.out.println("\n");
        // pricy1.createUser("Mustafa");
        // System.out.println(proxy.getClass().getName());
        // System.out.println("\n");
        // pricy1.deleteUser();

        // System.out.println("\n");
        // pricy1.showUser("Mustafa", 24, "dummy@test.com");

        // System.out.println("\n");
        // pricy1.deleteUser();

        // System.out.println("\n");
        // pricy.test();
        // PP newPP= new PP();
        // PP proxy = (PP) Proxy.newProxyInstance(new ClassLoader(){},
        // ne ,newPP);
    }

}
