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
public class Cilindro {

    private float radio, altura;

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public float getAltura() {
        return altura;
    }

    public Cilindro() {
    }

    public void llenar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio del cilindro");
        radio = s.nextFloat();
        System.out.println("Ingrese la altura del cilindro");
        altura=s.nextFloat();
    }

    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double base() {
        return Math.PI * Math.pow(radio, 2);
    }
}
