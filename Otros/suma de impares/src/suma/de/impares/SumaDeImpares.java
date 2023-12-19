/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.impares;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class SumaDeImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Ingrese cuantos numeros primos quiere sumar");
        n=s.nextInt();
        for(i=1;i<n*2;i+=2){
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println("La suma de los primeros "+n+" numerso impares es "+sum);
    }
    
}
