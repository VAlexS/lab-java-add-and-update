package com.example.lab_modificaciones.services;

import com.example.lab_modificaciones.models.Patient;
import com.example.lab_modificaciones.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient(int id, Patient patient){
        var patientToUpdate = patientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        patient.setId(patientToUpdate.getId());
        patient.setEmployee(patientToUpdate.getEmployee());

        return patientRepository.save(patient);
    }




}
