/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author villa
 */
public class mar {

    int limite = 500;
    Image mario;
    Timer t;
    int velocidadx = 10;
    int x = 10;
    int y = 250;

    public mar() {

        mario = new ImageIcon(this.getClass().getResource("mario.png")).getImage();
        t = new Timer(10000, null);
        t.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(mario, x, y, 100, 100, null);;
    }

    public void mover() {
        if (y >= limite - 190 || y < 150) {

            velocidadx = velocidadx * -1;
        }
        y = y - velocidadx;
    }

}
