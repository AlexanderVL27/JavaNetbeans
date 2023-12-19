/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author villa
 */
public class nuve {

    int limite = 400;
    Timer t;
    int velocidadx = 10;
    int x = 150;
    int x2 = 175;
    int x3 = 175;
    int y = 235;

    public nuve() {
        
        t = new Timer(1000, null);
        t.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(255, 255, 255));
        g2.fillOval(150, 50, 50, 50);
        g2.fillOval(175, 55, 50, 50);
        g2.fillOval(190, 50, 50, 50);
    }

    public void mover() {
        if (x >= limite || x < 100) {
            velocidadx = velocidadx * -1;
        }
        x = x + velocidadx;
    }
}
