package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/employee")

// @crossOrigin * mean let everyone can connect to this api. so irl we should put real url.
@CrossOrigin("*")
public class EmployeeController {
    private final EmployeeService employeeService; //we are bringing in Employee Service instance

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**This is a post Request, here we are gonna ba saving an employee*/
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    /** Here, we are getting all employee*/
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    /**here, we are get one employee*/
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    /**here, we update an employee*/
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
    /**Here, we delete employee*/
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
