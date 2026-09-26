package com.example.importdemo;

public class AuthChecker {
    public AuthChecker() {
        System.out.println("AuthChecker created (from SecurityConfig)");
    }

    public boolean isAuthorized(String user) {
        System.out.println("Checking authorization for " + user);
        return true;
    }
}
