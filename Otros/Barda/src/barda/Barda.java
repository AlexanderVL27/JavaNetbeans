/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barda;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Barda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ml,ma,cm,mo,a,b,c;
        Scanner s= new Scanner (System.in);
        System.out.println("Introdusca los metros de largo");
        ml=s.nextInt();
        System.out.println("Introdusca los metros de acho");
        ma=s.nextInt();
        System.out.println("Introdusca el precio por metro cuadrado");
        cm=s.nextInt();
        System.out.println("Introdusca el precio total de la mano de obra");
        mo=s.nextInt();
        a=ml*ma;
        b=a*cm;
        c=b+mo;
        System.out.println("El Total de la obra es "+c);
    }
    
}
