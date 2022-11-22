/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.repositorios;

import com.AppVeterinaria.principal.entidades.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel
 */
@Repository
//public class VeterinarioRepositorio {
//    
//}
public interface VeterinarioRepositorio extends JpaRepository <Veterinario, Integer>{
    
}
