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
public class Sumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo();
        Racional r = new Racional();
        Racional r2 = new Racional();
        c1.llenar();
        c2.llenar();
        r.llenar();
        r2.llenar();
        Complejo resul = new Complejo();
        Racional resul2 = new Racional();
        resul = sumac(c1, c2);
        resul2=sumar(r, r2);
        resul.imprimir();
        resul2.imprimir();
    }

    public static Complejo sumac(Complejo c1, Complejo c2) {
        Complejo r = new Complejo();
        r.setReal(c1.getReal() + c2.getReal());
        r.setImaginario(c1.getImaginario() + c2.getImaginario());
        return r;
    }

    public static Racional sumar(Racional r, Racional r2) {
        Racional a=new Racional();
        a.setNumerador((r.getNumerador()*r2.getDenominador())+(r2.getNumerador()*r.getDenominador()));
        a.setDenominador(r.getDenominador()*r2.getDenominador());
        return a;
    }
}
