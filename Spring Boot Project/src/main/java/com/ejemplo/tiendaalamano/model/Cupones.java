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
public class Cupones {
    private String idCupon;
    private String nombre;
    private int Promocion;

    public Cupones() {
    }

    public Cupones(String idCupon, String nombre, int Promocion) {
        this.idCupon = idCupon;
        this.nombre = nombre;
        this.Promocion = Promocion;
    }

    public String getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(String idCupon) {
        this.idCupon = idCupon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPromocion() {
        return Promocion;
    }

    public void setPromocion(int Promocion) {
        this.Promocion = Promocion;
    }
}
