package com.luv2code.employee_cruddemo.dao;

import java.util.List;

import com.luv2code.employee_cruddemo.entity.Employee;

public interface EmployeeDao {
    List<Employee> findAll();
}
