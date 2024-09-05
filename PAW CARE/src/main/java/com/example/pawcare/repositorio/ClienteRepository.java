package com.example.pawcare.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pawcare.entidad.Cliente;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Long>{
    Cliente findByCedula(int cedula); 
}
