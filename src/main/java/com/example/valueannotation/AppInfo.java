package com.example.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {

    // 1. Plain literal value
    @Value("MyApplication")
    private String hardcodedName;

    // 2. Value from a properties file, via @PropertySource on the config class
    @Value("${app.name}")
    private String appNameFromProperties;

    @Value("${server.port}")
    private int port;

    // 3. Property with a default, in case the key is missing
    @Value("${missing.key:defaultValue}")
    private String withDefault;

    // 4. Spring Expression Language (SpEL)
    @Value("#{2 * 10}")
    private int computedValue;

    public void printAll() {
        System.out.println("hardcodedName = " + hardcodedName);
        System.out.println("appNameFromProperties = " + appNameFromProperties);
        System.out.println("port = " + port);
        System.out.println("withDefault = " + withDefault);
        System.out.println("computedValue (SpEL 2 * 10) = " + computedValue);
    }
}
