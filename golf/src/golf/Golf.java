/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dibujar c = new dibujar();
        c.setVisible(true);
        c.setBounds(0, 0, 600, 400);
        c.setBackground(Color.cyan);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            try {
                c.repaint();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(dibujar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    }
}
