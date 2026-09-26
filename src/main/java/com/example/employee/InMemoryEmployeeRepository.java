package com.example.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component

public class InMemoryEmployeeRepository implements EmployeeRepository {
    private List<Employee> employees;

    public InMemoryEmployeeRepository() {
        employees = new ArrayList<>();
    }

    public Employee findById(int id) {
        return employees.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public void save(Employee employee) {
        employees.add(employee);
        System.out.println("Saved!!");
    }
}
