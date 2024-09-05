package com.example.pawcare.errorHandling;

public class UserAlreadyExistsException extends RuntimeException {

    private int cedula;

    public UserAlreadyExistsException(int cedula) {
        this.cedula = cedula;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
