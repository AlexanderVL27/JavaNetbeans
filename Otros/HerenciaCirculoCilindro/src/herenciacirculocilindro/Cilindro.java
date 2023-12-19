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
public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
    }
    
    public void llenarc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        altura = s.nextDouble();
    }
    public double volumen(){
        return Cilindro.pi*(Math.pow(radio, 2)*altura);
    }
    public void imprimirc(){
        System.out.println("El volumen del cilindro es "+volumen());
        
    }
}
