/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumas;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Racional {
    private int numerador,denominador;

    public Racional() {
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println("Ingrese el numero Radical");
        numerador=s.nextInt();
        System.out.println("--");
        denominador=s.nextInt();
    }
    public void imprimir(){
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println(numerador);
        System.out.println("--");
        System.out.println(denominador);
    }
}
