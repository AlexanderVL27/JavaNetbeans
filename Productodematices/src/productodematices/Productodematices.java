/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productodematices;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Productodematices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f = 0 ,c = 0,maxf=7,maxc=7,f1,c1;
        Scanner s = new Scanner(System.in);
        do {
                System.out.println("Tamaño de filas matriz uno");
                f=s.nextInt();
            }while (f<3||f>maxf);
                do {
                System.out.println("Tamaño de filas matriz dos");
                f1=s.nextInt();
            }while (f1<3||f1>maxf);
            do  {
                System.out.println("Tamaño de columnas matriz uno");
                c=s.nextInt();
            }while(c<3||c>maxc);
            do  {
                System.out.println("Tamaño de columnas matriz dos");
                c1=s.nextInt();
            }while(c1!=c);
        int [][] m1=new int [f][c];
        int [][] m2=new int [f1][c1];
        int [][] r=new int [f][c];
        leerm1(m1);
        leerm2(m2);
        suma(r,m1,m2,c,f);
        System.out.println("====================================================================================");
        dibujar(m1,f,c); 
        System.out.println("+");
        System.out.println("=================================================");
        dibujar(m2,f,c);
        print(r,m1,m2,f,c);
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

    public static void suma(int r[][],int m1[][],int m2[][],int c,int f){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    r[i][j]+=m1[i][k]*m2[k][j];
                }
                
            }
        }
    }
    public static void print(int r[][],int m1[][],int m2[][],int f,int c){
         for (int fila = 0; fila < f ; ++fila){
      for (int columna = 0; columna < c ; ++columna)
      System.out.print (r[fila][columna] + " ");
      System.out.println("");
            }
        
    }
    public static void dibujar(int m1[][],int f,int c){
            for (int fila = 0; fila < f ; ++fila){
      for (int columna = 0; columna < c ; ++columna)
      System.out.print (m1[fila][columna] + " ");
      System.out.println("");
            }
            System.out.println("=============================================");
        }
}
