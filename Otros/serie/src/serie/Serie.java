/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        float r,sum = 0;
        System.out.println("Cuantos numeros va ingresar");
        n=s.nextInt();
        for (int i = 2; i <= (n+1); i++) {
            System.out.print("1/"+i+" = ");
            r=(float) (1/(i*1.0));
            System.out.println(r);
            sum+=r;
            System.out.println("La suma es "+sum);
        }
    }
    
}
