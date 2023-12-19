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
public class Triangulo extends Figura {
    private double base,altura;

    public Triangulo() {
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
        Scanner s = new Scanner(System.in); 
        System.out.println("Ingrese la base");
        base=s.nextDouble();
        System.out.println("Ingrese la altra");
        altura = s.nextDouble();
    }
    @Override
    public double area(){
        return (base*altura)/2;
    }
    @Override
    public double perimetro(){
        return base + (2 * Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2))));
    }
}
