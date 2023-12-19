/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruevaitems;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import prueba2.*;
/**
 *
 * @author villa
 */
public class Pruevaitems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba2.p1 f = new p1();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);

        //f.setResizable(false);
        while (true) {
            try {
                f.repaint();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(p1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
