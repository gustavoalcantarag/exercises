package com.mycompany.sem0701;

/**
 *
 * @author YRM
 */
public class Producto {
    
    String codigo;
    String producto;
    double precio;
    int stock;
    String categoria;

    public Producto(String codigo, String producto, double precio, int stock, String categoria) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    
    Object[] Registro(int num){
        Object[] fila = {num,codigo,producto,precio,stock,categoria};
        return fila;
    }
    
}
