/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocubico;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Metrocubico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ma,ml,mp,c,m,mf;
        Scanner s= new Scanner (System.in);
        System.out.println("Introdusca los metros de largo");
        ml=s.nextInt();
        System.out.println("Introdusca los metros de ancho");
        ma=s.nextInt();
        System.out.println("Introdusca los metros de profundidad");
        mp=s.nextInt();
        System.out.println("Introdusca el costo por metro cubico");
        c=s.nextInt();
        m=ma*ml*mp;
        mf=m*c;
        System.out.println("El costo total para llenar la alberca es de "+mf);
    }
    
}
