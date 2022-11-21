/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.controladores;

import com.AppVeterinaria.principal.entidades.Veterinario;
import com.AppVeterinaria.principal.servicios.VeterinarioInter;
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
public class RegistrarControlador {
    
    @Autowired
    VeterinarioInter veterinarioService;
    
    @PostMapping("/registrar")
    public String Registrar(@ModelAttribute("veterinario") Veterinario veterinarioDTO) {
        if (veterinarioService.crearVeterinario(veterinarioDTO)) {
            System.out.println(veterinarioDTO);
            return "redirect:/registro?exito";
        }
        return "redirect:/registro?error";
    }
    
    
    @GetMapping("/registro")
    public String getRegistro(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "registro";
    }
}
