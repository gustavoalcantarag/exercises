/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caso7;

/**
 *
 * @author YRM
 */
public class PagoEstudiante {

    public static void main(String[] args) {
        
        String nombres = "Yanina";
        String apellidos = "Ruiz Manayay";
        String semestre = "2022-I";
        
        String categoria = "A";
        String colegioProc = "Estatal";
        Double promedioPond = 15.0;
        
        EstudianteDePreGrado est = new EstudianteDePreGrado(apellidos,nombres,semestre);
        
        est.setNombres(nombres);
        est.setApellidos(apellidos);
        est.setSemestre(semestre);
   
        est.categoria=categoria;
        est.colegioProc=colegioProc;
        est.promedioPond=promedioPond;
        
        int pagoparcialpension = est.PagoParcialPension();
        double descuento = est.Descuentos(pagoparcialpension);
        double pagoFinal = est.PagoFinal(pagoparcialpension,descuento);
        String codigo = est.getCodigo();
        
        System.out.println("Apellido del estudiante: "+est.getApellidos());
        System.out.println("Nombre del estudiante: "+est.getNombres());
        System.out.println("Semestre del estudiante: "+est.getSemestre());
        System.out.println("El pago final a pagar es: "+pagoFinal);
        System.out.println("El codigo generado del estudiante es: "+codigo);
        
        System.out.println("------------------------------------------");
        
        est.setNombres("Giovanny");
        est.setApellidos("Alcantara");
        est.setSemestre("2022-II");
   
        est.categoria="B";
        est.colegioProc="Particular";
        est.promedioPond=12.0;
        
        pagoparcialpension = est.PagoParcialPension();
        descuento = est.Descuentos(pagoparcialpension);
        pagoFinal = est.PagoFinal(pagoparcialpension,descuento);
        codigo = est.getCodigo();
        
        System.out.println("Apellido del estudiante: "+est.getApellidos());
        System.out.println("Nombre del estudiante: "+est.getNombres());
        System.out.println("Semestre del estudiante: "+est.getSemestre());
        System.out.println("El pago final a pagar es: "+pagoFinal);
        System.out.println("El codigo generado del estudiante es: "+codigo);
    }
}




