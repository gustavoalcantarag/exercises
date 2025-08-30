/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caso4;

/**
 *
 * @author YRM
 */
public class DocenteHorario {
    public static void main(String[] args) {
        //Horario horario = new Horario();
        Docente docente = new Docente();
        docente.setValores("Pepito Develop", "Programacion");
        System.out.println(docente.Datos());
    }
}

class Horario {
    String docente;
    String cursoD;
    
    public void setValores(String nombre, String curso){
        docente = nombre;
        cursoD = curso;
    }
}

class Docente extends Horario{
    public String Datos(){
        return "El nombre del docente es "+docente+" y ensena el curso de "+cursoD;
    }
}