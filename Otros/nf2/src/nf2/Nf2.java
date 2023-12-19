/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Nf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 1;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese n");
        n=s.nextInt();
        do {
            int saveFib1 = fib1;
            fib1 = fib2;
            fib2 = saveFib1 + fib2;
        }
    while (fib2 < n);

    if (fib2 == n)
            System.out.println("si esta");
    else
            System.out.println("no esta");

}
    }
