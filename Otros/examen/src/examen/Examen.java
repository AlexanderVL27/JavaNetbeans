/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Examen {

    public static void main(String[] args) {
        int d1,d2;
        enteros e = new enteros();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el numerador");
        d1=s.nextInt();
        System.out.println("Ingresa el denominador");
        d2=s.nextInt();
        System.out.println("El producto es: "+e.resta(d1, d2));
    }
    
}
