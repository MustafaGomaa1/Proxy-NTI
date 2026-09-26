package com.example.dependson;

import org.springframework.stereotype.Component;

@Component("databaseInitializer")
public class DatabaseInitializer {
    public DatabaseInitializer() {
        System.out.println("1. DatabaseInitializer created — setting up database schema...");
    }
}
