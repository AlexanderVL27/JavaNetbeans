/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosfibonacci;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Numerosfibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        int numero,a,b,i,con=0,j=0,lim;
        do{
            System.out.println("Cuantos numeros fibonaci quiere ver(Tiene que ser mayor del numero a comparar)");
            lim=s.nextInt();
            System.out.print("Introduce el numero que quiere comprobar: ");
            numero = s.nextInt();
            for(j = 1; j <= lim; ++j){
                if((numero % j) == 0)
                con++;
            }
            if(con <= 2)
                System.out.println("El numero es primo");
            else
            System.out.println("El numero no es primo"); 
        }
        while(lim<=1&&lim!=0);
        System.out.println("Los primeros términos de la serie de Fibonacci son:");
        a=1;
        b=1;
        System.out.println(a + " ");
        for(i=2;i<=lim;i++){
             System.out.println(b + " ");
             if (numero==b){
                     System.out.println("El numero "+numero+" si esta");
                     break;}
             else if(i<lim){
                 b=a+b;
                 a=b-a;}
             else{
                 System.out.println("El numero no esta");
             }
        }
    }
}
