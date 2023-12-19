/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calfconarreglos;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Calfconarreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int na,nnot;
        float mg,sp;
        Scanner s=new Scanner(System.in);
        System.out.println("Numero de alumnos");
        na=s.nextInt();
        System.out.println("Numero de notas");
        nnot=s.nextInt();
        String []nom=new String[na];
        float [][]nnota=new float[na][nnot];
        float []prom=new float [na];
        leerdatos(nom,nnota);
        mest(prom,nnota,na,nnot);
        mg=mediag(prom,na);
        imprimir(nom,nnota,prom,mg);
    }

    public static void leerdatos(String []nom, float [][]nnota) {
        Scanner s=new Scanner(System.in);
        float suma=0;
        for (int i = 0; i < nom.length; i++) {
            System.out.println("Nombre del alumno");
            nom[i]=s.next();
            for (int j = 0; j < nnota[0].length; j++) {
                System.out.println("Nota numero "+(j+1));
                nnota[i][j]=s.nextFloat();
            }
        }
    }

    private static void mest(float[] prom, float[][] nnota, int na, int nnot) {
        for (int i = 0; i < na; i++) {
            float proms=0;
            for (int j = 0; j < nnot; j++) {
                proms=proms+nnota[i][j];
            }
            prom[i]=proms/nnot;
        }
    }

    private static float mediag(float[] prom, int na) {
        
        float mediag=0;
        for (int i = 0; i < na; i++) {
            mediag+=prom[i];
        }
        mediag=mediag/na;
        return mediag;
    }

    private static void imprimir(String[] nom, float[][] nnota, float[] prom, float mg) {
        for (int i = 0; i < nom.length; i++) {
            System.out.println("-------------------------------------------------------------");
            for (int j = 0; j < nnota[0].length-1; j++) {
                System.out.print("El alumno "+nom[i]+"        Nota 1      Nota 2      Promedio");
                if((j+1)<nnota[0].length){
                System.out.printf("%*d",10,nnota[i][j]+"%*d",10,nnota[i][j+1]+"%*d",10,prom[i]);
                }
                else
                    System.out.printf("%*d",10,nnota[i][j]+"%*d",10,nnota[i][j-1]+"%*d",10,prom[i]);
            }
        }
        System.out.println("La media del grupo es "+mg);
    }
}
