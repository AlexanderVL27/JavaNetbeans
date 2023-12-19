/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,b = 0,c=0,n,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere calcular");
        n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            b=c;
            c=a+c;
            a=b;
            sum+=a;
            System.out.println(a);
        }
        System.out.println("La suma es "+sum);
    }
    
}
