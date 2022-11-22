/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.Veterinario;
import com.AppVeterinaria.principal.repositorios.VeterinarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public class VeterImplementacion implements VeterinarioInter{

    @Autowired
    private VeterinarioRepositorio veterinarioRepositorio;
    
    @Override
    public boolean crearVeterinario(Veterinario veterinario) {
        try {
            if (!veterinarioRepositorio.existsById(veterinario.getId())){
                
                veterinarioRepositorio.save(veterinario);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
        
    }

    @Override
    public boolean consultarVeterinario(Veterinario veterinario) {
        List<Veterinario> veterinarios = veterinarioRepositorio.findAll();
        for(Veterinario vet:veterinarios){
            if(veterinario.getVeterinario_correo().equals(vet.getVeterinario_correo()) 
               && veterinario.getVeterinario_contraseña().equals(vet.getVeterinario_contraseña())){
               return true; 
            }
        }
        return false;
    }

    @Override
    public List<Veterinario> listarVeterinario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
