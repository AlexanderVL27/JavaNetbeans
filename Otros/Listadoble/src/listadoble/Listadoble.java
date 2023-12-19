/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Listadoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Listad lis = new Listad();
        int n,op;
        String o;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Elija una opcion");
            System.out.println("1° Insertar inicio");
            System.out.println("2° Inserta antes");
            System.out.println("3° Inserta al final");
            System.out.println("4° Imprimir lista");
            System.out.println("5° Eliminar primero");
            System.out.println("6° Eliminar ultimo");
            System.out.println("7° Eliminar nodo");
            System.out.println("8° Buscar");
            op=s.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Dato a incertar al inicio");
                    n=s.nextInt();
                    lis.insertaprincipio(n);break;
                }
                case 2:{
                    System.out.println("Inserta Dato:");
                    n=s.nextInt();
                    System.out.println("Antes de");
                    int ref = s.nextInt();
                    lis.insertarantes(n, ref);break;
                }
                case 3:{
                    System.out.println("Inserta dato al final");
                    n=s.nextInt();
                    lis.insertarFinal(n);break;
                }
                case 4:{
                    System.out.println("Imprimiendo........");
                    lis.imprimelista();break;
                }
                case 5:{
                    System.out.println("Eliminar primero");
                    lis.Eliminarprimero();break;
                }
                case 6:{
                    System.out.println("Eliminar ultimo");
                    lis.Eliminaultimo();break;
                }
                case 7:{
                    System.out.println("¿Cual nodo quiere eliminar?");
                    n=s.nextInt();
                    lis.Eliminarnodo(n);break;
                }
                case 8:{
                    System.out.println("Nodo a buscar");
                    n=s.nextInt();
                    boolean band =lis.buscar(n);
                    if(band==true){
                        System.out.println("Encontrada");
                    }else System.out.println("No encontrado");
                    break;
                }
            }
            System.out.println("¿Ingresar otro nodo?");
            o=s.next();
        } while (o.equals("si"));
        
    }  
}
