/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int p,pi,ppm,m,nmeses;
        Scanner s= new Scanner (System.in);
        System.out.println("Introdusca el monto total del credito");
        p=s.nextInt();
        System.out.println("Introdusca el monto total del psgo inicial");
        pi=s.nextInt();
        System.out.println("Introdusca el monto a pagar por mes");
        ppm=s.nextInt();
        m=p-pi;
        nmeses=m/ppm;
        System.out.println("Cubrira en "+nmeses+" meses la deuda");
    }
    
}
