/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Cuantos numeros quiere ordenar");
        int n=s.nextInt();
        int a[]=new int [n];
        for (int j = 1; j <= n; j++) {
            System.out.println("Digite los numeros a ordenar");
            a[j-1]=s.nextInt();
        }
        boolean inter=true;
        int aux;
        for (int i = 0; i < a.length-1&&inter; i++) {
            inter=false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    inter=true;
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
        System.out.println("Numeros en orden");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }
    
}
