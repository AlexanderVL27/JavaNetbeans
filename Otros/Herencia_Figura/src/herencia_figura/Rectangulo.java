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
public class Rectangulo extends Figura {
    private double base,altura;

    public Rectangulo() {
        super();
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


    public void llenar(){
        Scanner s = new Scanner (System.in);
        System.out.println("Cual es la medida dela base ");
        base = s.nextDouble();
        System.out.println("Cual es la medida de la altura");
        altura = s.nextDouble();
    }
    @Override
    public double area(){
        return base*altura;
    }
    @Override
    public double perimetro(){
        return 2*altura+2*base;
    }
}
