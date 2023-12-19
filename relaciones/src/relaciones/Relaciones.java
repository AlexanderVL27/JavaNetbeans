/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner s= new Scanner (System.in);
        System.out.println("La edad de Lalo es igual o mayor que la de Pedro,representa mediante operadores de relacion");
        String simbolo=s.next();
        
        if(simbolo.equals(">=")){
            
            System.out.println("Asi es la edad de Lalo es "+simbolo+" que la de Pedro");
        }
        else{
            System.out.println("Error");
        }
    }
    
}
