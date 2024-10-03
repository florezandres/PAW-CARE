package com.example.pawcare.servicio;

import java.util.List;

import com.example.pawcare.entidad.Droga;

public interface DrogaService {

    public Droga SearchById(Long id);

    public List<Droga> SearchAll();

    public List<Droga> SearchByMascotaId(Long id);
    
    public void add(Droga droga);
    public void deleteById(Long id);
    public void update(Droga droga);
}