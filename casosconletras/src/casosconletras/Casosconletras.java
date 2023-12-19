/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casosconletras;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Casosconletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t,pa1;
        char op;
        do{
            System.out.println("Tamaño del arreglo");
            t=s.nextInt();
        }while((t<0)||t>10);
        int a[]=new int [t];
        leerarreglo(a);
        System.out.println("Elegr que quiere sacar");
        System.out.println("a) Producto acumulado");
        System.out.println("b) media aritmetica");
        System.out.println("c) media geometrica");
        System.out.println("d) numeros primos");
        do{
        op=s.next().charAt(0);}while(op<'a'&&op>'d');
        switch(op){
            case 'a':pa1=fpa(a);
                    System.out.println("El producto acumulado es "+pa1);
        }
        
    }
    public static void leerarreglo(int a[]){
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese numero "+i);
            a[i]=s.nextInt();
        }
    }
    public static int fpa(int a[]){
        int pa=1;
        for (int i = 0; i < a.length; i++) 
            pa*=a[i];
        return pa;
    }
}
