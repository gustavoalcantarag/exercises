/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.caso1;

import java.util.Scanner;

/**
 *
 * @author YRM
 */
public class Embarque {

    public static void main(String[] args) {

        try ( Scanner ingresaDatos = new Scanner(System.in)) {
            System.out.println("Ingrese codigo de embarque: ");
            String codigoEmbarque = ingresaDatos.nextLine();

            System.out.println("Ingrese nombre de distribuidor: ");
            String nombreDistribuidor = ingresaDatos.nextLine();

            System.out.println("Ingrese tipo de ladrillo (King Kong (K) o Pandereta (P)): ");
            String tipoLadrillo = ingresaDatos.nextLine();

            System.out.println("Ingrese tipo de camion (Paletizados (P) o Con Guinche (G)): ");
            String tipoCamion = ingresaDatos.nextLine();

            System.out.println("Ingrese cantidad de ladrillo: ");
            int cantidadLadrillos = ingresaDatos.nextInt();

            Calculos calculos = new Calculos();

            calculos.setCodigoEmbarque(codigoEmbarque);
            calculos.setNombreDistribuidor(nombreDistribuidor);
            calculos.setTipoLadrillo(tipoLadrillo);
            calculos.setTipoCamion(tipoCamion);
            calculos.setCantidadLadrillos(cantidadLadrillos);

            calculos.Costoladrillo(calculos.getTipoLadrillo(), calculos.getCantidadLadrillos());
            calculos.Costoenvio(calculos.getCantidadLadrillos(), calculos.getTipoCamion());
            calculos.Costototalemb();
        }
    }
}

class Calculos {

    private String codigoEmbarque;
    private String nombreDistribuidor;
    private String tipoLadrillo;
    private String tipoCamion;
    private int cantidadLadrillos;

    double costoLadrillo = 0.00;
    int costoEnvio = 0;

    public void setCodigoEmbarque(String codigoEmbarque) {
        this.codigoEmbarque = codigoEmbarque;
    }

    public String getCodigoEmbarque() {
        return codigoEmbarque;
    }

    public void setNombreDistribuidor(String nombreDistribuidor) {
        this.nombreDistribuidor = nombreDistribuidor;
    }

    public String getNombreDistribuidor() {
        return nombreDistribuidor;
    }

    public void setTipoLadrillo(String tipoLadrillo) {
        this.tipoLadrillo = tipoLadrillo;
    }

    public String getTipoLadrillo() {
        return tipoLadrillo;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setCantidadLadrillos(int cantidadLadrillos) {
        this.cantidadLadrillos = cantidadLadrillos;
    }

    public int getCantidadLadrillos() {
        return cantidadLadrillos;
    }

    public void Costoladrillo(String tipoLadrillo, int cantidadLadrillos) {
        if (tipoLadrillo.equals("K")) {
            costoLadrillo = cantidadLadrillos * 1.20;
        } else {
            costoLadrillo = cantidadLadrillos * 1.00;
        }
    }

    public void Costoenvio(int cantidadLadrillos, String tipoCamion) {
        if (cantidadLadrillos <= 3000) {
            if (tipoCamion.equals("P")) {
                costoEnvio = 420;
            } else {
                costoEnvio = 490;
            }
        } else {
            if (tipoCamion.equals("P")) {
                costoEnvio = 350;
            } else {
                costoEnvio = 420;
            }
        }
    }

    public void Costototalemb() {

        System.out.println("Codigo de embarque: " + codigoEmbarque);
        System.out.println("Nombre de distribuidor: " + nombreDistribuidor);
        System.out.println("Costo total de embarque: " + 1.19 * (costoLadrillo + costoEnvio));
    }
}
