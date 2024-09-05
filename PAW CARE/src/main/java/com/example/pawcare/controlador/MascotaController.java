package com.example.pawcare.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pawcare.entidad.Cliente;
import com.example.pawcare.entidad.Mascota;
import com.example.pawcare.errorHandling.NotFoundException;
import com.example.pawcare.servicio.ClienteService;
import com.example.pawcare.servicio.MascotaService;



@RequestMapping("/mascota")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @Autowired
    ClienteService clienteService;

    @GetMapping("/all")
    public String mostrarMascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.SearchAll());        
        return "listado_mascotas";
    }

    @GetMapping("/find/{id}")
    public String mostrarinfoMascota(Model model, @PathVariable("id") Long id) {
        model.addAttribute("mascota", mascotaService.SearchById(id));
        return "mostrar_mascota";
    }
    
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {

        Mascota mascota = new Mascota("","","","","",1,"");
        model.addAttribute("mascota", mascota);
        return "registro_mascotas";
    }
    
    @PostMapping("/registrar")
public String registroMascota(@ModelAttribute("mascota") Mascota mascota,
                              @RequestParam("cedula") int cedula) {
    Cliente cliente = clienteService.SearchByCedula(cedula);
    if (cliente != null) {
        mascota.setCliente(cliente);
        mascotaService.add(mascota);
        return "redirect:/mascota/all";
    } else {
        // Manejo de error si el cliente no existe
        throw new NotFoundException (cedula);
    }
} 


    @GetMapping("/eliminar/{id}")
    public String borrarMascota(@PathVariable("id") Long id) {
        mascotaService.deleteById(id);
        return "redirect:/mascota/all";
    }

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("mascota", mascotaService.SearchById(id));
        return "modificar_mascota";
    }

    @PostMapping("/modificar/{id}")
    public String actualizarMascota(@PathVariable("id") int id, @ModelAttribute("mascota") Mascota mascota) {
        //mascota.setId(id);
        
        mascotaService.update(mascota);
        return "redirect:/mascota/all";
    }

}