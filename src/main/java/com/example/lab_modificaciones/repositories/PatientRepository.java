package com.example.lab_modificaciones.repositories;

import com.example.lab_modificaciones.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
