/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosracionales;

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
        System.out.println("Elaborado por Alexander Villalobos Lazaro");
    }
    public static Racional suma(Racional r, Racional r2){
        Racional a= new Racional();
        if (r.getDenominador()==r2.getDenominador()) {
            a.setDenominador((r.getDenominador()));
            a.setNumerador(r.getNumerador()+r2.getNumerador());
        }
        else 
        {
            a.setNumerador((r.getNumerador()*r2.getDenominador()+r.getDenominador()*r2.getNumerador()));
            a.setDenominador(r.getDenominador()*r2.getDenominador());
        }
        return a;
    }
    public static Racional resta(Racional r, Racional r2){
        Racional a= new Racional();
        if (r.getDenominador()==r2.getDenominador()) {
            a.setDenominador((r.getDenominador()));
            a.setNumerador(r.getNumerador()-r2.getNumerador());
        }
        else 
        {
            a.setNumerador((r.getNumerador()*r2.getDenominador()-r.getDenominador()*r2.getNumerador()));
            a.setDenominador(r.getDenominador()*r2.getDenominador());
        }
        return a;
    }
    
    public static Racional mult(Racional r, Racional r2){
        Racional a = new Racional();
        a.setNumerador((r.getNumerador()*r2.getNumerador()));
        a.setDenominador((r.getDenominador()*r2.getDenominador()));
        return a;
    }
    public static Racional div(Racional r, Racional r2){
        Racional a = new Racional();
        a.setNumerador(r.getNumerador()*r2.getDenominador());
        a.setDenominador(r.getDenominador()*r2.getNumerador());
        
        return a;
    }
}
