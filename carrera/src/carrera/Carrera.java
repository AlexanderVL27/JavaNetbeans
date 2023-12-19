/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class Carrera {
    
    public static void main(String[] args) {
        
        carros c = new carros();
        c.setVisible(true);
        c.setBounds(0, 0, 600, 400);
        c.setLocationRelativeTo(null);
        c.setResizable(false);
        
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
    
}
