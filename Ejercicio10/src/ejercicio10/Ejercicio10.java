/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        double x1,x2,y1,yy,a,b,c,d,e,f;
        
        System.out.println("Escriba el valor de x1");
        x1=s.nextInt();
        System.out.println("Escriba el valor de x2");
        x2=s.nextInt();
        System.out.println("Escriba el valor de y1");
        y1=s.nextInt();
        System.out.println("Escriba el valor de y2");
        yy=s.nextInt();
        a=x2-(x1);
        b=yy-y1;
        c=(int) Math.pow(a, 2);
        d=(int) Math.pow(b, 2);
        
        e=c+d;
       
       f=Math.sqrt(e);
       
       System.out.println("La distancia sera de: "+f);
    }
    
}
