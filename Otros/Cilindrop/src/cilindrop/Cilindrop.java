/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindrop;

/**
 *
 * @author villa
 */
public class Cilindrop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c = new Circulo();
        Cilindro cl = new Cilindro();
        
        c.llenar();
        System.out.println("==========================================================================");
        cl.llenar();
        System.out.println("===========================================================================");
        System.out.println("El perimetro del circulo es: "+c.Perimetro());
        System.out.println("El area del circulo es: "+c.Area());
        System.out.println("===========================================================================");
        System.out.println("El area de la base del cilindro es "+cl.base());
        System.out.println("El volumen del cilindro es "+cl.volumen());
    }
    
}
