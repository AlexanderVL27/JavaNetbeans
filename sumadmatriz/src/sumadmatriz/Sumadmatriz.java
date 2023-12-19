/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadmatriz;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Sumadmatriz {

    public static void main(String[] args) {
        int f = 0 ,c = 0,maxf=10,maxc=20;
        Scanner s = new Scanner(System.in);
        System.out.println("Solo numeros enteros, para filas menores a 10 y para columnas menores a 20");
        do {
                System.out.println("Tamaño de filas");
                f=s.nextInt();
            }while (f<0||f>maxf);
            do  {
                System.out.println("Tamaño de columnas");
                c=s.nextInt();
            }while(c<0||c>maxc);
        int [][] m1=new int [f][c];
        int [][] m2=new int [f][c];
        int [][] r=new int [f][c];
        leerm1(m1);
        leerm2(m2);
        suma(r,m1,m2);
        System.out.println("====================================================================================");
        print(r,m1,m2);
    }
    public static void leerm1(int m1[][]){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < m1.length; ++i) {
            for (int j = 0; j < m1[0].length; ++j) {
                System.out.println("Numero de la matriz 1_ "+i+" "+j);
                m1[i][j]=s.nextInt();
            }
        }
    }
    public static void leerm2(int m2[][]){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < m2.length; ++i) {
            for (int j = 0; j < m2[0].length; ++j) {
                System.out.println("Numero de la matriz 2_ "+i+" "+j);
                m2[i][j]=s.nextInt();
            }
        }
    }

    public static void suma(int r[][],int m1[][],int m2[][]){
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                r[i][j]=m1[i][j]+m2[i][j];
            }
        }
    }
    public static void print(int r[][],int m1[][],int m2[][]){
        for (int i = 0; i < r.length; ++i) {
            for (int j = 0; j < r[0].length; ++j) {
                System.out.println(m1[i][j]+" + "+m2[i][j]+" = "+r[i][j]);
            }
        }
    }
}
