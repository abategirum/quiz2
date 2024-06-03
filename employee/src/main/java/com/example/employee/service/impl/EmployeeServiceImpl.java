package com.example.employee.service.impl;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getLastName,Comparator.reverseOrder()
        )).toList();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.findById(employee.getId()).ifPresent(employeeRepository::delete);
    }
}
