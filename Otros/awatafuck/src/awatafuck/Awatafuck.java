/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awatafuck;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Awatafuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        double a,b,c=0,x1,x2,d=0;
        
        System.out.println("Ingrece el coeficiente a");
        a=s.nextDouble();
        System.out.println("Ingresa el numero de b");
        b=s.nextDouble();
        System.out.println("Ingresa el numero de c");
        c=s.nextDouble();
        
        d= ((b*b)-(4*(a*c)));
        
        if(d<0){
            System.out.println("La solucion no es real");
            d=d*-1;
            x1= ((-b+Math.sqrt (d))/(2*a));
            x2= ((-b-Math.sqrt (d))/(2*a));
            System.out.println(x1+"i");
            System.out.println(x2+"i");
        }
        else if (d==0){
            System.out.println ("La ecuacion tiene solo una raiz real");
            x1 = (-b)/(2*a);
            System.out.println(x1);
        }
        else {
            if(d>0){
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;
            System.out.println();
            System.out.println("La solucion para x1 es "+x1);
            System.out.println("La solucion para x2 es "+x2);
            System.out.println("Terminado....");
            }
        }
    }
    
}
