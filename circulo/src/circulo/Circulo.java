/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author villa
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circulo1 obj1 = new circulo1();
        System.out.println(obj1.longCircunferencia());
        System.out.println(obj1.areaCirculo());
        circulo1 obj2 = new circulo1(100, 100, 10);
        System.out.println(obj2.longCircunferencia());
        System.out.println(obj2.areaCirculo());
        System.out.println(circulo1.numCirculos);
    }

}
