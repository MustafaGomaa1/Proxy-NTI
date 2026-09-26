package com.example.beanconfig;

public class ConnectionPool {
    public ConnectionPool() {
        System.out.println("ConnectionPool constructed");
    }

    public void init() {
        System.out.println("ConnectionPool initialized (initMethod called)");
    }

    public void cleanup() {
        System.out.println("ConnectionPool cleaned up (destroyMethod called)");
    }
}
