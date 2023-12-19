/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosxd;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Numerosxd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        int a,b,c,su,suma;
        System.out.println("Teclee los 3 dijitos");
        a=s.nextInt();
        b=a%10;
        a=a/10;
        c=a%10;
        a=a/10;
        su=a%10;
        suma=b+su;
        System.out.println("Los digitos alrevez son: "+b+c+su);
        System.out.println("La suma de "+b+"+"+su+" es "+suma);
        
        
    }
    
}
