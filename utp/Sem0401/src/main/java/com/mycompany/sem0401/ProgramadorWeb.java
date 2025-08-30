package com.mycompany.sem0401;

/**
 *
 * @author YRM
 */
public class ProgramadorWeb extends PersonalSistemas implements Constantes{

    String categoria;
    String especialidad;
    String tipoAfiliacion;
    
    int sueldobase;
    double bonif;
    double dcto;
    int codigo;

    public ProgramadorWeb(String categoria, String especialidad, String tipoAfiliacion, String apellidos, String nombres, String sexo, String dni, int codigo) {
        super(apellidos, nombres, sexo, dni);
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.tipoAfiliacion = tipoAfiliacion;
        this.codigo = codigo;
    }

    @Override
    public double SueldoBase() {
        if(categoria.equals("Senior")){
            if(especialidad.equals("Java Developer")){
                sueldobase = 2900;
            }else{
                sueldobase = 2800;
            }
        }else{
            if(especialidad.equals("Java Developer")){
                sueldobase = 3700;
            }else{
                sueldobase = 3200;
            }
        }
        return sueldobase;
    }

    @Override
    public double Bonificacion() {
        if(especialidad.equals("Java Developer")){
            bonif = sueldobase*0.19;
        }else{
            bonif = sueldobase*0.21;
        }
        return bonif;
    }

    @Override
    public double Descuentos() {
        if(tipoAfiliacion.equals("AFP")){
            dcto = sueldobase*afp;
        }else{
            dcto = sueldobase*snp;
        }
        return dcto;
    }
    
    public String getCodigo() {
        String contad = Integer.toString(codigo);
        for(int i = 0; i<3; i++){
            contad = "0"+contad;
        }
        return "PS"+contad;
    }
    
    
    public String MostrarDatos() {
        return 
                "--------------------------------------------------------"+
                "\nApellidos                             : "+super.apellidos+
                "\nNombres                             : "+super.nombres+
                "\nSexo                                   : "+super.sexo+
                "\nDNI                                     : "+super.dni+
                "\n *************** CALCULOS DE PAGOS ************** "+
                "\nCategoria                             : "+categoria+
                "\nEspecialidad                        : "+especialidad+
                "\nTipo de Afiliacion                  : "+tipoAfiliacion+
                "\nSueldo base                         : "+SueldoBase()+
                "\nBonificacion                         : "+Bonificacion()+
                "\nDescuentos                         : "+Descuentos()+
                "\nSueldo Neto                        : "+super.CalculoSueldoNeto()+
                "\nCodigo                                : "+getCodigo()+
                "\n";
    }
}
