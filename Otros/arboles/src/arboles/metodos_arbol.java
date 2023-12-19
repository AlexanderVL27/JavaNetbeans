/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class metodos_arbol {
    private Nodo nodo;

    public metodos_arbol() {
        nodo=null;
    }
    public void insertar(Nodo n1,int ref){       
        if (ref<n1.dato) {
            if (n1.izq==null) {
                Nodo otro = new Nodo();
                otro.izq=null;
                otro.der=null;
                otro.dato=ref;
                n1.izq=otro;
            }else
            {
                insertar(n1.izq,ref);
            }
        }else{
            if (ref>n1.dato) {
                if (n1.der==null) {
                    Nodo otro = new Nodo();
                    otro.izq=null;
                    n1.der=null;
                    otro.dato=ref;
                    n1.der=otro;
                }
                else{
                    insertar(n1.der,ref);
                }
            }else System.out.println("El nodo ya se encuentra en el arbol");
        }
    }
    public void creara(Nodo nodo){
        Scanner s = new Scanner(System.in);
        String res;
        System.out.println("Inserte informacion");
        nodo.dato=s.nextInt();
        System.out.println("Existe nodo por izquierda");
        res=s.next();
        if (res.equals("si")) {
            Nodo otro=new Nodo();
            nodo.izq=otro;
            creara(nodo.izq);
        }else{
            nodo.izq=null;
        }
        System.out.println("Existe nodo por derecha");
        res=s.next();
        if (res.equals("si")) {
            Nodo otro1=new Nodo();
            nodo.der=otro1;
            creara(nodo.der);
        }else{
            nodo.der=null;
        }
    }
    public void preorder(Nodo n1){
        Scanner s = new Scanner(System.in);
        if (n1!=null) {
            System.out.println(n1.dato);
            preorder(n1.izq);
            preorder(n1.der);
        }
    
    }
    public void inorder(Nodo n1){
        if (n1!=null) {
            inorder(n1.izq);
            System.out.println(n1.dato);
            inorder(n1.der);
        }
    }
    
    public void posorder(Nodo n1){
        if (n1!=null) {
            posorder(n1.izq);
            posorder(n1.der);
            System.out.println(n1.dato);
        }
    }
    public void eliminar(Nodo n1,int info){
        Nodo otro=new Nodo();
        Nodo aux=new Nodo();
        Nodo aux1=new Nodo();
        boolean bo=true;
        if (n1!=null) {
            if (info<n1.dato) {
                eliminar(n1.izq,info);
            }else{
                if (info>n1.dato) {
                    eliminar(n1.der,info);
                }else{
                    otro=n1;
                    if (otro.der==null) {
                        n1=otro.izq;
                    }else{
                        if (otro.izq==null) {
                            n1=otro.der;
                        }else{
                            aux=n1.izq;
                            bo=false;
                            while(aux.der!=null){
                                aux1=aux;
                                aux=aux.der;
                                bo=true;
                            }
                            n1.dato=aux.dato;
                            otro=aux;
                            if (bo==true) {
                                aux1.der=aux.izq;
                            }else n1.izq=aux.izq;
                        }
                    }
                    otro=null;
                }
            }
        }else System.out.println("La informacion a eliminar no se encuentra en el arbol");
    }
    
    public void busqueda(Nodo n1,int ref){
        if (ref<n1.dato) {
            if (n1.izq==null) {
                System.out.println("No se encuentra en el arbol");
            }else{
                busqueda(n1.izq,ref);
            }
        }else{
            if (ref>n1.dato) {
                if (n1.der==null) {
                    System.out.println("La informacion no se encuentra en el arbol");
                }else{
                    busqueda(n1.der,ref);
                }
            }else System.out.println("La informacion esta en el arbol");
        }
    }
}
