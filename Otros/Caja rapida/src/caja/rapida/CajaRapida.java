/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja.rapida;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class CajaRapida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int art;
        Scanner s= new Scanner (System.in);
        System.out.println("Cuantos articulos lleva");
        art=s.nextInt();
        
        if(art<8)
            System.out.println("Pase a caja rapida");
    }
    
}
