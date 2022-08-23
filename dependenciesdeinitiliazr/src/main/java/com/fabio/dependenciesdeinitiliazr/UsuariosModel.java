/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
public class UsuariosModel {
           @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
    
           private int id;
           private String nombre;
           private String apellido;

    public UsuariosModel() {
    }

    @Override
    public String toString() {
        return "UsuariosModel{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
           
           
}
