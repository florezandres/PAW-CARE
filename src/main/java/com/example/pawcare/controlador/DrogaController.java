package com.example.pawcare.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pawcare.entidad.Droga;
import com.example.pawcare.servicio.DrogaService;

@RestController
@RequestMapping("/droga")
@CrossOrigin(origins = "http://localhost:4200")
public class DrogaController {
    
    @Autowired
    private DrogaService drogaService;

    @GetMapping("/all")
    public List<Droga> mostrarTodasDrogas() {
        return drogaService.cargarDrogasDesdeExcel(); // Llama al método que carga desde Excel
    }
}
