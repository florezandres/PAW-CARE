package com.example.pawcare.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/index")
    public String Home() {
        return "index";
    }

    @GetMapping("/servicios")
    public String Servicios() {
        return "servicios";
    }

    @GetMapping("/galeria")
    public String Galeria() {
        return "galeria";
    }

    @GetMapping("/clinica")
    public String Clinica() {
        return "clinica";
    }

    @GetMapping("/contacto")
    public String Contacto() {
        return "contacto";
    }

    @GetMapping("/dashboard_cliente")
    public String dashboard_cliente() {
        return "dashboard_cliente";
    }
}
