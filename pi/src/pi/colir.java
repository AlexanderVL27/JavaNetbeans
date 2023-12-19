/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

/**
 *
 * @author villa
 */
public class colir extends JDialog implements ActionListener {

    JColorChooser color = new JColorChooser();
    JButton aceptar = new JButton("Aceptar");
    paintpanel paint;

    colir(paintpanel p) {
        paint = p;
        aceptar.addActionListener(this);
        add(color);
        add(aceptar);
        setLayout(new FlowLayout());
        setSize(500, 430);
        setTitle("Color");
        setVisible(true);
        setLocation(220, 100);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (aceptar == e.getSource()) {
            paint.c = color.getColor();
        }
        dispose();
    }

}
