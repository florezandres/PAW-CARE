package com.example.pawcare.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pawcare.entidad.Tratamiento;

@Repository	
public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
    
}