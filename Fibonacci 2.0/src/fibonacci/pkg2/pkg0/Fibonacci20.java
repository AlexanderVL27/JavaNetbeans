/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.pkg2.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Fibonacci20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero fibonacci");
        int n=s.nextInt();
        F2 a = new F2();
        
        System.out.println(a.fibonacci(n));
    }
    
}
