/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa
 */
public class ayg extends JPanel implements Serializable  {

    paintnew p2;
    ArrayList<paint>p5;
    paintpanel p3;
    paintnew paint;
    frame f;
    Graphics g;
    

    public void serializar() {
        
        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("dibujo"));
            archivo.writeObject(p2);
            archivo.close();
        } catch (Exception e) {
            
        }
    }

    public void abrir(){
        try {
            ObjectInputStream vuelta = null;
            try {
                vuelta = new ObjectInputStream(new FileInputStream("dibujo"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ayg.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ayg.class.getName()).log(Level.SEVERE, null, ex);
            }
            paint=(paintnew) vuelta.readObject();
            vuelta.close();
            p3.setPn(paint);
            System.out.println("111111111111111111111111111111");
        } catch (IOException ex) {
            Logger.getLogger(ayg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ayg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


