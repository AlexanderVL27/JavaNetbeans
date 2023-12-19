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
public class Circulo extends Figura {
    Scanner s = new Scanner(System.in);

    public Circulo() {
    }
    
    public void llenar(){
        System.out.println("Digite el radio");
        setValor(s.nextInt());
    }
    
    @Override
    public double area(){
        return Math.PI*Math.pow(getValor(), 2);
    }
    @Override
    public double perimetro(){
        return 2*Math.PI*getValor();
    }
    @Override
    public String toString(){
        return ("Area: "+ area()+" Perimetro: "+perimetro());
    }
}
