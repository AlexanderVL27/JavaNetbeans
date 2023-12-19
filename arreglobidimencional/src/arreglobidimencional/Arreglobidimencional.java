/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobidimencional;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Arreglobidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int f,c;
        do {
                System.out.println("Tamaño de filas");
                f=s.nextInt();
            }while (f<0||f>100);
            do  {
                System.out.println("Tamaño de columnas");
                c=s.nextInt();
            }while(c<0||c>100);
        int arreglob[][]=new int [f][c];
        int arregloi[][]=new int [f][c];
        
        System.out.println("Ingrese los numeros del arreglo");
        for (int i = 0; i < arreglob[0].length; i++) {
            for (int j = 0; j < arreglob[0].length; j++) {
                System.out.println("Digiite el numero de la posicion "+i+ " , "+j);
                arreglob[i][j]=s.nextInt();
            }
            System.out.println("-------------------------------------------------");
        }
        for (int x=0; x < arreglob.length; x++) {
            System.out.print("|");
            for (int y=0; y < arreglob[x].length; y++) {
                System.out.print (arreglob[x][y]);
                if (y!=arreglob[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        
        int l=f-1;
        for (int i = 0; i < arreglob[0].length; i++) {
            for (int j = 0; j < arreglob[0].length; j++) {
                arregloi[l][j]=arreglob[i][j];
            }
            l--;
        }
        System.out.println("-------------------------------------------------");
        for (int x=0; x < arregloi.length; x++) {
            System.out.print("|");
            for (int y=0; y < arregloi[x].length; y++) {
                System.out.print (arregloi[x][y]);
                if (y!=arregloi[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    
}
