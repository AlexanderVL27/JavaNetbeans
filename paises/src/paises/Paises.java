/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pa;
        String paises[]={"CANADA","INGLATERRA","FRANCIA","ALEMANIA","INDIA","ISRRAEL","ITALIA","JAPON","MEXICO","REPUBLICA POPULAR CHINA","RUSIA","ESTADOS UNIDOS"};
        String capital[]={"OTTAWA","LONDRES","PARIS","BUNN","NUEVA DEL HI","JERUSALEN","ROMA","TOKIO","CUIDAD DE MEXICO","PEKIN","MOSCU","WASHINGTON"};
        Scanner s=new Scanner(System.in);
        int opc;
        do{
            System.out.println("Ingrese un pais: ");
            pa=s.next();
            pa=pa.toUpperCase();
            int pos;
            pos=coparar(paises,pa);
            if(pos>-1){
                System.out.println(capital[pos]);
            }
            else{
                System.out.println("Pais no encontrado");
            }
            System.out.println("Teclee 1 para hacer otra busqueda, teclee -1 para terminar");
            opc=s.nextInt();
        }while(opc==1);
    }

    public static int coparar(String[] paises, String pa) {
        int i;
        for (i = 0; i <paises.length; i++) {
            if(pa.equals(paises[i])){
                return i;
            }
        }
        return -1;
    }
    
}
