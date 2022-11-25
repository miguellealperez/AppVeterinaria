/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.Factura;
import com.AppVeterinaria.principal.repositorios.FacturaRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Miguel
 */
@Service
public class FacturaImplementacion implements FacturaInterfaz {

    @Autowired
    private FacturaRepositorio facturaRepositorio;
    
    @Override
    public boolean crearFactura(Factura factura) {
        try {
            if (!facturaRepositorio.existsById(factura.getId())){
                
                facturaRepositorio.save(factura);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

}
