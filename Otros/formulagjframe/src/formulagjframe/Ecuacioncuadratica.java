/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulagjframe;

import javax.swing.JFrame;

/**
 *
 * @author villa
 */
public class Ecuacioncuadratica {
    
    public static void main(String[] args) {
        Formulagjframe d= new Formulagjframe();
        d.setVisible(true);
        d.setBounds(0, 0, 400, 300);
        d.setLocationRelativeTo(null);
        d.setResizable(false);
        d.getContentPane().setBackground(java.awt.Color.cyan);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
