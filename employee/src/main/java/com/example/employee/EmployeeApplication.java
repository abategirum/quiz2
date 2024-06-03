package com.example.employee;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeApplication implements CommandLineRunner {

    private final EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.createEmployee(new Employee("John","Doe", 50000.00));
        employeeService.createEmployee(new Employee("Jane","Donna",50000.00));
        employeeService.createEmployee(new Employee("Alice", "Smith",6000.00));
        employeeService.createEmployee(new Employee("Bob", "Brown",4500.00));

        System.out.println(employeeService.getAllEmployees());
    }
}
