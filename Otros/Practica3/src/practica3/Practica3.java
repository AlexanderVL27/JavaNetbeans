/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float cost,ant,num,res,res2;
        Scanner s= new Scanner (System.in);
        System.out.println("Costo de la computadora");
        cost=s.nextFloat();
        System.out.println("Anticipo");
        ant=s.nextFloat();
        System.out.println("Numero de meses en el cual debe pagar");
        num=s.nextFloat();
        res=cost-ant;
        res2=res/num;
        System.out.println("Cantidad a pagar por mes "+res2);
        
    }
    
}
