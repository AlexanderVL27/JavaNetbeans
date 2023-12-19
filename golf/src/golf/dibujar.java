/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class dibujar extends JFrame {
    elementos e= new elementos();
    
    public void paint(Graphics g){  
        super.paint(g);
        
        e.paint(g);
        e.bandera(g);
        e.linea(g);
        e.oyo(g);
        e.pelota(g);
        e.run();e.pelota(g);
    }
    public void p(Graphics g){  
        
        e.pelota(g);
        e.run();
    }
    public dibujar(){
        super("Golf");

        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        
    }
}
