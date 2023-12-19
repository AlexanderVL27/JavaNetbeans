/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float dias,horas,mint,mind;
        Scanner s= new Scanner (System.in);
        System.out.println("Numero de dias en los que debe leer");
        dias=s.nextFloat();
        System.out.println("Numero de horas de lectura");
        horas=s.nextFloat();
        mint=horas*60;
        mind=mint/dias;
        System.out.println("Minutos totales "+mint);
        System.out.println("Minutos por dia "+mind);
    }
    
}
