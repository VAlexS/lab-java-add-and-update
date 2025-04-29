package com.example.lab_modificaciones.dtos;

import jakarta.validation.constraints.NotBlank;

public class UpdateStatusDTO {

    @NotBlank(message = "El status no puede estar vacío")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
