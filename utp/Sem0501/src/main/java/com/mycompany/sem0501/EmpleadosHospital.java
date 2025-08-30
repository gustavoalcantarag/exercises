package com.mycompany.sem0501;

/**
 *
 * @author YRM
 */
public abstract class EmpleadosHospital implements Constantes{
    
    private String codigo;
    private String nombres;
    private String DNI;

    public EmpleadosHospital(String codigo, String nombres, String DNI) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.DNI = DNI;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public abstract double Sueldoinicial();
    
    public abstract double PagoHorasExtras();
    
    public double SueldoFinal(){
        return Sueldoinicial() + PagoHorasExtras();
    }
    
    public String MostrarAtributos(){
        return
                "Código : "+codigo+
                "\nNombres : "+nombres+
                "\nDNI : "+DNI;
    }
    public String MostrarPagos(){
        return
                "\nSueldo Final : "+SueldoFinal();
    }
}
