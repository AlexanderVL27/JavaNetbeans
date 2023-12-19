/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaa;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class arreglo {
    private int n;
    private int []dato = new int[n];

    public arreglo() {
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setDato(int[] dato) {
        this.dato = dato;
    }

    public int getN() {
        return n;
    }

    public int[] getDato() {
        return dato;
    }
    
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuantos valores quiere ingresar?");
        n=s.nextInt();
        System.out.println("Ingrese los valores");
        for (int i = 0; i < dato.length; i++) {
            System.out.println("XD");
            dato[i]=s.nextInt();
        }
    }
    public int suma(){
        int res=0;
        for (int i = 0; i < dato.length; i++) {
            res=dato[i];
            res=res+dato[i+1];
        }
        return res;
    }
    public boolean buscar(){
        Scanner s = new Scanner(System.in);
        int num;
        boolean enc=true;
        System.out.println("Cual numero desea buscar");
        num=s.nextInt();
        for (int i = 0; i <dato.length ; i++) {
            enc = num==dato[i];
        }
        return enc;
    }
    public void imprime(boolean f){
        System.out.println("El arreglo es ");
        for (int i = 0; i < dato.length; i++) {
            System.out.println(dato[i]);
        }
        if (f==true) {
            System.out.println("se encontro");
        }
        else System.out.println("No se encontro");
    }
}
