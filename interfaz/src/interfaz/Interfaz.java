/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ini d = new ini();
        d.setVisible(true);
        d.setBounds(0, 0, 900, 600);
        d.setLocationRelativeTo(null);
        d.setResizable(false);
        d.getContentPane().setBackground(java.awt.Color.cyan);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
