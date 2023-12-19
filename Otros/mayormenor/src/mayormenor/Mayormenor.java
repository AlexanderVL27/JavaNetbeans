/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Mayormenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,may = -99999999,men = 999999999,z; 
        System.out.println("Cuantos numeros quiere ingresar");
        z=s.nextInt();
        for (int i = 1; i <=z; i++) {
            System.out.println("Ingresa un numero");
            n=s.nextInt();
            if(n > may){
                may = n;
            }
            if(n < men){
                men = n;
            }
        }
        System.out.println("El numero mayor es :" + may);
        System.out.println("El numero menor es :" + men);
    }
    
}
