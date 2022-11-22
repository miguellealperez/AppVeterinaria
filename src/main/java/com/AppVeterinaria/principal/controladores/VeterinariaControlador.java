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
public class VeterinariaControlador {

    @Autowired
    VeterinarioInter veterinarioService;
    
    @PostMapping("/autenticar")
    public String Autenticar(@ModelAttribute("veterinario") Veterinario veterinarioDTO) {
        if (veterinarioService.consultarVeterinario(veterinarioDTO)) {
            //System.out.println(veterinarioDTO);
            return "redirect:/ventanaprincipal";
        }
        return "redirect:/autenticadoerror";
    }
     
    @GetMapping("/index")
    public String getRegistro(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "index";
    }
    
    @GetMapping("/ventanaprincipal")
    public String getVentana(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "ventanaprincipal";
    }
    
    @GetMapping("/autenticadoerror")
    public String getVentanaError(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "autenticadoerror";
    }
    
    @GetMapping("/generarcita")
    public String getGenerarCita(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "generarcita";
    }
    
}
