/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sem0302;

/**
 *
 * @author YRM
 */
public class ProgramaPolimorfismo {

    public static void main(String[] args) {
        
        Estudiante e1 = new EstudianteSecundaria("Noche",8,"09212399","Pepito Perez");
        Estudiante e2 = new EstudianteSecundaria("Mañana",6,"09254678","Juan Mesa");
        Estudiante e3 = new EstudianteUniversitario("UPC","Examen","09288765","Yanina Ruiz");
        Estudiante e4 = new EstudianteUniversitario("UNFV","Cepre","09209601","Pedro Lopez");
        
        Estudiante lista[] = {e1,e2,e3,e4};
        
        for(int x=0; x<lista.length;x++){
            if(lista[x] instanceof EstudianteSecundaria)
                System.out.println(((EstudianteSecundaria)lista[x]).toString());
            else if(lista[x] instanceof EstudianteUniversitario)
                System.out.println(((EstudianteUniversitario)lista[x]).toString());
        }
    }
}
