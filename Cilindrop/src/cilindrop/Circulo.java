/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindrop;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Circulo {
    private float radio;

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=s.nextFloat();
    }
    public double Perimetro() {
        return 2 * Math.PI  * radio;
    }
    public double Area(){
        return Math.PI * Math.pow(radio, 2);
    }
}
