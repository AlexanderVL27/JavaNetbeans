/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrgelosedades;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Arrgelosedades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,cn=0,ca=0,cda=0,cdam=0,sum=0,sumn=0,suma=0,sumad=0,summ=0;
        do {
            System.out.println("Ingrese el numero de personas");
            n=s.nextInt();
        } while (n<0||n>50);
        int ed[]=new int [n];
        String nom[]=new String[n];
        String niños[]=new String[n];
        String ado[]=new String[n];
        int eda[]=new int[n];
        int edn[]=new int[n];
        String cdax[]=new String[n];
        int edc[]=new int[n];
        String xi[]=new String[n];
        int edx[]=new int[n];
        for (i = 0; i <n; i++) {
            System.out.println("Ingrese el nombre");
            nom[i]=s.next();
            System.out.println("Ingrese la edad");
            ed[i]=s.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (ed[i]<12) {
                System.out.println(nom[i]);
                System.out.println(ed[i]);
                ed[i]=edn[i];
                nom[i]=niños[i];
                sum=sum+edn[i];
                sumn+=sum;
                cn++;
            }
            else if (ed[i]<18) {
                System.out.println(nom[i]);
                System.out.println(ed[i]);
                ed[i]=eda[i];
                nom[i]=ado[i];
                sum=sum+eda[i];
                suma+=sum;
                ca++;
            }
            else if (ed[i]<60) {
                System.out.println(nom[i]);
                System.out.println(ed[i]);
                ed[i]=edc[i];
                nom[i]=cdax[i];
                sum=sum+edc[i];
                sumad+=sum;
                cda++;
            }
            else{
                System.out.println(nom[i]);
                System.out.println(ed[i]);
                ed[i]=edx[i];
                nom[i]=xi[i];
                sum=sum+edx[i];
                summ+=sum;
                cdam++;
            }
        }
        System.out.println("Niños "+cn);
        System.out.println("Adolecentes "+ca);
        System.out.println("Adultos "+cda);
        System.out.println("Adultos mayores "+cdam);
        for (i = 0;  i< n; i++) {
            System.out.println("Niño "+niños[i]+" edad "+edn[i]);
            System.out.println("Adolecente "+ado[i]+" edad "+eda[i]);
            System.out.println("Adulto "+cdax[i]+" edad "+edc[i]);
            System.out.println("Adulto mayor "+xi[i]+" edad "+edx[i]);
        }
        System.out.println("La suma de las edades es "+sum);
        System.out.println("La suma de las edades de los niños es "+sumn);
        System.out.println("La suma de las edades de los adolecentes es "+suma);
        System.out.println("La suma de las edades de los adultos es "+sumad);
        System.out.println("La suma de las edades de los adultos mayores es "+summ);
    }
    
}
