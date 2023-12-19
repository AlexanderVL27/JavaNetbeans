/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo3.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Sueldo30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double sue,sue2;
        Scanner s= new Scanner (System.in);
        System.out.println("Cual es el sueldo");
        sue=s.nextDouble();
        System.out.println("Cual es la categoria");
        int cat=s.nextInt();
        
        switch(cat){
            
            case 1: sue=sue*1.15;break;
            case 2: sue=sue*1.10;break;
            case 3: sue=sue*1.08;break;
            case 4: sue=sue*1.07;break;
        }
        System.out.println("El sueldo es "+sue);
    }
    
}
