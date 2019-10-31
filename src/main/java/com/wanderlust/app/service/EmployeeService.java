package com.wanderlust.app.service;

import com.wanderlust.app.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
