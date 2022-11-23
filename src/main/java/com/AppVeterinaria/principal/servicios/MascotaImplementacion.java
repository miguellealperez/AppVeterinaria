/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.Mascota;
import com.AppVeterinaria.principal.repositorios.MascotaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public class MascotaImplementacion implements MascotaInterfaz{

    @Autowired
    private MascotaRepositorio mascotaRepositorio;
    
    @Override
    public boolean crearMascota(Mascota mascota) {
        try {
            if (!mascotaRepositorio.existsById(mascota.getId())){
                
                mascotaRepositorio.save(mascota);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean consultarMascota(Mascota mascota) {
        List<Mascota> clientes = mascotaRepositorio.findAll();
        for(Mascota vet:clientes){
//            if(cliente.getcliente_correo().equals(vet.getVeterinario_correo()) 
//               && cliente.getVeterinario_contraseña().equals(vet.getVeterinario_contraseña())){
//               return true; 
//            }
        }
        return false;
    }

    @Override
    public List<Mascota> listarMascota() {
        return mascotaRepositorio.findAll();
    }
    
}
