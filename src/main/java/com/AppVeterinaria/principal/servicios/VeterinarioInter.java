/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.Veterinario;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public interface VeterinarioInter {
    public boolean crearVeterinario(Veterinario veterinario);
    public boolean consultarVeterinario(Veterinario veterinario);
    public List<Veterinario> listarVeterinario();
}
