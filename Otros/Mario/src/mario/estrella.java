/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javafx.scene.shape.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author villa
 */
public class estrella {
    int limite = 350;
    Image estrella;
    Timer t;
    int velocidadx = 30;
    int velocidady = 30;
    int x = 50;
    int y = 50;

    public estrella() {

        estrella = new ImageIcon(this.getClass().getResource("estrella.png")).getImage();
        t = new Timer(100, null);
        t.start();
    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(estrella, x, y, 70, 70, null);

    }

    public void mover() {
        if (x >= limite - 74 || x < 50) {
            velocidadx = velocidadx * -1;
        }
        if (y >= limite - 74 || y < 10) {
            velocidady = velocidady * -1;
        }
        x = x + velocidadx;
        y = y + velocidady;

    }
}
