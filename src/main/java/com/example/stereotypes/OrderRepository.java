package com.example.stereotypes;

import org.springframework.stereotype.Repository;

// Demonstrates: @Repository - specialization of @Component, data access layer.
// (Automatic exception translation also applies here, but requires a real
// PersistenceExceptionTranslationPostProcessor + a JDBC/ORM setup to observe -
// omitted here since this is a plain Spring Core demo, not Spring Data.)
@Repository
public class OrderRepository {
    public void save(double amount) {
        System.out.println("Saving order of " + amount + " to the database");
    }
}
