package com.mycompany.sem0702;

/**
 *
 * @author YRM
 */
public class Producto {
    
    private String codigo;
    private String nombreprod;
    private String precio;
    private String stock;

    public Producto(){}
    
    public Producto(String codigo, String nombreprod, String precio, String stock) {
        this.codigo = codigo;
        this.nombreprod = nombreprod;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreprod() {
        return nombreprod;
    }

    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return   "Codigo            : " + codigo +
               "\nNombre Producto   : " + nombreprod +
               "\nPrecio            : " + precio +
               "\nStock             : " + stock + "\n";
    }
}
