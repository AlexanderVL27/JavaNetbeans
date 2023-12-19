/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diag;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Diag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese A");
        a=s.nextInt();
        System.out.println("Ingrese B");
        b=s.nextInt();
        
        sum=a+b;
        
        System.out.println("La suma de a:"+a+" mas b:"+b+" es: "+sum);
    }
}
