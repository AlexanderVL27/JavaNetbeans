/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_figura;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Herencia_Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        Triangulo t = new Triangulo();
        Cubo cub = new Cubo();
        Cuadrado cu = new Cuadrado();
        System.out.println("Circulo");
        c.llenar();
        System.out.println("Area: "+c.area()+" Perimetro: "+c.perimetro());
        System.out.println("*************************************************");
        System.out.println("Rectangulo");
        r.llenar();
        System.out.println("Area: "+r.area()+" Perimetro: "+r.perimetro());
        System.out.println("*************************************************");
        System.out.println("Triangulo");
        t.llenar();
        System.out.println("Area: "+t.area()+" Perimetro: "+t.perimetro());
        System.out.println("*************************************************");
        System.out.println("Cuadrado");
        cu.llenar();
        System.out.println("Area: "+cu.area()+" Perimetro: "+cu.perimetro());
        System.out.println("*************************************************");
        System.out.println("Cubo");
        cub.llenar();
        System.out.println("Area: "+cub.area()+" Perimetro: "+cub.perimetro()+" Volumen: "+cub.volumen());
    }
    
}
