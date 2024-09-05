package com.example.pawcare.servicio;

import java.util.Collection;

import com.example.pawcare.entidad.Cliente;

public interface ClienteService {
    public Cliente SearchById(Long id);
    public Collection<Cliente> SearchAll();
    public void add(Cliente cliente);
    public void deleteById(Long id);
    public void update(Cliente cliente);
    public Cliente SearchByCedula(int cedula);
}

