/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Miguel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Veterinario")
public class Veterinario implements Serializable {
    @Id
    private Integer id;
    
    private String Veterinario_nombre;
    private String Veterinario_correo;
    private String Veterinario_contraseña;
    
//    @ManyToOne
//    @JoinColumn(name = "Cita_id", nullable = true)
//    private int Cita_id;
}
