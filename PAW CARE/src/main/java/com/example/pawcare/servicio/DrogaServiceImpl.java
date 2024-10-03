package com.example.pawcare.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawcare.entidad.Droga;
import com.example.pawcare.repositorio.DrogaRepository;
@Service
public class DrogaServiceImpl implements DrogaService {
    
    @Autowired
    DrogaRepository drogaRepository;

    @Override
    public Droga SearchById(Long id) {
        return drogaRepository.findById(id).get();
    }

    @Override
    public List <Droga> SearchAll() {
        return drogaRepository.findAll();
    }

    @Override
    public List <Droga> SearchByMascotaId(Long id) {
        return drogaRepository.findByMascotaId(id);
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
