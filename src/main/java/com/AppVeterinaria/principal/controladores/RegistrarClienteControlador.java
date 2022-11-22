/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.controladores;

import com.AppVeterinaria.principal.entidades.DueñoMascota;
import com.AppVeterinaria.principal.servicios.ClienteInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Miguel
 */
@Controller
public class RegistrarClienteControlador {
    @Autowired
    ClienteInterfaz clienteServicio;
    
    @PostMapping("/registrarcliente")
    public String RegistrarC(@ModelAttribute("cliente") DueñoMascota clienteDTO) {
        if (clienteServicio.crearCliente(clienteDTO)) {
            System.out.println(clienteDTO);
            return "redirect:/clienteregistro?exito";
        }
        return "redirect:/clienteregistro?error";
    }
    
    @GetMapping("/clienteregistro")
    public String getRegistro(Model modelo) {
        modelo.addAttribute("cliente", new DueñoMascota());
        return "clienteregistro";
    }
}
