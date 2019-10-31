package com.wanderlust.app.dao;

import com.wanderlust.app.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
