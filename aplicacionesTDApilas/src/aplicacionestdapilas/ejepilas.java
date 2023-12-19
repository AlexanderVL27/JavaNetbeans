/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionestdapilas;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class ejepilas {

    private int tope;
    private int max;
    private String[]elem;
    private char[]pali;
    
    public ejepilas() {
    }
    public ejepilas(int n){
        this.max=n;
        elem=new String[max];
        pali=new char[max];
        tope=-1;
    }    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
    
    public boolean pilav(){
        return tope==-1;
    }
    public boolean pilallena(){
        return tope==max-1;
    }
    public void apilar(){
        Scanner s = new Scanner(System.in);
        boolean con =pilallena();
        System.out.println("Ingrese los caracteres de la pila");
        while(pilallena()==false){
        if (con ==true) {
            System.out.println("Desbordamiento");}
            else{
                 tope++;                
                 elem[tope]=s.next();
        }
        }      
    }
    public void apilar2(char a){
        boolean con =pilallena();
        if (con ==false) {
            tope++;                
            pali[tope]=a;}    
    }
    public void xpop(){
        boolean vac=pilav();
        String dato;
        if (vac==true) {
            System.out.println("Subdesbordamiento");
        }else {
            dato=elem[tope];
            tope=tope-1;
        }
    }
    public void xpop2(){
        boolean vac=pilav();
        char dato;
        if (vac==true) {
            System.out.println("Subdesbordamiento");
        }else {
            dato=pali[tope];
            tope=tope-1;
        }}
    public char xpop3(){
        char aux=pali[tope];
        tope--;
        return aux;
    }
    
    public void sacar(){
       do{
            String aux;
            aux=elem[tope];
            System.out.print(aux+", ");
            xpop();
            
        }while(pilav()==false);
    }
    
    public boolean parentesis(String p){
        char simbolo[];
        int co =0;
        for (int i = 0; i < p.length(); i++) {
        {
            
            simbolo=p.toCharArray();
            if(simbolo[i] == '('){
                apilar2(simbolo[i]);
                co++;
            }
            
            if(simbolo[i] == ')'){ 
                if(pilav()) {  
                    xpop2(); 
                    return false;
                }
            }
            co=0;
        }
        }
        return pilav();
    }
    public void palindromo(String a){
        char pa[]= new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!=' ') {
                pa[i]=a.charAt(i);
            }
        }
        for (int i = 0; i < pa.length; i++) {
            pali[i]=pa[i];
        }
        
    }

    public void posfija(String e){
        tope=0;
        char epos = 0;
        int i=0;
        boolean band;
        while(e.length()!=0){
            char charAt = e.charAt(i);
            if (charAt=='(') {
                apilar2(charAt);
            }else{
                while(pali[tope]!='('){
                    xpop3();
                    epos=e.charAt(i);
                }
                xpop3();
                if(e.charAt(i)=='+'||e.charAt(i)=='-'||e.charAt(i)=='*'||e.charAt(i)=='/'){
                    epos=e.charAt(i);
                }else{
                    band=pilav();
                    while(band==false && e.charAt(i)!='+'&&e.charAt(i)!='-'&&e.charAt(i)!='*'&&e.charAt(i)!='/'){
                        xpop();
                        epos=e.charAt(i);
                        band=pilav();
                    }
                    apilar2(charAt);
                }
            }
            i++;
        }
        band=pilav();
        while(band=false){
            xpop3();
            band=pilav();
        }
        System.out.println(epos);
    }

}