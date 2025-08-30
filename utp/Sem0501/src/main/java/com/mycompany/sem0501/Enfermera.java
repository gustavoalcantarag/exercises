package com.mycompany.sem0501;

/**
 *
 * @author YRM
 */
public class Enfermera extends EmpleadosHospital{
    
    String especializacion; //Cuidado Critico Adulto, Cuidado Neonatal
    double horasprogramadasensemana;

    public Enfermera(String especializacion, double horasprogramadasensemana, String codigo, String nombres, String DNI) {
        super(codigo, nombres, DNI);
        this.especializacion = especializacion;
        this.horasprogramadasensemana = horasprogramadasensemana;
    }

    @Override
    public double Sueldoinicial() {
        if(especializacion.equals(especializacion1))
            return sueldo1;
        else
            return sueldo2;
    }

    @Override
    public double PagoHorasExtras() {
        double result = 0;
        if(horasprogramadasensemana > MaximoHorasEnfermera)
            result = (horasprogramadasensemana-MaximoHorasEnfermera)*pagoadicionalporhora;
        return result;
    }
}
