/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        double r;
        Circulo cl = new Circulo();
        System.out.println("Valor de x: ");
        x = s.nextInt();
        System.out.println("Valor de y: ");
        y = s.nextInt();
        System.out.println("Valor del radio: ");
        r = s.nextDouble();
        cl.setCentro(new Punto(x,y));
        cl.setRadio(r);
        System.out.println("Perimetro: "+cl.Perimetro());
        System.out.println("Area: "+cl.Area());
    }
    
}
