/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author villa
 */
public class paintnew {
    ArrayList<paint>pa;

    public paintnew() {
        pa=new ArrayList();
    }
    public void agregar(int x,int y,Color c){
        pa.add(new paint(x,y,c));
    }
    
}