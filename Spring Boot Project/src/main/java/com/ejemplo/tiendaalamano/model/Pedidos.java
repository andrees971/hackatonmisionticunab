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
public class Pedidos {
    private String idPedido;
    private Productos producto;
    private Cliente cliente;
    private int cantidadComprada;
    private String estado;

    public Pedidos() {
    }

    public Pedidos(String idPedido, Productos producto, Cliente cliente, int cantidadComprada, String estado) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.cliente = cliente;
        this.cantidadComprada = cantidadComprada;
        this.estado = estado;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
