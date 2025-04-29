package com.example.lab_modificaciones.dtos;

import jakarta.validation.constraints.NotBlank;

public class UpdateDepartmentDTO {

    @NotBlank(message = "El depa")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
