/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.servicios;

import com.AppVeterinaria.principal.entidades.Mascota;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public interface MascotaInterfaz {
    public boolean crearMascota(Mascota mascota);
    public boolean consultarMascota(Mascota mascota);
    public List<Mascota> listarMascota();
    public Optional<Mascota> buscarPorId(Integer id);
    public boolean autenticar(Mascota mascota);
    public void eliminarMascota(Mascota mascot);
}
