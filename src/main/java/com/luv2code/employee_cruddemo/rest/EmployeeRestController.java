package com.luv2code.employee_cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.employee_cruddemo.entity.Employee;
import com.luv2code.employee_cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    // inject service to the rest so it works into link from database to dao to service to rest...
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }
    
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}