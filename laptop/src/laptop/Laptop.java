/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Laptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner s= new Scanner (System.in);
        System.out.println("Que marca es la laptop");
        String marca=s.next();
        System.out.println("Cual es el precio normal de la laptop");
        double pl=s.nextDouble();
        System.out.println("Cual es el descuento _%");
        double d=s.nextDouble();
        double pp=pl*d/100;
        double pf=pl-pp;
        System.out.println("El total a pagar de la laptop de marca "+marca+" es "+ pf+" pesos");
    }
    
}
