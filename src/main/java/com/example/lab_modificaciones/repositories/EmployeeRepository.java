package com.example.lab_modificaciones.repositories;

import com.example.lab_modificaciones.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
