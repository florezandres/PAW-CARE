package com.example.pawcare.servicio;

import java.util.Collection;

import com.example.pawcare.entidad.Droga;

public interface DrogaService {
    public Droga SearchById(Long id);
    public Collection<Droga> SearchAll();
    public void add(Droga droga);
    public void deleteById(Long id);
    public void update(Droga droga);
}
