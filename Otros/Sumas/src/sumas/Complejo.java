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
public class Complejo {

    private int real, imaginario;

    public Complejo() {
    }

    public int getReal() {
        return real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }

    public void llenar() {
        Scanner s = new Scanner(System.in);
        System.out.println("◘◘◘◘◘◘◘◘-Z-◘◘◘◘◘◘◘◘");
        System.out.println("Ingrese el numero real");
        real = s.nextInt();
        System.out.println("Ingrese la parte imaginaria");
        imaginario = s.nextInt();
    }

    public void imprimir() {
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        if (imaginario > 0) {
            System.out.println("El resultado de la operacion es:");
            System.out.println(real + " + " + imaginario + "i");
        } else {
            System.out.println("El resultado de la operacion es:");
            System.out.println(real + " " + imaginario + "i");
        }
    }
}
