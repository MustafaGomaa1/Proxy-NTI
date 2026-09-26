package com.example.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demonstrates: @Lookup
 * Run with: -Dexec.mainClass="com.example.lookup.LookupDemo"
 */
public class LookupDemo {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(LookupConfig.class);

        CommandManager manager = context.getBean(CommandManager.class);

        manager.process(); // creates and executes MyCommand instance #1
        manager.process(); // creates and executes a DIFFERENT MyCommand instance #2
        // Notice the printed object identity differs each time, even though
        // "manager" itself is the same singleton both times.
    }
}
