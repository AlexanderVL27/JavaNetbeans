/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        System.out.println("Mi hermana Ana es mayor que mi hermano Antonio, pero mas pequeña que mi hermano");
        System.out.println("Andres. Yo soy mayor que mi hermano Andres: Me llamo Carlos. Seleccione la opcion que");
        System.out.println("describe los nombres de mayor a menor edad: ");
        System.out.println("a) Andres,Carlos,Ana,Antonio");
        System.out.println("b) Andres,Ana,Carlos,Antonio");
        System.out.println("c) Carlos,Andres,Ana,Antonio");
        
        String res=s.next();
        
        if(res.equals("c")){
            System.out.println("Respuesta correcta, es "+res);
        }
        else{
            System.out.println("Respuesta incorrecta "+res);
        }
    }
    
}
