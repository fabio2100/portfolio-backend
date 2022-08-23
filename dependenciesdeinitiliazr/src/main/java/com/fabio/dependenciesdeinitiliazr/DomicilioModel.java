/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name="Domicilio")
public class DomicilioModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="id")
    private int id;
    @Column(name="calle")
    private String calle;
    @Column(name="localidad")
    private String localidad;
    @Column(name="provincia")
    private String provincia;
    @Column(name="id_persona")
    private int id_persona;

    @Override
    public String toString() {
        return "DomicilioModel{" + "id=" + id + ", calle=" + calle + ", localidad=" + localidad + ", provincia=" + provincia + ", id_persona=" + id_persona + '}';
    }

    public DomicilioModel() {
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
}
