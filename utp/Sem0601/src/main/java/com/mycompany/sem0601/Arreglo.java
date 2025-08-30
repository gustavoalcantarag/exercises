package com.mycompany.sem0601;

/**
 *
 * @author YRM
 */
public class Arreglo{
    
    public String nombre;
    public int edad;
    
    public Arreglo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre + "\t"
                           + "Edad: " + edad);
    }

}
