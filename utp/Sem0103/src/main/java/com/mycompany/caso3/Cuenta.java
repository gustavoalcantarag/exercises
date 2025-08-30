/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caso3;

/**
 *
 * @author YRM
 */
public class Cuenta {

    public static void main(String[] args) {
        
        String cuenta = "1234-5678-1234";
        int saldo = 500;
        int montoRetiro = 490;
        
        Operaciones operaciones = new Operaciones(cuenta,saldo);
        operaciones.Retiro(montoRetiro);
        operaciones.Retiro();
    }
}

class Operaciones{
    
    public String cuenta;
    public int saldo;
    
    public Operaciones(String cuenta, int saldo){
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    public void Retiro(int montoRetiro){
        if(saldo > montoRetiro){
            saldo = saldo - montoRetiro;
            System.out.println("El saldo actual luego del retiro es: "+saldo);
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
    public void Retiro(){
        if(saldo > 20){
            System.out.println("El retiro de todo el monto es: "+ saldo);
        }else{
            System.out.println("Todo el monto no puede ser retirado");
        }
    }
}