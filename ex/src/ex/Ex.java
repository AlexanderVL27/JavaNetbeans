/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author villa
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulos a = new Articulos();
        System.out.println(a.getPrecio());
        System.out.println(a.getClave());
        System.out.println(a.getDesc());
        System.out.println(a.getNombre());

    }

}
