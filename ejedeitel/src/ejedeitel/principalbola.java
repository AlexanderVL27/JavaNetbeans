/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejedeitel;

import javax.swing.JFrame;

/**
 *
 * @author villa
 */
public class principalbola {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Ejemplo deitel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new crearb());
        frame.setSize(550, 550);
        frame.setVisible(true);
        Thread rep = new Thread() {
            public void run() {
                while (true) {
                    frame.repaint();
                    try {
                        Thread.sleep(60);
                    } catch (Exception e) {
                        break;
                    }
                }
            }

        };
        rep.start();
    }

}
