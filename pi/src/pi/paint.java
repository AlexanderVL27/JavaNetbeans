/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.Color;

/**
 *
 * @author villa
 */
public class paint {
    int x, y;
    Color c = new Color(0, 0, 0);

    public paint(){
        
    }
    public paint(int x, int y,Color c) {
        this.x = x;
        this.y = y;
        this.c=c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
    
}
