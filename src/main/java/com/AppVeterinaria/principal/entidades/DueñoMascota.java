/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AppVeterinaria.principal.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="DueñoMascota")
public class DueñoMascota implements Serializable {

    @Id
    private Integer id;
    
    private String id_tipo;
    private String nombre;
    private String apellido;
    private String correo;  
    private String telefono;
    private String direccion;
    
    
}
