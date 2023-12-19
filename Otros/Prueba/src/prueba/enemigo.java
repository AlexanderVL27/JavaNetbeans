/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;

/**
 *
 * @author villa
 */
public class enemigo {
    int limite = 400;
    Image enemigo;
    Timer t;
    int velocidadx = 10;
    int x = 100;
    int y = 235;

    public enemigo() {

        enemigo = new ImageIcon(this.getClass().getResource("enemigo2.png")).getImage();
        t = new Timer(100, null);
        t.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(enemigo, x, y,150,150, null);
    }
    
    public void mover(){
        if (x>=limite-100||x<100) {
            velocidadx=velocidadx*-1;
        }
        x=x+velocidadx;
    }
}
