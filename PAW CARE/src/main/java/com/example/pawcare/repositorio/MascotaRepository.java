package com.example.pawcare.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pawcare.entidad.Mascota;

@Repository	
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    
}
