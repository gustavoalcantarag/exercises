/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso6;

/**
 *
 * @author YRM
 */
public class ProgramadorWeb extends PersonalSistema{
    
    String categoria;
    String especialidad;
    int codigo;
    
    int sueldobase;
    double bonificacion;
    double sueldofinal;

    public ProgramadorWeb(String categoria, String especialidad, String apellidos, String nombres, String dni, int codigo) {
        super(apellidos, nombres, dni);
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.codigo = codigo;
    }

    public int SueldoBase(){
        if(categoria.equals("Senior"))
            sueldobase = 2900;
        else
            sueldobase = 3700;
        return sueldobase;
    }
    
    public double Bonificacion(int sueldobas){
        if(especialidad.equals("Java Developer"))
            bonificacion = sueldobase*0.19;
        else
            bonificacion = sueldobase*0.21;
        return bonificacion;
    }
    
    public double SueldoFinal(int sueldobas, double bonificacio){
        sueldofinal = sueldobas + bonificacio;
        return sueldofinal;
    }
    
    public String getCodigo() {
        String contad = Integer.toString(codigo);
        for(int i = 0; i<3; i++){
            contad = "0"+contad;
        }
        return "PS"+contad;
    }
    
    @Override
    String MostrarInformacion(){
        return super.MostrarInformacion()+
                "\n *************** CALCULOS DE PAGOS ************** "+
                "\nCategoria                       : "+categoria+
                "\nEspecialidad                  : "+especialidad+
                "\nSueldo Base                  : "+SueldoBase()+
                "\nBonificacion                   : "+Bonificacion(SueldoBase())+
                "\nSueldo Final                   : "+SueldoFinal(SueldoBase(), Bonificacion(SueldoBase()))+
                "\nCodigo                           : "+getCodigo()+
                "\n";
    }
}
