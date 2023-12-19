/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno;
import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Seno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sen=0,x,i,fact = 1,j=1,facf;
        int numero;
        System.out.println("Ingrese la base:"); 
        x = s.nextDouble();
        System.out.println("Ingrese el numero de acercamiento:");       
        numero = s.nextInt();
        for(i=1;i<=numero;++i)
        {
            
           facf=(1+(2*(i-1)));
                while(j<=facf){
                     fact= fact*j;
                     j++;
                 }
                  if(i%2==0){
                      sen = sen - (Math.pow(x,(1+(2*(i-1)))) /fact);
                  }
                              
                 else
                      sen = sen + (Math.pow(x,(1+(2*(i-1)))) /fact); 
           }  
           System.out.println("El seno de: " +x+ " es " +sen);
      }
    
}
