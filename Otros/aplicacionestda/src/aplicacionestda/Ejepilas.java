/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionestda;

/**
 *
 * @author villa
 */
public class Ejepilas {
    private int tope;
    private char A[];     
   
    public Ejepilas(int n){
        A=new char[n];  //inicializacion del arreglo
        this.tope=-1;       
    }
   
    public void push(char x){
        tope++;
        A[tope]=x;       
    }
   
    public char pop(){
        char aux=A[tope];
        tope--;
        return aux;
    }
   
    public char stacktop(){
        char aux=pop();
        push(aux);
        return aux;
    }
   
    public boolean empty(){
        if(tope==-1){
            return true;
        }
        return false;
    }
   
    public boolean full(){
        if(tope==A.length-1){
            return true;
        }
        return false;
    }
}
