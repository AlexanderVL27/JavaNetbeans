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
public class Cuadrado extends Figura{
    protected double lado;

    public Cuadrado() {
        super();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public void llenar(){
        Scanner s = new Scanner (System.in);
        System.out.println("Cual es la medida del lado ");
        lado = s.nextDouble();
    }
    @Override
    public double area(){
         return Math.pow(lado, 2);
    }
    
    @Override
    public double perimetro(){
        return lado*4;
    }
}
