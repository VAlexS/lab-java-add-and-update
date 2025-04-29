package com.example.lab_modificaciones.controllers;

import com.example.lab_modificaciones.dtos.UpdateStatusDTO;
import com.example.lab_modificaciones.models.Employee;
import com.example.lab_modificaciones.models.Status;
import com.example.lab_modificaciones.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

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

    @PatchMapping("/{id}/status")
    @ResponseStatus(HttpStatus.OK)
    public Employee updateDoctorStatus(@PathVariable int id, @Valid @RequestBody UpdateStatusDTO dto) {
        try {
            Status.valueOf(dto.getStatus().toUpperCase()); // Validamos antes de enviar al servicio
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid status value: " + dto.getStatus());
        }

        return employeeService.changeStatusEmployee(id, dto.getStatus());
    }

}
