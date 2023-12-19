/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoprom;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Alumnoprom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float prom,sum=0;
        int i=0,cal;
        System.out.println("Cuando quiera terminar dijite -1 \n");
        System.out.println("ingrese la calificacion");
        cal=s.nextInt();
        while (cal!=-1){
            sum=sum+cal;
            System.out.println("Dijite la calificacion");
            cal=s.nextInt();
            
            i=i+1;
        }
        prom=sum/i;
        System.out.println("El promedio del alumno es "+prom);
    }
    
}
