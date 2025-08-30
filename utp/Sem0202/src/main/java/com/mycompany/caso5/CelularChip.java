/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caso5;
import java.util.ArrayList;
/**
 *
 * @author YRM
 */
public class CelularChip {
 
    public static void main(String[] args) {
        Celular cel = new Celular("Samsung","S21","1 GB");
        cel.agregarChip(new Chip("Claro",987654321,"Plan Chevere"));
        cel.agregarChip(new Chip("Movistar",975314567,"Plan Familiar"));
        cel.agregarChip(new Chip("Entel",908676123,"Plan RRSS"));
        
        cel.MostrarInforCelular();
        cel.Mostrar();
    }
}

class Celular{
    
    private String marca;
    private String modelo;
    private String memoria;
    private ArrayList<Chip> listachips = new ArrayList();
    
    public Celular(String marca, String modelo, String memoria){
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }
    
    public void MostrarInforCelular(){
        System.out.println("Marca: "+marca+" | Modelo: "+modelo+" | Memoria: "+memoria);
    }
    public void agregarChip(Chip nuevoChip){
        listachips.add(nuevoChip);
    }
    public void Mostrar(){
        for(int pos=0; pos<listachips.size(); pos++){
            System.out.println("Chip: "+(pos+1));
            System.out.println(listachips.get(pos).toString());
        }
    }
}

class Chip{
    private String operador;
    private int numerochip;
    private String tipoplan;
    
    public Chip(String ope, int numero, String tipo){
        this.operador = ope;
        this.numerochip = numero;
        this.tipoplan = tipo;
    }

    @Override
    public String toString() {
        return "Chip{" + "operador=" + operador + ", numerochip=" + numerochip + ", tipoplan=" + tipoplan + '}';
    }

}