package com.example.lab_modificaciones.controllers;

import com.example.lab_modificaciones.models.Employee;
import com.example.lab_modificaciones.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody @Valid Employee employee){
        return employeeService.createEmployee(employee);
    }
}
