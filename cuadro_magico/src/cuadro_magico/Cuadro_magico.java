/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadro_magico;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Cuadro_magico {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        
        do {
            System.out.println("De cuanto es el cuadro magico");
            n=s.nextInt();
        } while (((n%2)!=1)||(n>11)||n==1);
        int pi=n-2;
        int matrizmag[][]=new int [n][n];
        llenarmatrizdeceros(matrizmag,n);
        cuadromag(matrizmag,pi,n);
        mostrarmatriz(matrizmag);
    }

    public static void llenarmatrizdeceros(int[][] matrizmag, int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizmag[i][j]=0;
            }
        }
    }

    private static void cuadromag(int[][] matrizmag, int pi,int n) {
        int i=0,j=pi,ia=0,ja=0,contador=1;
        
        while(contador!=(n*n)+1){
            if (matrizmag[i][j]==0) {
                matrizmag[i][j]=contador;
            }else{
                i=ia+1;
                j=ja;
                matrizmag[i][j]=contador;
            }
            ia=i;
            ja=j;
            contador++;
            j++;
            i--;
            if (i<0&&j==n) {
                i=n-1;
                j=0;
            }else if (i<0) {
                i=i+n;
            }else if (j==n) {
                j=0;
            }
        }
    }

    private static void mostrarmatriz(int[][] matrizmag) {
        for (int x=0; x < matrizmag[0].length; x++) {
            System.out.print("|");
            for (int y=0; y < matrizmag[x].length; y++) {
                System.out.print (matrizmag[x][y]);
                if (y!=matrizmag[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    
}
