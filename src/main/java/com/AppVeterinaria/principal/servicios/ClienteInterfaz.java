/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.DueñoMascota;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public interface ClienteInterfaz {
    public boolean crearCliente(DueñoMascota cliente);
    public boolean consultarCliente(DueñoMascota cliente);
}
