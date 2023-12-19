/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacirculocilindro;

import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Circulo {
    protected double radio;
    static final double pi=3.1416;

    public Circulo() {
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public static double getPi() {
        return pi;
    }
    public double area(){
        return pi*Math.pow(radio,2);
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio=s.nextDouble();
    }
    public void imprimir(){
        System.out.println("El area del circulo es: "+area());
    }
}
