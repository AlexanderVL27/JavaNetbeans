/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author villa_xaz9a7o
 */
class ini extends JFrame implements ActionListener {

    private JButton ae,be,ap,cp,as,cs,am,bm,ac,bc;
    private JLabel t;
    Image logo;
    public ini(){
    super("MENU");

        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 150, 200));
        
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(300, 300));
        p.setBackground(Color.CYAN);
        
        ae = new JButton("Alta empleados");
        ae.addActionListener(this);
        p.add(ae);
        be = new JButton("Baja empleados");
        be.addActionListener(this);
        p.add(be);
        ap = new JButton("Alta proveedor");
        ap.addActionListener(this);
        p.add(ap);
        cp = new JButton("Baja proveedor");
        cp.addActionListener(this);
        p.add(cp);
        as = new JButton("Alta servicio");
        as.addActionListener(this);
        p.add(as);
        add (p);
}
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
