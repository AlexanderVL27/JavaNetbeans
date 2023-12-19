/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosamigos;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Numerosamigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,m;
        System.out.print("Cantidad de parejas: ");
        int max=s.nextInt();
        int cont=0;
        System.out.println("Introduce numeros entre un rango de 10 y 10000");
        while(true)
        {
            System.out.println("Vuelta: "+(cont+1));
            System.out.print("Primer numero: ");
            n=s.nextInt();
            while(n<10 || n>10000)
            {
                System.out.print("Introduce un numero entre el rango indicado: ");
                n=s.nextInt();
            }
            System.out.print("Segundo numero: ");
            m=s.nextInt();
            while(m<10 || m>10000)
            {
                System.out.print("Introduce un numero entre el rango indicado: ");
                m=s.nextInt();
            }
            int sumaN=0;
            for(int i=1; i<=n; i++)
            {
                if(n%i==0)sumaN+=i;
            }
            int sumaM=0;
            for(int i=1; i<=m; i++)
            {
                if(m%i==0)sumaM+=i;
            }
            if(sumaN==sumaM)System.out.println("Son amigos");
            else System.out.println("No son amigos");
            cont++;
            if(cont==max)break;
        }
    }
    
}
