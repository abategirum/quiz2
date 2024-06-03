package com.example.employee.service;

import com.example.employee.model.Employee;

import java.util.*;

public interface EmployeeService {
    List<Employee>  getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);


}
