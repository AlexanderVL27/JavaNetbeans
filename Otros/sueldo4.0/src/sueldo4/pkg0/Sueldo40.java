/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo4.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Sueldo40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        double hrp,hx,hex,salariob=0,salario=0,s1,s2,s3,s4;
        Scanner s=new Scanner(System.in);
        System.out.println("Introdusca las horas trabajadas");
        h=s.nextInt();
        
        if(h>8){
            salario=125*8;
            hrp=h-8;
            hx=125*1.5;
            hex=hrp*hx;
            salariob=salario+hex;
        }
        else 
            System.out.println("El salario es "+125*h);
        if(salariob>950&&salariob<=1200)
        {
            s1=salariob*20/100;
            s2=salariob-s1;
            System.out.println("El salario bruto es "+salariob+" el salario neto es "+s2);
            
        }
        if(salariob>1200)
        {
            s3=salariob*30/100;
            s4=salariob-s3;
            System.out.println("El salario bruto es "+salariob+" el salario neto es "+s4);
        }
    }
    
}
