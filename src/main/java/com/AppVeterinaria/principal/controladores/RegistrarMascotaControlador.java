/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.controladores;

import com.AppVeterinaria.principal.entidades.Mascota;
import com.AppVeterinaria.principal.servicios.MascotaInterfaz;
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
public class RegistrarMascotaControlador {
    @Autowired
    MascotaInterfaz mascotaServicio;
    
    @PostMapping("/registrarmascota")
    public String RegistrarC(@ModelAttribute("mascota") Mascota mascotaDTO) {
        if (mascotaServicio.crearMascota(mascotaDTO)) {
            System.out.println(mascotaDTO);
            return "redirect:/mascotaregistro?exito";
        }
        return "redirect:/mascotaregistro?error";
    }
    
    @GetMapping("/mascotaregistro")
    public String getRegistro(Model modelo) {
        modelo.addAttribute("mascota", new Mascota());
        return "mascotaregistro";
    }
}
