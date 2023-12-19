/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author villa
 */
public class Moneda {

    Image pregunta;
    public Moneda() {
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(255, 233, 0));
        pregunta = new ImageIcon(this.getClass().getResource("pre.png")).getImage();
        g2.fillRect(20, 50, 100, 100);
        g2.drawImage(pregunta,20, 50, 100, 100, null);
        
    }

}
