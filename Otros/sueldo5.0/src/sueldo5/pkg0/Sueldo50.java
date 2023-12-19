/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo5.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Sueldo50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double nomina=0,sueldo;
        
        for(int i=0;i<10;++i){
            
            System.out.println("Sueldo del trabajador");
            sueldo=s.nextDouble();
            nomina+=sueldo;
        }
        System.out.println("Total nomina = "+nomina);
    }
    
}
