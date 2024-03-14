package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    Employee saveEmployee(Employee employee);
    Optional<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployee();
    Employee updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
}
