package com.example.SpringAOP;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.example.SpringAOP.proxy.InventoryAfterProxy;
import com.example.SpringAOP.proxy.InventoryBeforeProxy;
import com.example.SpringAOP.proxy.InventoryMethodProxy;
import com.example.SpringAOP.proxy.InventoryThrowerProxy;

public class SpringAOPMain {

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryServiceImp();
        ProxyFactory factory = new ProxyFactory(inventoryService);
        factory.addAdvice(new InventoryMethodProxy());
        factory.addAdvice(new InventoryAfterProxy());
        factory.addAdvice(new InventoryBeforeProxy());
        factory.addAdvice(new InventoryThrowerProxy());

        InventoryService proxy = (InventoryService) factory.getProxy();
        proxy.inventoryCheck("Apple");
        System.out.println("\n\n");
        proxy.reserveStock("Samsung", 50);
        System.out.println("\n\n");
        proxy.reserveStock("Xiaomi", 1000);
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.addMethodName("inventoryCheck");

        Advisor advice = new DefaultPointcutAdvisor(pointcut, new InventoryMethodProxy());

        ProxyFactory factory1 = new ProxyFactory(inventoryService);
        factory1.addAdvisor(advice);
        InventoryService proxy1 = (InventoryService) factory1.getProxy();
        proxy1.inventoryCheck("Apple");
        proxy1.reserveStock("Samsung", 50);

    }
}
