/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donacion;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Donacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float mo,ad,te,sis,co;
        Scanner s= new Scanner (System.in);
        System.out.println("Monto de la donacion");
        mo=s.nextFloat();
        ad=mo*30/100;
        sis=ad*15/100;
        te=sis*20/100;
        co=mo-(ad+sis+te);
        System.out.println("El monto que le toca a telecomunicaciones es: "+te);
        System.out.println("El monto que le toca a sistemas es: "+sis);
        System.out.println("El monto que le toca a administracion es: "+ad);
        System.out.println("El monto que le toca a contabilidad es: "+co);
    }
        
    
}
