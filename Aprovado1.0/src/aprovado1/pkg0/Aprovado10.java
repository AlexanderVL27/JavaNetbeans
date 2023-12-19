/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovado1.pkg0;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Aprovado10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s= new Scanner (System.in);
        System.out.println("Calificacion del alumno");
        int cal=s.nextInt();
        
        if(cal>8)
            System.out.println("Aprovado");
        
    }
    
}
