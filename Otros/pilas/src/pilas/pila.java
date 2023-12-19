/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class pila {

    private int tope;
    private int max;
    private int[]elem;
    public pila() {
    }
    public pila(int n){
        this.max=n;
        elem=new int[max];
        tope=-1;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getTope() {
        return tope;
    }

    public int getMax() {
        return max;
    }

    public int[] getElem() {
        return elem;
    }
    
    public int top(){
        return tope;
    }
    
    public int topemax(){
        return tope+1;
    }
    public boolean pilav(){
        if (tope==-1) {
            return true;
        }else return false;
    }
    public boolean pilallena(){
        if (tope==max-1) {
            return true;
        }else return false;
    }
    public int info(){
        boolean vacia=pilav();
        if (vacia==true) {
            System.out.println("No hay datos");
            return 0;
        }else 
             return elem[tope];
       
    }
    public void apilar(){
        Scanner s = new Scanner(System.in);
        boolean con =pilallena();
        if (con ==true) {
            System.out.println("Desbordamiento");}
            else{
                 tope++;
                 System.out.println("Ingrese el caracter de la pila");
                 elem[tope]=s.nextInt();
        }
        
    }
    public void xpop(){
        boolean vac=pilav();
        int dato;
        if (vac==true) {
            System.out.println("Subdesbordamiento");
        }else {
            dato=elem[tope];
            tope=tope-1;
        }
    }
    public int cont2(){
        boolean vac=pilav();
        int cont=0;
        for (int i = 0; i <= tope; i++) {
            if (vac==true) {
            System.out.println("No hay datos");
        }else
            cont++;
        }
        return cont;
    }
    public void impri(){
        boolean vac=pilav();
        int cont=0;
        for (int i = tope; i >= 0; i--) {
            if (vac==true) {
            System.out.println("No hay datos");
        }else
                System.out.println(elem[i]);
        }
    }
}
