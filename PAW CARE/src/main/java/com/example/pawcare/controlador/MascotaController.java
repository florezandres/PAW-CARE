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
        Mascota mascota = mascotaService.SearchById(id);
        if (mascota != null) {
            Cliente cliente = clienteService.SearchByCedula(mascota.getCliente().getCedula());
            model.addAttribute("mascota", mascota);
            model.addAttribute("cliente", cliente);
        } else {
            // Maneja el caso en que la mascota no sea encontrada, si es necesario
            model.addAttribute("error", "Mascota no encontrada");
        }
        return "mostrar_mascota";
    }


    @GetMapping("/adminfind/{id}")
    public String mostrarinfoMascotaAdmin(Model model, @PathVariable("id") Long id) {
        model.addAttribute("mascota", mascotaService.SearchById(id));
        return "mostrar_mascota_admin";
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
        return "redirect:/admin/mascotas";
    }

}