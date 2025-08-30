/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso7;

/**
 *
 * @author YRM
 */
public class EstudianteDePreGrado extends Estudiante{
    
    String categoria; //A o B
    Double promedioPond;
    String colegioProc; //Estatal o particular
    
    //String codigo;

    int contador = 1;
    int pagoparcial;
    Double descSobrePago;

    public EstudianteDePreGrado(String apellidos, String nombres, String semestre) {
        super(apellidos, nombres, semestre);
    }
    
    @Override
    public int PagoParcialPension() {
        if(categoria.equals("A")){
            if(colegioProc.equals("Estatal")){
                pagoparcial = 320;
            }else{
                pagoparcial = 450;
            }
        }else{
            if(colegioProc.equals("Estatal")){
                pagoparcial = 300;
            }else{
                pagoparcial = 420;
            }
        }
        return pagoparcial;
    }

    @Override
    public double Descuentos(int pagoparcial) {
        if(promedioPond <= 13){
            descSobrePago = pagoparcial*0.02;
        }else{
            descSobrePago = pagoparcial*0.08;
        }
        return descSobrePago;
    }

    public String getCodigo() {
        String contad = Integer.toString(contador);
        for(int i = 0; i<3; i++){
            contad = "0"+contad;
        }
        this.contador = contador+1;
        return "EPRE"+contad;
    }
}
