/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.caso2;

import java.util.Scanner;

/**
 *
 * @author YRM
 */
public class Secretaria {

    int movilidad;

    public static void main(String[] args) {

        try ( Scanner ingresaDatos = new Scanner(System.in)) {
            System.out.println("Ingrese codigo: ");
            String codigo = ingresaDatos.nextLine();

            System.out.println("Ingrese nombres: ");
            String nombres = ingresaDatos.nextLine();

            System.out.println("Ingrese categoria A o B: ");
            String categoria = ingresaDatos.nextLine();

            System.out.println("Ingrese condicion (E)Estable o (C)Contratado: ");
            String condicion = ingresaDatos.nextLine();

            Calculos calculos = new Calculos(categoria, condicion);
            Secretaria movilidad = new Secretaria();

            calculos.sueldoBase();
            calculos.Esalud();

            System.out.println("Codigo: " + codigo);
            System.out.println("Nombres: " + nombres);
            System.out.println("Sueldo Bruto: " + calculos.Sueldobruto(movilidad.Movilidad(condicion)));
            System.out.println("Sueldo Neto: " + calculos.Sueldoneto(movilidad.Movilidad(condicion)));
        }
    }

    public int Movilidad(String condicion) {
        if (condicion.equals("E")) {
            movilidad = 300;
        } else {
            movilidad = 200;
        }
        return movilidad;
    }
}

class Calculos {

    public int sueldoBase;
    public double dcto;

    public int sueldobruto;
    public double sueldoneto;

    public String categoria;
    public String condicion;

    public Calculos(String categoria, String condicion) {
        this.categoria = categoria;
        this.condicion = condicion;
    }

    public void sueldoBase() {
        if (categoria.equals("A")) {
            if (condicion.equals("E")) {
                this.sueldoBase = 6000;
            } else {
                this.sueldoBase = 8000;
            }
        } else {
            if (condicion.equals("E")) {
                this.sueldoBase = 5000;
            } else {
                this.sueldoBase = 7000;
            }
        }
    }

    public void Esalud() {
        dcto = sueldoBase - (sueldoBase * 0.03);
    }

    public int Sueldobruto(int movilidad) {
        sueldobruto = sueldoBase + movilidad;
        return sueldobruto;
    }

    public double Sueldoneto(int movilidad) {
        sueldoneto = movilidad + dcto;
        return sueldoneto;
    }
}
