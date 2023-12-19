/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiz.cuadrada;
import javax.swing.JOptionPane;

/**
 *
 * @author villa
 */
public class RaizCuadrada {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog ( "Introduce un numero" );
        
        double ca= Double.parseDouble(numero);
        double resultado = Math.sqrt(ca);
        
        JOptionPane.showMessageDialog ( null,"La raiz cuadrada es "+resultado,"CALCULADO",JOptionPane.PLAIN_MESSAGE );
    }
    
}
