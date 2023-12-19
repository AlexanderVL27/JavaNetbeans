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
public class Rectangulo extends Figura {
    Scanner s = new Scanner(System.in);
    private int a;

    public Rectangulo() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public void llenar(){
        System.out.println("Digite la base");
        setValor(s.nextInt());
        System.out.println("Digite la altura");
        a=s.nextInt();
    }
    
    @Override
    public double area(){
        return getValor()*a;
    }
    @Override
    public double perimetro(){
        return 2*getValor()+2*a;
    }
    @Override
    public String toString(){
        return ("Area: "+ area()+" Perimetro: "+perimetro());
    }
}
