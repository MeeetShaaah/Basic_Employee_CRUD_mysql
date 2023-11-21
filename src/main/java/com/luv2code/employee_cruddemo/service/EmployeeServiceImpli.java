package com.luv2code.employee_cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.employee_cruddemo.dao.EmployeeDao;
import com.luv2code.employee_cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpli implements EmployeeService{

    private EmployeeDao employeeDao;
    
    @Autowired
    public EmployeeServiceImpli(EmployeeDao theEmployeeDao){
        this.employeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll(){
        return employeeDao.findAll();
    } 
}
