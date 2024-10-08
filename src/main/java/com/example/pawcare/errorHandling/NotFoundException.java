package com.example.pawcare.errorHandling;

public class NotFoundException extends RuntimeException {

    private int cedula;

    public NotFoundException(int cedula) {
        this.cedula = cedula;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
