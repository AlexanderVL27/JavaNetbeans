/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Caracol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int p,ms,mb,dias=0,me=0;
       Scanner s= new Scanner (System.in);
       System.out.println("Cuanto mide la pared que tiene que suvir el caracol");
       p=s.nextInt();
       System.out.println("Cuantos metros sube");
       ms=s.nextInt();
       System.out.println("Cuantos metros baja");
       mb=s.nextInt();
       
       dias=(p-mb)/(ms-mb);
       
       if ((p-mb)%(ms-mb)!=0){
           
           dias=dias+1;
           
       }
       if (dias<=0){
               System.out.println("Error el caracol no puede subir en dias negativos");
           }
       System.out.println("Sube la pared de "+p+" metros en "+ dias+" dias");
        
    }
    
}
