package com.example.pawcare.servicio;

import java.util.Collection;

import com.example.pawcare.entidad.Veterinario;

public interface VeterinarioService {
    public Veterinario SearchById(Long id);
    public Collection<Veterinario> SearchAll();
    public void add(Veterinario Veterinario);
    public void deleteById(Long id);
    public void update(Veterinario Veterinario);
    public Veterinario SearchByCedula(int cedula);
}
