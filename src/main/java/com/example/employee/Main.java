package com.example.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean(Employee.class);
        employee.setId(1);
        employee.setDepartment("IT");
        employee.setSalary(5000);

        EmployeeServiceImp employeeServiceImp = context.getBean(EmployeeServiceImp.class);

        employeeServiceImp.addEmployee(employee);
        employeeServiceImp.getAllEmployees().stream().forEach(e -> e.toString());
        System.out.println(employeeServiceImp.getEmployeeById(1).toString());
        employeeServiceImp.setRaise(1, 10);
    }
}
