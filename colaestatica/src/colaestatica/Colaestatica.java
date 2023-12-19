/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaestatica;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Colaestatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,op;
        int da;
        String r;
        Scanner s = new Scanner(System.in);
        System.out.println("El maximo de la cola");
        n = s.nextInt();
        Cola c = new Cola(n);
        do{        
        System.out.println("Selecciones una opcion");
        System.out.println("insertar(1) --> Agrega un elemento en la cola ");
        System.out.println("eliminar(2) --> Elimina el elemento de la tabla circular");
        System.out.println("info(3) --> Retorna el primer elemento en la cola.");
        System.out.println("colallena(4) --> Retorna true cuando la cola esta llena false en caso  contrario. ");
        System.out.println("colavacia(5) -->  Retorna true si no existen elementos,false en caso  contrario. ");
        System.out.println("total(6) -->Retorna la cantidad de elementos  en la cola");
        System.out.println("imprimecola( 7 ) --> Muestra el contenido de la cola");
        op=s.nextInt();

        switch(op){
            case 1:{
                     System.out.println("Ingresar un valor a la cola");
                     da=s.nextInt();
                     c.insertar(da);
                 }break;
                 case 2:{
                     for (int i = 0; i < 4; i++) {
                         System.out.println("Eliminando.....");
                     }
                     c.elimina();
                     System.out.println("Eliminado");
                 }break;
                 case 3:{
                     System.out.println("El ultimo dato de la cola");
                     int dato = c.info();
                     System.out.println(dato);
                 }break;
                 case 4:{
                     System.out.println("¿La cola esta llena?");
                     if (c.colallena()) {
                         System.out.println("La cola esta llena");
                     }else System.out.println("No esta llena");
                 }break;
                 case 5:{
                     System.out.println("¿La cola esta vacia?");
                     if (c.colavacia()) {
                         System.out.println("La cola esta vacia");
                     }else System.out.println("La cola No esta vacia");
                 }break;
                 case 6:{
                     System.out.println("Total de datos");
                     int t = c.total();
                     System.out.println(t);break;
                 }
                 case 7:{
                     System.out.println("Imprimiendo");
                     c.imprimir();break;
                 }
                 default:{
                     System.out.println("elija una opcion correcta");break;
                 }
        }    System.out.println("Desea agregar o hacer otra operacion");
             r=s.next();
        }while(r.equals("si"));
    }  
}
