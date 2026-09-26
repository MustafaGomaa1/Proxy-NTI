package com.example.employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    void setRaise(int id, double percentage);
}
