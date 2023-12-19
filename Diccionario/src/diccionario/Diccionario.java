/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String palabra[][] = new String[100][2];
        creardiccionario(palabra);
        traducir(palabra);
    }

    public static void creardiccionario(String palabra[][]) {
        Scanner s=new Scanner(System.in);
        String pe,pi,r;
        int i=0;
        System.out.println("Por favor ingrese una palabra");
        do{
            do{
            System.out.println("Ingrese la palabra en español");
            pe=s.next();
            if(pe.length()<40){
            palabra[i][0]=pe;}
            else {System.out.println("Exede la cantidad de caracteres");}
            }while(pe.length()>=40);
            System.out.println("Ingrese su traduccion en ingles");
            pi=s.next();
            palabra [i][1]=pi;
            i++;System.out.println("Quiere ingresar otra palabra");
            r=s.next();
            }while(r.equals("si"));
        
    }

    public static void traducir(String[][] palabra) {
        Scanner s=new Scanner(System.in);
        String pt;
        
        System.out.println("Que palabra quiere traducir");
        pt=s.next();
        boolean en=true;
        for (int i = 0; i < palabra.length; ++i) {

            if (pt.equals(palabra[i][0])) {
                System.out.println("La traduccion es");
                System.out.println(palabra[i][1]);
                en=true;
            }
            else en=false;
        }
        if (en==false) {
            System.exit(0);
        }
        else System.out.println("La palabra no se encontro");
    }
    
}
