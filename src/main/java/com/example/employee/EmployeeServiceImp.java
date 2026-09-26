package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    @Qualifier("inMemoryEmployeeRepository")
    private final EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        if (employee != null)
            employeeRepository.save(employee);
        else
            System.out.println("Invalid Employee!!");
    }

    @Override
    public Employee getEmployeeById(int id) {
        if (id < 0) {
            System.out.println("Invalid Id !!");
            return null;
        }
        Employee employee = employeeRepository.findById(id);
        if (employee != null)
            return employee;
        else {
            System.out.println("Employee not Found!");
            return null;
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void setRaise(int id, double percentage) {
        Employee employee = employeeRepository.findById(id);
        employee.setSalary(employee.getSalary() + (employee.getSalary() * percentage));
        employeeRepository.save(employee);
    }

}
