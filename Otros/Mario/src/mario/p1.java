/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

;

/**
 *
 * @author villa
 */
public class p1 extends JFrame {
    Color c;
    mar m = new mar();
    tubo t = new tubo();
    Moneda mo = new Moneda();
    nuve n = new nuve();
    enemigo e =new enemigo();
    estrella h = new estrella();
    public p1() {

    }

    public void paint(Graphics g) {
        //Crea el cielo azul
        super.paint(g);
        GradientPaint fondo = new GradientPaint(0, 400, Color.cyan, 0, 0, Color.blue, true);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(fondo);
        g2.fillRect(0, 0, 500, 500);
        try {
            //Crea la base con fondo de ladrillo
            BufferedImage ladrillos = ImageIO.read(this.getClass().getResource("ladrillo.png"));
            TexturePaint texla = new TexturePaint(ladrillos, new Rectangle(50, 50));
            g2.setPaint(texla);
            g2.fillRect(0, 350, 500, 350);
        } catch (IOException ex) {

        }

        //Creacion de tubo
        t.paint(g2);
        e.paint(g2);
        e.mover();
        m.paint(g2);
        m.mover();
        mo.paint(g2);
        n.paint(g2);
        n.mover();
        
        h.paint(g2);
        h.mover();
        
    }

}
