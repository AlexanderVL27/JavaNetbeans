/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depreciacion;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Depreciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        int o,met;
        float m1,m2=0,m3,m4,m5,m6,m7,m8,m9,facdep,a;
        System.out.println("Cual es el valor original del objeto");
        o=s.nextInt();
        System.out.println("Cual es la vida del objeto");
        a=s.nextFloat();
        System.out.println("Cual es el metodo que quiere usar");
        met=s.nextInt();
        
        switch(met){
            
            case 1: 
                m1=o/a;
                for (int i = 1; i <= a; ++i) {
                    m3=m1*i;
                    m2=o-m3;
                    
                    System.out.println("El valor de la depreciacion del año "+i+" es "+m2);
                    
                }
            break;
            case 2: 
                
                facdep= 2/a;
                
                for (int j = 1; j <=a ; ++j) {
                    
                    m6=facdep*j;
                    m4=m6*o;
                    m5=o-m4;
                    if (m5==0) {
                        
                        System.out.println("El valor de la deprecioacion del año "+j+" es "+m5);
                        break;
                    }
                    System.out.println("El valor de la deprecioacion del año "+j+" es "+m5);
                }
        }
    }
    
}
