package com.example.pawcare.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawcare.entidad.Droga;
import com.example.pawcare.repositorio.DrogaRepository;
@Service
public class DrogaServiceImpl implements DrogaService {
    
    @Autowired
    DrogaRepository drogaRepository;

    @Override
    public Collection<Droga> SearchAll() {
        return drogaRepository.findAll();
    }

    @Override
    public Droga SearchById(Long id) {
        return drogaRepository.findById(id).get();
    }

    @Override
    public void add(Droga droga) {
        drogaRepository.save(droga);
    }

    @Override
    public void deleteById(Long id) {
        drogaRepository.deleteById(id);
    }

    @Override
    public void update(Droga droga) {
        drogaRepository.save(droga);
    }
}
