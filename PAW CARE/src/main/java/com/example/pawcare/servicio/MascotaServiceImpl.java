package com.example.pawcare.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawcare.entidad.Mascota;
import com.example.pawcare.repositorio.MascotaRepository;
@Service
public class MascotaServiceImpl implements MascotaService {
    
    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public Mascota SearchById(Long id) {
        // TODO Auto-generated method stub
        return mascotaRepository.findById(id).get();
    }
    @Override
    public Collection<Mascota> SearchAll() {
        // TODO Auto-generated method stub
        return mascotaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        mascotaRepository.deleteById(id);
    }
    @Override
    public void add(Mascota mascota) {
        // TODO Auto-generated method stub
        mascotaRepository.save(mascota);
    }
    @Override
    public void update(Mascota mascota) {
        // TODO Auto-generated method stub
        mascotaRepository.save(mascota);
    }
}
