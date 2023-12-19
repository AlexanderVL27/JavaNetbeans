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
public class Circulo extends Figura implements CalculosFiguras {
    private double radio;
    public Circulo() {
        super();
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }  
    public void llenar(){
        Scanner s = new Scanner (System.in);
        System.out.println("Cual es el radio ");
        radio = s.nextDouble();
    }
    @Override
    public double area(){
         return Math.PI*Math.pow(radio, 2);
    }
    @Override
    public double perimetro(){
         return 2*Math.PI*radio;
    }
    
}
