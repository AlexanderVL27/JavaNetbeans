/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balon;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Balon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        System.out.println("Cual es la presion del balon");
        int pr=s.nextInt();
        
        if(pr>9)
        {
            if(pr<=16)
            
                System.out.println("Balon autorizado");
            else
                System.out.println("Balon rechazado");
        }
        else
            System.out.println("Balon rechazado");
    }
    
}
