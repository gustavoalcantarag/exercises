/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem0302;

/**
 *
 * @author YRM
 */
public class EstudianteUniversitario extends Estudiante{
    
    String nombreUniversidad;
    String modalidadIngreso;

    public EstudianteUniversitario(String nombreUniversidad, String modalidadIngreso, String identificacion, String nombre) {
        super(identificacion, nombre);
        this.nombreUniversidad = nombreUniversidad;
        this.modalidadIngreso = modalidadIngreso;
    }

    @Override
    public String toString() {
        return "EstudianteUniversitario{" + "nombreUniversidad=" + nombreUniversidad + ", modalidadIngreso=" + modalidadIngreso + '}';
    }

}
