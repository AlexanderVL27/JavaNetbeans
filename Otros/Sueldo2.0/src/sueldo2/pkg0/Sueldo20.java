/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo2.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Sueldo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        float sue,sue2,sue3;
        Scanner s= new Scanner (System.in);
        System.out.println("Cual es el sueldo del trabajador");
        sue=s.nextFloat();
        
        if(sue<1000)
        {
        sue2=sue*15/100;
        sue3=sue+sue2;
        System.out.println("El sueldo con el aumento es "+sue3);
        }
    }
    
}
