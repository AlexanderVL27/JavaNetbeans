/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalones;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Pantalones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int np,c,d,a,o,oo;
        Scanner s= new Scanner (System.in);
        System.out.println("Cuantos pantalones compro");
        np=s.nextInt();
        System.out.println("Cual es el precio por pantalon");
        c=s.nextInt();
        System.out.println("Cual es el descuento _%");
        d=s.nextInt();
        o=np*c;
        oo=o*d/100;
        System.out.println("Se ahorro con el "+ d + "% de decuento un total de "+oo+" pesos");
    }
    
}
