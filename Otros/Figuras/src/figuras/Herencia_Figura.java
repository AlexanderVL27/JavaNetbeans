/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Herencia_Figura {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        Triangulo t = new Triangulo();
        Cubo cub = new Cubo();
        Cuadrado cu = new Cuadrado();
        System.out.println("Circulo");
        c.llenar();
        c.area();
        c.perimetro();
        c.imprimir();
        System.out.println("*************************************************");
        System.out.println("Rectangulo");
        r.llenar();
        r.area();
        r.perimetro();
        r.imprimir();
        System.out.println("*************************************************");
        System.out.println("Triangulo");
        t.llenar();
        t.area();
        t.perimetro();
        t.imprimir();
        System.out.println("*************************************************");
        System.out.println("Cuadrado");
        cu.llenar();
        cu.area();
        cu.perimetro();
        cu.imprimir();
        System.out.println("*************************************************");
        System.out.println("Cubo");
        cub.llenar();
        cub.area();
        cub.perimetro();
        cub.volumen();
        cub.imprimir();

    }
}
