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
@Table(name="Mascota")
public class Mascota implements Serializable {
    @Id
    private Integer id;
    
    private String Mascota_nombre;
    private String Mascota_tipo;
    private String Mascota_genero;
    private String Mascota_edad;
    private String Mascota_edad_tipo;
    private String Mascota_peso;
    private String Mascota_peso_tipo;
    private String HistoriaClinica;
    private Integer Dueño_id;
    
//    @ManyToOne
//    @JoinColumn(name = "DueñoMascota", nullable = true)
//    private Integer Dueño_id;
}
