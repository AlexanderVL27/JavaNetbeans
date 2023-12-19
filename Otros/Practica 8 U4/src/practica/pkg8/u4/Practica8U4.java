
package practica.pkg8.u4;

import java.util.Scanner;

public class Practica8U4 {

    public static void main(String[] args) {
        int arreglobi[][]=new int[3][4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arreglobi.length; ++i) {
            for (int j = 0; j < arreglobi[0].length; ++j) {
                System.out.println("Numero de la posicion "+(i+1)+" "+(j+1));
                arreglobi[i][j]=s.nextInt();
            }
        }
        calcular(arreglobi);
        prom(arreglobi);
    }

    public static void calcular(int[][] arreglobi) {
        int suma=0;
        for (int i = 0; i < arreglobi.length; ++i) {
            for (int j = 0; j < arreglobi[0].length; ++j) {
                suma+=arreglobi[i][j];
            }
        }
        System.out.println("La suma de todas las celdas del arreglo es "+suma);
    }

    public static void prom(int[][] arreglobi) {
        float suma=0,prom=0,mult=0;
        for (int i = 0; i < arreglobi.length; ++i) {
            for (int j = 0; j < arreglobi[0].length; ++j) {
                suma+=arreglobi[i][j];
                mult++;
            }
        }
        prom=suma/mult;
        System.out.println("Promedio "+prom);
    }
    
}
