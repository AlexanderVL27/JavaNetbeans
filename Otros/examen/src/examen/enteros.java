/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author villa
 */
public class enteros {

    public enteros() {
    }
    
    public int resta(int d1,int d2){
        if (d1<d2) {
            return 0;
        }else
            return 1+resta(d1-d2, d2);
    }
}
