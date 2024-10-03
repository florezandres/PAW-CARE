package com.example.pawcare.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pawcare.entidad.Administrador;
import com.example.pawcare.entidad.Cliente;
import com.example.pawcare.errorHandling.NotFoundException;
import com.example.pawcare.servicio.AdministradorService;
import com.example.pawcare.servicio.ClienteService;


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

    @Autowired
    ClienteService clienteService;

    @Autowired
    AdministradorService adminService ;




    @PostMapping("/login")
    public String login(@RequestParam("cedula") int cedula, Model model) {
        Cliente cliente = clienteService.SearchByCedula(cedula);
        Administrador admin = adminService.SearchByCedula(cedula);
        if (cliente != null) {
            System.out.println("Mascotas del cliente:");
            model.addAttribute("cliente", cliente);
            return "clientePerfil";
        }else if (admin != null) { 
            return "adminPerfil";
        }
        else {
            throw new NotFoundException (cedula);
        }
    }
}
