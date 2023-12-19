/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n,facf,fact = 1,j;
        System.out.println("Ingrese cuantos factoriales quiere");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;++i)
        {
            fact=1;
            for (j =1 ; j <= i; j++) {
                fact=fact*j;
            }
            System.out.println(i+"! "+fact);
        }
        
        
    }
    
}
