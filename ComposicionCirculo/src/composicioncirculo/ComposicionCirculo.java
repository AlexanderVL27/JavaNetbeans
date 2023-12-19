    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncirculo;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class ComposicionCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        System.out.println("=======CIRCULO 1================================");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio=s.nextDouble();
        Circulo c1 = new Circulo(radio);
        c1.area();
        c1.imprimir();
        c1.mostrarv();
        System.out.println("=======CIRCULO 2================================");
        radio=0;
        System.out.println("Ingrese el radio del circulo");
        radio=s.nextDouble();
        Circulo c2 = new Circulo(radio);
        c2.area();
        c2.imprimir();
        c2.mostrarv();
    }
}
