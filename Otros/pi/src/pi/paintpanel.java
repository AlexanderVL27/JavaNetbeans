/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/**
 *
 * @author villa
 */
public class paintpanel extends JPanel {

    paintnew paint= new paintnew();
    Color c = new Color(0, 0, 0);

    public paintpanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                leerc(e);
                
            }
        }
        );

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                pintar(e);
                
            }
        }
        );
    }

    public void leerc(MouseEvent e) {
        if (!e.isMetaDown()) {
            paint.agregar(e.getX(), e.getY(), c);
        }
    }

    public void pintar(MouseEvent e) {
        if (!e.isMetaDown()) {
            Graphics2D g = (Graphics2D) ((JPanel) e.getSource()).getGraphics();
            g.setStroke(new BasicStroke(5));
            g.setColor(c);
            int X = e.getX();
            int Y = e.getY();
            g.drawLine(paint.pa.get(0).getX(),paint.pa.get(0).getY(), X, Y);
            g.dispose();
        }
        
    }
}
