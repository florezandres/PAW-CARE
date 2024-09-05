package com.example.pawcare.servicio;

import java.util.Collection;

import com.example.pawcare.entidad.Administrador;

public interface AdministradorService {
    public Administrador SearchById(Long id);
    public Collection<Administrador> SearchAll();
    public Administrador SearchByCedula(int cedula);
}

