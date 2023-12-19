/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float km,am,ktr;
        Scanner s= new Scanner (System.in);
        System.out.println("Introdusca los kilometros recorridos ");
        km=s.nextFloat();
        System.out.println("Ingrese los amigos que corrieron");
        am=s.nextFloat();
        ktr=km*am;
        System.out.println("El total de kilometros recoridos entre los "+am+" amigos es "+ktr+" kilometros");
    }

    
}
