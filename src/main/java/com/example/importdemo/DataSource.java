package com.example.importdemo;

public class DataSource {
    public DataSource() {
        System.out.println("DataSource created (from DatabaseConfig)");
    }

    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}
