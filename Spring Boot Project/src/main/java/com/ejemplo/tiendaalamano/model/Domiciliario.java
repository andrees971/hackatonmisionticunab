/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

/**
 *
 * @author Andres Felipe Silva
 */
public class Domiciliario {
    private int idDomiciliario;
    private String nombre;
    private String telefono;

    public Domiciliario() {
    }

    public Domiciliario(int idDomiciliario, String nombre, String telefono) {
        this.idDomiciliario = idDomiciliario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getIdDomiciliario() {
        return idDomiciliario;
    }

    public void setIdDomiciliario(int idDomiciliario) {
        this.idDomiciliario = idDomiciliario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
