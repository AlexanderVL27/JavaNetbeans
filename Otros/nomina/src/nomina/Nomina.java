/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,c=0;
        float sue,suma=0;
        int i=1;
        System.out.println("Para terminar digite -1");
        System.out.println("Dijite solo numeros enteros");
        System.out.println("¿Quiere ingresar un nuevo trabajador?");
        c=s.nextInt();
        
        while(c!=-1){
            System.out.println("Cual es el sueldo del trabajador ");
            sue=s.nextFloat();
            if (sue<1000) {
                sue=(float) (sue*1.15);
            }
            else if(sue>=1000){
                sue=(float) (sue*1.12);
            }
            suma+=sue;
            System.out.println("¿Quiere ingresar un nuevo trabajador?");
            c=s.nextInt();
        }
        System.out.println("La nomina es "+suma);
    }
    
}
