package com.example.scopelazy;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println(">>> EagerBean CREATED (eagerly, at context startup)");
    }
}
