package com.luv2code.employee_cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.employee_cruddemo.dao.EmployeeDao;
import com.luv2code.employee_cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDao employeeDao;

    public EmployeeRestController(EmployeeDao theEmployeeDao) {
        this.employeeDao = theEmployeeDao;
    }
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }
}