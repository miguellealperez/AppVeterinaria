/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.controladores;

import com.AppVeterinaria.principal.entidades.Veterinario;
import com.AppVeterinaria.principal.servicios.ClienteInterfaz;
import com.AppVeterinaria.principal.servicios.MascotaInterfaz;
import com.AppVeterinaria.principal.servicios.VeterinarioInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Miguel
 */
@Controller
public class VeterinariaControlador {

    @Autowired
    VeterinarioInter veterinarioService;
    
    @Autowired
    ClienteInterfaz clienteservice;
    
    @Autowired
    MascotaInterfaz mascotaService;
    
    @PostMapping("/autenticar")
    public String Autenticar(@ModelAttribute("veterinario") Veterinario veterinarioDTO) {
        if (veterinarioService.consultarVeterinario(veterinarioDTO)) {
            int id = 0;
            //System.out.println(veterinarioDTO);
            for (Veterinario veterinario : veterinarioService.listarVeterinario()) {
                if(veterinarioDTO.getVeterinario_correo().equals(veterinario.getVeterinario_correo())){
                    id = veterinario.getId();
                }
            }

            return "redirect:/ventanaprincipal";
        }
        return "redirect:/autenticadoerror";
    }
     
    @GetMapping("/index")
    public String getRegistro(Model modelo) {
        modelo.addAttribute("veterinario", new Veterinario());
        return "index";
    }
    
//    @GetMapping("ventanaprincipal/{id}")
//    public String getVentana(@PathVariable String id ,Model modelo) {
//        //modelo.addAttribute("veterinario", new Veterinario());
//        Veterinario veti = null;
//        for (Veterinario veterinario : veterinarioService.listarVeterinario()) {
//            if(veterinario.getId() == Integer.parseInt(id)){
//                veti = veterinario;
//            }
//        }
//
//        modelo.addAttribute("veterinario", veti);
//        modelo.addAttribute("clientes", clienteservice.listarClientes());
//        return "ventanaprincipal";
//        
//    }
    @GetMapping("/ventanaprincipal")
    public String getVentana(Model modelo) {
        //modelo.addAttribute("veterinario", new Veterinario());
//        Veterinario veti = null;
//        for (Veterinario veterinario : veterinarioService.listarVeterinario()) {
//            if(veterinario.getId() == Integer.parseInt(id)){
//                veti = veterinario;
//            }
//        }

        //modelo.addAttribute("veterinario", veti);
        modelo.addAttribute("clientes", clienteservice.listarClientes());
        modelo.addAttribute("mascota",mascotaService.listarMascota());
        modelo.addAttribute("veterinario", new Veterinario());
        return "ventanaprincipal";
        
    }
//    @GetMapping("/ventanaprincipal")
//    public String getVentana(Model modelo) {
//        modelo.addAttribute("veterinario", new Veterinario());
//        return "ventanaprincipal";
//    }
    
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
