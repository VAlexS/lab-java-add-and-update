package com.example.lab_modificaciones.controllers;

import com.example.lab_modificaciones.models.Patient;
import com.example.lab_modificaciones.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Patient createPatient(@RequestBody @Valid Patient patient){
        return patientService.createPatient(patient);
    }

}
