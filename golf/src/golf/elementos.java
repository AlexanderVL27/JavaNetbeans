/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa_xaz9a7o
 */
public class elementos{
    int x=550;
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.green);
        g2.fillOval(80,200,450,100);
    }
    public void bandera(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillRect(200, 100, 60, 40);
    }
    public void linea(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.drawLine(260, 100, 260, 250);
    }
    public void oyo(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.fillOval(240, 250,50,30);
    }
    public void pelota(Graphics g){
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        if (x<=240) {
            g2.setColor(Color.black);
            
        }
        g2.fillOval(x,250,30,30);
        
    }
    public void run(){
            if (x>240) {
                
                x=x-10;
                
            }
    }
}
