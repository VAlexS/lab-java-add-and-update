package com.example.lab_modificaciones.services;

import com.example.lab_modificaciones.models.Patient;
import com.example.lab_modificaciones.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }




}
