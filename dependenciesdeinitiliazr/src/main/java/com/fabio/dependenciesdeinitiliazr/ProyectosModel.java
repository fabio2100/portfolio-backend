/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
public class ProyectosModel {
               @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
               
         private int id;
               private String nombre;
               private String descripcion;
               private String lenguaje;
               private String link;
               private Date fechaInicio;
               private Date fechaFin;

    public ProyectosModel() {
    }

    @Override
    public String toString() {
        return "ProyectosModel{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", lenguaje=" + lenguaje + ", link=" + link + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
               
               
               
}
