package com.example.pawcare.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawcare.entidad.Administrador;
import com.example.pawcare.repositorio.AdministradorRepository;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired 
    AdministradorRepository administradorRepository;

    @Override
    public Administrador SearchById(Long id) {
        return administradorRepository.findById(id).get();
    }    

    @Override
    public Collection<Administrador> SearchAll() {
        return administradorRepository.findAll();
    }

    @Override
    public Administrador SearchByCedula(int cedula) {
        return administradorRepository.findByCedula(cedula);
    }
}
