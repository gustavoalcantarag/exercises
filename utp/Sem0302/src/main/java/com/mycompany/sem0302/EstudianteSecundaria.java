/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem0302;

/**
 *
 * @author YRM
 */
public class EstudianteSecundaria extends Estudiante{
    
    String turno;
    int numeroDeCursos;

    public EstudianteSecundaria(String turno, int numeroDeCursos, String identificacion, String nombre) {
        super(identificacion, nombre);
        this.turno = turno;
        this.numeroDeCursos = numeroDeCursos;
    }

    @Override
    public String toString() {
        return "EstudianteSecundaria{" + "turno=" + turno + ", numeroDeCursos=" + numeroDeCursos + '}';
    }
    
}
