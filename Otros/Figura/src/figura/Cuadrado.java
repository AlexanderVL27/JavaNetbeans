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
public class Cuadrado extends Figura {
    Scanner s = new Scanner(System.in);

    public Cuadrado() {
    }
    
    public void llenar(){
        System.out.println("Digite el valor del lado");
        setValor(s.nextInt());
    }
    
    @Override
    public double area(){
        return Math.pow(getValor(), 2);
    }
    @Override
    public double perimetro(){
        return getValor()*4;
    }
    @Override
    public String toString(){
        return ("Area: "+ area()+" Perimetro: "+perimetro());
    }
}
