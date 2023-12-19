/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author villa_xaz9a7o
 */
public class listadocient {
    ArrayList<cientificos>lista;
    
    public listadocient(){
        lista=new ArrayList();
    }
    public void agregar(cientificos c){
        lista.add(c);
    }
}
