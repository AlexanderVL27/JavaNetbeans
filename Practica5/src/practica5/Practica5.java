/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float s1,ss,sa;
        Scanner s= new Scanner (System.in);
        System.out.println("Escribir el sueldo del operador tecnico");
        s1=s.nextFloat();
        ss=s1*3;
        sa=(ss-s1)*12;
        System.out.println("El suelo del supervisor es: "+ss);
        System.out.println("La diferencia de sueldo al año es: "+sa);
    }
    
}
