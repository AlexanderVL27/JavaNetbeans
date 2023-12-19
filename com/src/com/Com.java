/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Com {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba un numero entero...");
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();
           
                        int x = 1;
                        int sum = 0;
                        for(int i = 1; i < n; i++)
                        {
                        sum += x;
                        x += 2;
                        System.out.println(x);
                        }
                        System.out.println("The sum of first " + n + " positive odd integers is: " + sum);
                       

    }
    
}
