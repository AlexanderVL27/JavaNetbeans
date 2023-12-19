/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author villa_xaz9a7o
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los numero");
        int x=s.nextInt();
        int y=s.nextInt();
        int n=0;
        for (int i = x; i <= y; i++) {
            n=n+i;
        }
        System.out.println("Resultado "+n);
    }
    
}
