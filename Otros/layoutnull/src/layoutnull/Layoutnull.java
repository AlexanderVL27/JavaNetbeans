/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutnull;

import javax.swing.JFrame;

/**
 *
 * @author villa
 */
public class Layoutnull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        layoutnulo d= new layoutnulo();
        d.setVisible(true);
        d.setBounds(0, 0, 500, 300);
        d.setLocationRelativeTo(null);
        d.setResizable(false);
        d.getContentPane().setBackground(java.awt.Color.cyan);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    }
    
}
