/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,res,a,b;
        Scanner s= new Scanner (System.in);
        System.out.println("Numero de latas recolectadas");
        num1=s.nextInt();
        res=num1/2;
        a=res+20;
        b=res-20;
        System.out.println("Latas del alumno con la idea "+a);
        System.out.println("Latas del 2do alumno "+b);
    }
    
}
