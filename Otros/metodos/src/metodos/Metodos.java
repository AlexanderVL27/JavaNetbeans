/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import java.util.Scanner;
import static metodos.arreglo.arreglo;
import static metodos.metburbuja.metburbuja;
import static metodos.print.print;

/**
 *
 * @author villa
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuantos valores quiere");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int [n];
        arreglo(a);
        metburbuja(a);
        print(a);
    }
    
}
