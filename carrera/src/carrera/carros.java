/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author villa_xaz9a7o
 */
public class carros extends JFrame {

    Random generator = new Random();
    dibujacarro carro = new dibujacarro();
    dibujacarro carro2 = new dibujacarro();

    public void paint(Graphics g) {
        while(true){carro.mover();
            carro2.mover();
        try {
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            ImageIcon imagen = new ImageIcon(getClass().getResource("pista.jpg"));
            g2.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            carro.paint(g);
            carro2.paint(g);
            carro2.setY(270);
            carro2.c = new Color(0, 0, 255);
            
            Thread.sleep(generator.nextInt(300));
            if (carro.getX()>=carro.l-40) {
                showMessageDialog(null,"Gano carro Rojo");
                break;
            }
            else if (carro2.getX()>=carro2.l-40) {
                showMessageDialog(null, "Gano carro Azul");
            break;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(carros.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public carros() {
        super("GRAN CARRERA DE CARROS");
        getContentPane().setLayout(new BorderLayout());
    }
}
