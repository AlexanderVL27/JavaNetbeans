/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departamentodedefensa;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Departamentodedefensa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String forma;
        Scanner s= new Scanner (System.in);
        System.out.println("Cual es la forma del perimetro que se desea saber");
        forma=s.next();
        System.out.println("¿Cuantos kilometros mide su lado?");
        double l=s.nextDouble();
        if (forma.equals("pentagono"))
        {
            double p=l*5;
            System.out.println("El total de kilometros del perimetro es "+p +" Kilometros");
        }
        else if ("cuadrado".equals(forma))
            {
            double c=l*4;
            System.out.println("El total de kilometros del perimetro es "+c+" Kilometros");
        }
        else if ("triangulo".equals(forma))
            {
            double t=l*3;
            System.out.println("El total de kilometros del perimetro es "+t+" Kilometros");
        }
        else if ("hexagono".equals(forma))
            {
            double h=l*6;
            System.out.println("El total de kilometros del perimetro es "+h+" Kilometros");
        }
        else if ("heptagono".equals(forma))
            {
            double he=l*7;
            System.out.println("El total de kilometros del perimetro es "+he+" Kilometros");
        }
        else if ("octagono".equals(forma))
            {
            double o=l*8;
            System.out.println("El total de kilometros del perimetro es "+o+" Kilometros");
        }
        else
        {
            System.out.println("No es posible calcular");
        }
    }
        
}
