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
    private int mascotasEnTratamiento;
    private int numAtenciones;
    private int precioTotal;

    public Administrador(Long id, int cedula, int mascotasEnTratamiento, int numAtenciones, int precioTotal) {
        this.id = id;
        this.cedula = cedula;
        this.mascotasEnTratamiento = mascotasEnTratamiento;
        this.numAtenciones = numAtenciones;
        this.precioTotal = precioTotal;
    }

    public Administrador(int cedula, int mascotasEnTratamiento, int numAtenciones, int precioTotal) {
        this.cedula = cedula;
        this.mascotasEnTratamiento = mascotasEnTratamiento;
        this.numAtenciones = numAtenciones;
        this.precioTotal = precioTotal;
    }

    public Administrador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMascotasEnTratamiento() {
        return mascotasEnTratamiento;
    }

    public void setMascotasEnTratamiento(int mascotasEnTratamiento) {
        this.mascotasEnTratamiento = mascotasEnTratamiento;
    }

    public int getNumAtenciones() {
        return numAtenciones;
    }

    public void setNumAtenciones(int numAtenciones) {
        this.numAtenciones = numAtenciones;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
