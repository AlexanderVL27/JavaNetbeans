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
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r;
        System.out.println("Maximo de datos de la pila");
        int n=s.nextInt();
        pila p= new pila(n);
        
        do {
            System.out.println("=====================================================================");
            System.out.println("Seleccione algun metodo a evaluar");
            System.out.println("push( 1 )    -->  (apilar) Inserta ");
            System.out.println("xpop(2 )        -->   (desapilar) Elimina el último elemento insertado");
            System.out.println("info(3 )        -->   Retorna el último elemento insertado, sin eliminarlo.");    
            System.out.println("pilallena(4 ) -->   Retorna true si no existen espacios para un nuevo  elemento; false en caso contrario.");    
            System.out.println("pilavacia(5 ) -->   Retorna true si no existen elementos ; false en  caso contrario");    
            System.out.println("(6)Algoritmo para contar los elementos de una pila.");    
            System.out.println("(7)Algoritmo para contar los elementos de una pila froma 2.");    
            System.out.println("(8) Algoritmo para imprimir el contenido de una pila. ");    
            int op =s.nextInt();
        
             switch(op){
                 case 1:{
                     System.out.println("Ingresar un valor a la pila");
                     p.apilar();
                 }break;
                 case 2:{
                     System.out.println("Se elimino el ulltimo elemento");
                     p.xpop();
                 }break;
                 case 3:{
                     System.out.println("El ultimo dato de la pila");
                     int dato = p.info();
                     System.out.println(dato);
                 }break;
                 case 4:{
                     System.out.println("¿La pila esta llena?");
                     if (p.pilallena()==true) {
                         System.out.println("No esta llena");
                     }else System.out.println("La pila esta llena");
                 }break;
                 case 5:{
                     System.out.println("¿La pila esta vacia?");
                     if (p.pilav()==true) {
                         System.out.println("La pila esta vacia");
                     }else System.out.println("La pila No esta vacia");
                 }break;
                 case 6:{
                     System.out.println("Tope de la pila");
                     System.out.println(p.topemax());break;
                 }
                 case 7:{
                     System.out.println("Tope de la pila");
                     System.out.println(p.cont2());break;
                     
                 }
                 case 8:{
                     System.out.println("Imprimiendo pila");
                     p.impri();
                     break;
                 }
             }
             System.out.println("Desea agregar o hacer otra operacion");
             r=s.next();
        } while (r.equals("si"));
        
    }
    
}
