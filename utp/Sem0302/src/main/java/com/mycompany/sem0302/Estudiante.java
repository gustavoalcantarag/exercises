/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem0302;

/**
 *
 * @author YRM
 */
public abstract class Estudiante {
    
    String identificacion;
    String nombre;

    public Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "identificacion=" + identificacion + ", nombre=" + nombre + '}';
    }
    
}
