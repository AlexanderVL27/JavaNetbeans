/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovado2;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Aprovado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        System.out.println("Calificacion del alumno");
        int cal=s.nextInt();
        
        if(cal>=8&&cal<=10)
            System.out.println("Aprovado");
        
        else if(cal>10)
            
            System.out.println("Excede la calificacion mas alta");
        
        else
            System.out.println("Reprobado");
    }
    
}
