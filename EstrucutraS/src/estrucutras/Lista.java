/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucutras;

/**
 *
 * @author villa
 */
public class Lista {
    private Nodo p;
    public Lista() {
        p=null;
    }
    public void insertaInicio(int n){
        Nodo q = new Nodo();
        q.info=n;
        q.liga= p;
        p = q; 
    }
    public void insertarFin(int n){  
        Nodo aux=p;
        while (aux.liga != null){
            aux=aux.liga;
        }
        Nodo q = new Nodo();
        q.info=n;
        q.liga=null;
        aux.liga=q;
        
        
    }
    public void insertardes(int n,int ref){
        Nodo aux=p;
        boolean band = true;
        while((band==true)&&(aux.info!=ref)){
            if (aux.liga!=null) {
                aux=aux.liga;
            }else {band=false;}
        }
        if (band!=true) System.out.println("Referencia no encontrada");
        else {
            Nodo t = new Nodo();
            t.info=n;
            t.liga=aux.liga;
            aux.liga=t;
        }
    }
    public void insertarantes(int n, int ref){
        Nodo aux=p;
        Nodo aux1 = null;
        boolean band=true;
        while(aux.info!=ref&&band==true){
                if (aux.liga!=null) {
                    aux1=aux;
                    aux=aux.liga;
                }else{band=false;}
        }
        if (band==true) {
            Nodo q = new Nodo();
            q.info=n;
            if (p==aux) {
                q.liga=p;
                p=q;
            }else{
                aux1.liga=q;
                q.liga=aux;
            }
        }else System.out.println("Referencia no encontrada");
    }
    public void Eliminarprimero(){
        Nodo q=p;
        if (q.liga==null) {
            p=null;
        }
        else p=q.liga;
        q=null;
    }
    public void Eliminaultimo(){
        Nodo q=p;
        Nodo t = null;
        if (p.liga==null) {
            p=null;
        }else{
            while(q.liga!=null){
               t=q;
               q=q.liga;
            }
            t.liga=null;
        }
        q=null;
    }
    public boolean buscar(int n){
        Nodo aux=p; 
        boolean band=true;
        while((aux.info!=n)&&(band==true)){
        if (aux.liga!=null) {
            aux=aux.liga;
        }else band=false;
        }
        return band;
    } 
    public void Eliminarnodo(int n){
        Nodo q=p;
        boolean band=true;
        Nodo t=null;
        while(q.info!=n&&band==true){
            if (q.liga!=null) {
                t=q;
                q=q.liga;
            }else band=false;
        }
        if (band=false) {
            System.out.println("No existe el valor en la lista");
        }else{
            if (p==q) {
                p=q.liga;
            }else t.liga=q.liga;
            q=null;
        }
    }
    public void imprimelista(){
        Nodo q=p;
        while (q!= null){
            if (q==null) {
                System.out.println("Vacio");
            }else{
            System.out.print(q.info + " ");
            q=q.liga;
            }
         } 
    }
}
