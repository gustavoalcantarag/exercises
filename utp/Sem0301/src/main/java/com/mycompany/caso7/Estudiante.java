/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso7;

/**
 *
 * @author YRM
 */
public abstract class Estudiante{
    private String apellidos;
    private String nombres;
    private String semestre; //2022-I o 2022-II

    public Estudiante(String apellidos, String nombres, String semestre) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.semestre = semestre;
    }
    
    public double PagoFinal(int pago,double dcto){
        return pago - dcto;
    }
    
    public abstract int PagoParcialPension();
    public abstract double Descuentos(int pagoparcial);

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
