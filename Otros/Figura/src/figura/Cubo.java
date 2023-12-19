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
public class Cubo extends Cuadrado {
    Scanner s = new Scanner(System.in);

    public Cubo() {
    }
    @Override
    public void llenar(){
        System.out.println("Ingrese el valor del lado");
        setValor(s.nextInt());
    }
    @Override
    public double area(){
        return (Math.pow(getValor(), 2))*6;
    }
    
    @Override
    public double perimetro(){
        return getValor()*12;
    }
    public double volumen(){
        return Math.pow(getValor(), 3);
    }
    @Override
    public String toString(){
        return ("Area: "+ area()+" Perimetro: "+perimetro()+" Volumen: "+volumen());
    }
}
