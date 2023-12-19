/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author villa
 */
public class tubo {
    Color c = new Color (0,255,0);
    Color c2 = new Color(0,0,0);

    public tubo() {
    }
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
         GradientPaint fondo = new GradientPaint(10, 10, Color.yellow, 0, 0, Color.orange, true);
         g2.setPaint(fondo);
         g2.drawOval(400, 10, 100,100 );
         g2.fillOval(400, 10, 100, 100);
         g2.setPaint(c2);
         
         g2.drawRect(380,249,100,20);
         g2.drawRect(400, 269, 60, 80);
         g2.setPaint(c);
         g2.fillRect(380,249,100,20);
         g2.fillRect(400, 269, 60, 80);
    }
}
