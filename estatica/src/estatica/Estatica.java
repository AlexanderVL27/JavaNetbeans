/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatica;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Estatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,op;
        int da;
        String r;
        Scanner s = new Scanner(System.in);
        System.out.println("El maximo de la fila");
        n = s.nextInt();
        fila f = new fila(n);
        do{        
        System.out.println("Selecciones una opcion");
        System.out.println("insertar(1) --> Agrega un elemento al final de la fila ");
        System.out.println("eliminar(2) --> Elimina el primer elemento de la fila.");
        System.out.println("info(3) --> Retorna el primer elemento en la fila.");
        System.out.println("filavacia(4) -->  Retorna true si no existen elementos,false en caso  contrario. ");
        System.out.println("filallena(5) --> Retorna true cuando la fila esta llena false en caso  contrario. ");
        System.out.println("vaciarfila(6) -->Elimina todos los elementos de la fila");
        op=s.nextInt();

        switch(op){
            case 1:{
                     System.out.println("Ingresar un valor a la fila");
                     da=s.nextInt();
                     f.inserta(da);
                 }break;
                 case 2:{
                     System.out.println("Se elimino el ulltimo elemento");
                     f.eliminar();
                 }break;
                 case 3:{
                     System.out.println("El ultimo dato de la fila");
                     int dato = f.info();
                     System.out.println(dato);
                 }break;
                 case 4:{
                     System.out.println("¿La fila esta llena?");
                     if (f.filallena()==true) {
                         System.out.println("La fila esta llena");
                     }else System.out.println("No esta llena");
                 }break;
                 case 5:{
                     System.out.println("¿La fila esta vacia?");
                     if (f.filavacia()==true) {
                         System.out.println("La fila esta vacia");
                     }else System.out.println("La fila No esta vacia");
                 }break;
                 case 6:{
                     System.out.println("Fila vacia");
                     f.vaciar();break;
                 }
                 default:{
                     System.out.println("elija una opcion correcta");break;
                 }
        }    System.out.println("Desea agregar o hacer otra operacion");
             r=s.next();
        }while(r.equals("si"));
    }
    
}
