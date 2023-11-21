package com.luv2code.employee_cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.employee_cruddemo.dao.EmployeeDao;
import com.luv2code.employee_cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpli implements EmployeeService{

    private EmployeeDao employeeDao;
    
    @Autowired
    public EmployeeServiceImpli(EmployeeDao theEmployeeDao){
        this.employeeDao = theEmployeeDao;
    }

    @Transactional
    @Override
    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

    @Transactional
    @Override
    public Employee findById(int theID) {
        return employeeDao.findById(theID);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
       return employeeDao.save(theEmployee);
    }
    
    @Transactional
    @Override
    public void deletebyId(int theId) {
        employeeDao.deletebyId(theId);
    } 
}
