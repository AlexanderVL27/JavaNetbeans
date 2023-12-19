/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ope d = new ope();
        d.setVisible(true);
        d.setBounds(0, 0, 400, 300);
        d.setLocationRelativeTo(null);
        d.setResizable(false);
        d.getContentPane().setBackground(java.awt.Color.cyan);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
