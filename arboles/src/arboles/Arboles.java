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
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nodo n1 = new Nodo();
        metodos_arbol a1 = new metodos_arbol();
        int ref,op;
        String res;
        System.out.println("Creamos Raiz");
        a1.creara(n1);
        do {
            System.out.println("1_ Insercion");
            System.out.println("2_Eliminacion");
            System.out.println("3_Busqueda");
            System.out.println("4_ Preorder");
            System.out.println("5_Inorder");
            System.out.println("6_Posorder");
            op=s.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Inserte lo que desea ingresar");
                    ref=s.nextInt();
                    a1.insertar(n1, ref);break;
                }
                case 2:{
                    System.out.println("Ingrese elemento a eliminar");
                    ref=s.nextInt();
                    a1.eliminar(n1, ref);break;
                }
                case 3:{
                    System.out.println("Que elemento quiere buscar");
                    ref=s.nextInt();
                    a1.busqueda(n1, ref);break;
                }
                case 4:{
                    System.out.println("Ordenando en preorder");
                    a1.preorder(n1);break;
                }
                case 5:{
                    System.out.println("Ordenando en Inorder");
                    a1.inorder(n1);break;
                }
                case 6:{
                    System.out.println("Ordenando en pososrder");
                    a1.posorder(n1);break;
                }
                default:{
                    System.out.println("Favor de ingresar una opcion correcta");break;
                }
            }
            System.out.println("Desea insertar un nodo");
            res=s.next();
        } while (res.equals("1"));
        
    }
    
}
