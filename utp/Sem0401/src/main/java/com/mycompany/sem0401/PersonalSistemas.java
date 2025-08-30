package com.mycompany.sem0401;

/**
 *
 * @author YRM
 */
public abstract class PersonalSistemas {
    String apellidos;
    String nombres;
    String sexo;
    String dni;

    public PersonalSistemas(String apellidos, String nombres, String sexo, String dni) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.dni = dni;
    }
    
    public abstract double SueldoBase();
    public abstract double Bonificacion();
    public abstract double Descuentos();
    
    public double CalculoSueldoNeto(){
        return SueldoBase() +  Bonificacion() - Descuentos();
    }
}
