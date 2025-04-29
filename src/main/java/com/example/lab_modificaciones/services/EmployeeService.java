package com.example.lab_modificaciones.services;

import com.example.lab_modificaciones.models.Employee;
import com.example.lab_modificaciones.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
