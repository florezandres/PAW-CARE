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
import com.example.pawcare.errorHandling.UserAlreadyExistsException;
import com.example.pawcare.servicio.AdministradorService;
import com.example.pawcare.servicio.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    AdministradorService adminService;

    @GetMapping("/find/{id}")
    public String mostrarinfoCliente(Model model, @PathVariable("id") Long id) {
        model.addAttribute("cliente", clienteService.SearchById(id));
        return "";
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        Cliente cliente = new Cliente("","",1,1);
        model.addAttribute("cliente", cliente);
        return "registro";
    }

    @PostMapping("/registrar")
    public String registroCliente(@ModelAttribute("cliente") Cliente cliente) {
        
        if (clienteService.SearchByCedula(cliente.getCedula()) != null) {
            throw new UserAlreadyExistsException(cliente.getCedula());
        }
        else if(adminService.SearchByCedula(cliente.getCedula()) != null){
            throw new UserAlreadyExistsException(cliente.getCedula());
        }
        clienteService.add(cliente);
        return "redirect:/clinica";
    }

    @GetMapping("/all")
    public String allClientes(Model model) {
        model.addAttribute("clientes", clienteService.SearchAll());
        return "usuarios";
    }

    @GetMapping("/{id}")
    public Cliente clientePorId(@PathVariable Long id) {
        return clienteService.SearchById(id);
    }

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("cliente", clienteService.SearchById(id));
        return "modificar";
    }

    @PostMapping("/modificar/{id}")
    public String actualizarCliente(@PathVariable("id") Long id, @ModelAttribute("cliente") Cliente cliente) {
        clienteService.update(cliente);
        return "redirect:/admin/clientes";
    }

    @GetMapping("/eliminar/{id}")
    public String borrarCliente(@PathVariable("id") Long id) {
        clienteService.deleteById(id);
        return "redirect:/admin/clientes";
    }

    @GetMapping("/login")
public String login(@RequestParam("cedula") int cedula, Model model) {
    Cliente cliente = clienteService.SearchByCedula(cedula);
    if (cliente != null) {
        model.addAttribute("cliente", cliente);
        return "clientePerfil";
    }
    else {
        return "";
    }
    }
}

