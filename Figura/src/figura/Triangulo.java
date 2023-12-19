/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Triangulo extends Figura {
    Scanner s = new Scanner(System.in);
    private int a;
    public Triangulo() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    
    public void llenar(){
        System.out.println("Digite el valor de la base");
        setValor(s.nextInt());
        System.out.println("Digite el valor de la altura");
        a=s.nextInt();
    }
    
    @Override
    public double area(){
        return (getValor()*a)/2;
    }
    @Override
    public double perimetro(){
        return getValor() + (2 * Math.sqrt((Math.pow(getValor(), 2)+Math.pow(a, 2))));

    }
    @Override
    public String toString(){
        return ("Area: "+ area()+" Perimetro: "+perimetro());
    }
}
