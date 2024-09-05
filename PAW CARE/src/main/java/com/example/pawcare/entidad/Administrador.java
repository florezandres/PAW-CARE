package com.example.pawcare.entidad;

public class Administrador {
    private int mascotasEnTratamiento;
    private int numAtenciones;
    private int precioTotal;

    public Administrador(int mascotasEnTratamiento, int numAtenciones, int precioTotal) {
        this.mascotasEnTratamiento = mascotasEnTratamiento;
        this.numAtenciones = numAtenciones;
        this.precioTotal = precioTotal;
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
}
