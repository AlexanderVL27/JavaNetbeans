/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacirculocilindro;

/**
 *
 * @author villa
 */
public class HerenciaCirculoCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cilindro ci1 = new Cilindro();
        Cilindro ci2 = new Cilindro();
        
        ci1.llenar();
        ci1.llenarc();
        ci1.area();
        ci1.volumen();
        ci1.imprimir();
        ci1.imprimirc();
        System.out.println("Segundo Cilindro");
        ci2.llenar();
        ci2.llenarc();
        ci2.area();
        ci2.volumen();
        ci2.imprimir();
        ci2.imprimirc();
    }
    
}
