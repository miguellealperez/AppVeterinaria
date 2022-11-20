/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Miguel
 */
@Controller
public class VeterinariaControlador {
    @GetMapping("/")
    public String ventanaPrincipal(Model modelo){
        String titulo = "Pingoo";
        modelo.addAttribute("Titulo",titulo);
        return "index";
    }
}
