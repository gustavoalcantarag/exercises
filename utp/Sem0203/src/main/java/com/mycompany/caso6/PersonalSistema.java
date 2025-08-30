/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso6;

/**
 *
 * @author YRM
 */
public class PersonalSistema {
    
    String apellidos;
    String nombres;
    String dni;

    public PersonalSistema(String apellidos, String nombres, String dni) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
    }
    
    String MostrarInformacion(){
        return 
                "-------------------------------------------------------------------"+
                "\nApellidos                        : "+apellidos+
                "\nNombres                        : "+nombres+
                "\nDNI                                 : "+dni;
    }           
}