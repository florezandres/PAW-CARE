package com.example.pawcare.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pawcare.entidad.Cliente;
import com.example.pawcare.entidad.Mascota;
import com.example.pawcare.errorHandling.NotFoundException;
import com.example.pawcare.errorHandling.UserAlreadyExistsException;
import com.example.pawcare.servicio.AdministradorService;
import com.example.pawcare.servicio.ClienteService;
import com.example.pawcare.servicio.MascotaService;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdministradorService AdminService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    MascotaService mascotaService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        Cliente cliente = new Cliente("","",1,1);
        model.addAttribute("cliente", cliente);
        return "registroAdmin";
    }

    @PostMapping("/registrar")
    public String registroCliente(@ModelAttribute("cliente") Cliente cliente) {
        
        if (clienteService.SearchByCedula(cliente.getCedula()) != null || AdminService.SearchByCedula(cliente.getCedula()) != null) {
            throw new UserAlreadyExistsException(cliente.getCedula());
        }
        clienteService.add(cliente);
        return "redirect:/admin/clientes";
    }

    @GetMapping("/registroMascota")
    public String mostrarFormularioRegistroMascota(Model model) {
        Mascota mascota = new Mascota("","","","","",1,"");
        model.addAttribute("mascota", mascota);
        return "registro_mascotas";
    }

    @PostMapping("/registrarMascota")
    public String registroMascota(@ModelAttribute("mascota") Mascota mascota,
                              @RequestParam("cedula") int cedula) {
    Cliente cliente = clienteService.SearchByCedula(cedula);
    if (cliente != null) {
        mascota.setCliente(cliente);
        mascotaService.add(mascota);
        return "redirect:/admin/mascotas";
    } else {
        // Manejo de error si el cliente no existe
        throw new NotFoundException (cedula);
    }
    
    }

    @GetMapping("/clientes")
    public String allClientes(Model model) {
        model.addAttribute("clientes", clienteService.SearchAll());
        return "usuarios";
    }

    @GetMapping("/mascotas")	
    public String mostrarMascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.SearchAll());        
        return "listado_mascotas";
    }

    @GetMapping("/login")
    public String redirectToLogin() {
        return "/adminPerfil";
    }
}