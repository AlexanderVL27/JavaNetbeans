/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/**
 *
 * @author villa
 */
public class paintpanel extends JPanel {
    paintnew pn=new paintnew();
    Color c = new Color(0,0,0);

    public void setPn(paintnew pn) {
        this.pn = pn;
    }
    
    public paintpanel() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    public void mouseDragged(MouseEvent e) {
                        pn.agregarpoint(e.getX(), e.getY(), c);
                        repaint();
                    }
                }
        );

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < pn.pa.size(); i++) {
            g.setColor(pn.pa.get(i).c);
            g.fillOval(pn.pa.get(i).x, pn.pa.get(i).y, 4, 4);
        }
    }

}
