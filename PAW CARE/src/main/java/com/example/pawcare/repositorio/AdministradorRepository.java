package com.example.pawcare.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pawcare.entidad.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
    Administrador findByCedula(int cedula);
}
