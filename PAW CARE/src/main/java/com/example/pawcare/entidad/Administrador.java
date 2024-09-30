package com.example.pawcare.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Administrador {

    @Id
    @GeneratedValue
    private Long id;
    
    private int cedula;

    public Administrador(Long id, int cedula) {
        this.id = id;
        this.cedula = cedula;
    }

    public Administrador() {
    }

    public Administrador(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
