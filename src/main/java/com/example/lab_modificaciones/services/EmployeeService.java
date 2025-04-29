package com.example.lab_modificaciones.services;

import com.example.lab_modificaciones.models.Employee;
import com.example.lab_modificaciones.models.Status;
import com.example.lab_modificaciones.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee changeStatusEmployee(int id, String status){
        Employee employeeToChange = employeeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));


        try {
            Status newStatus = Status.valueOf(status.toUpperCase());
            employeeToChange.setStatus(newStatus);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid status value: " + status);
        }

        return employeeRepository.save(employeeToChange);

    }
}
