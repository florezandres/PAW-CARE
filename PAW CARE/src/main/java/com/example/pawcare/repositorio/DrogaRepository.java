package com.example.pawcare.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pawcare.entidad.Droga;

@Repository	
public interface DrogaRepository extends JpaRepository<Droga, Long> {
    
}