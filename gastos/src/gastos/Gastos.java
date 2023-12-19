/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastos;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Gastos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        double suma=0,gastos;
        System.out.println("Digite los gastos ");
        gastos=s.nextDouble();
        while (gastos!=-1){
            suma+=gastos;
            System.out.println("Leer gastos ");
            gastos=s.nextDouble();
        }
        System.out.println("Total de gastos: "+suma);
    }
    
}
