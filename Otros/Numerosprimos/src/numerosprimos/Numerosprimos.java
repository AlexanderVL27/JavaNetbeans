/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Numerosprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Si un numero primo solo tiene como divisores a la unidad y a el mismo, selecciona la opcion que represente numeros primos");
        System.out.println("a) 1,3,4,7,,9,11,13,15");
        System.out.println("b) 2,4,6,8,10,12,14,16");
        System.out.println("c) 1,3,5,7,9,11,13,17,19");
        String r=s.next();
        if (r.equals("c")){
            System.out.println("Respuesta correcta, esos son los numeros primos");
        }
        else{
            System.out.println("Error esos no son los numeros primos");
        }
    }
    
}
