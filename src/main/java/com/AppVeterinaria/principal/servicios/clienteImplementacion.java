/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.DueñoMascota;
import com.AppVeterinaria.principal.repositorios.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public class clienteImplementacion implements ClienteInterfaz {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    
    @Override
    public boolean crearCliente(DueñoMascota cliente) {
        try {
            if (!clienteRepositorio.existsById(cliente.getId())){
                
                clienteRepositorio.save(cliente);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
        
    }

    @Override
    public boolean consultarCliente(DueñoMascota cliente) {
        List<DueñoMascota> clientes = clienteRepositorio.findAll();
        for(DueñoMascota vet:clientes){
//            if(cliente.getcliente_correo().equals(vet.getVeterinario_correo()) 
//               && cliente.getVeterinario_contraseña().equals(vet.getVeterinario_contraseña())){
//               return true; 
//            }
        }
        return false;
    }

    @Override
    public List<DueñoMascota> listarClientes() {
        return clienteRepositorio.findAll();
    }
}
