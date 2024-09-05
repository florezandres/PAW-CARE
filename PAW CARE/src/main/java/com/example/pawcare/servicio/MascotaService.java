package com.example.pawcare.servicio;

import java.util.Collection;

import com.example.pawcare.entidad.Mascota;

public interface MascotaService {
    public Mascota SearchById(Long id);
    public Collection<Mascota> SearchAll();
    public void add(Mascota mascota);
    public void deleteById(Long id);
    public void update(Mascota mascota);
}
