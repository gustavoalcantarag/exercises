package com.mycompany.sem0501;

/**
 *
 * @author YRM
 */
public class Doctor extends EmpleadosHospital implements Datos, Formatos{
    
    String titulomedico;
    int codigo;

    public Doctor(String titulomedico, String codigo, String nombres, String DNI) {
        super(codigo, nombres, DNI);
        this.titulomedico = titulomedico;
    }
    
    @Override
    public double Sueldoinicial() {
        if(titulomedico.equals(titulomedico1))
            return sueldodoctor1;
        else
            return sueldodoctor2;
    }

    @Override
    public double PagoHorasExtras() {
        return 0;
    }

    @Override
    public String GenerarCodigo() {
        String contad = Integer.toString(codigo);
        for(int i = 0; i<3; i++){
            contad = "0"+contad;
        }
        return "MED"+contad;
    }
}
