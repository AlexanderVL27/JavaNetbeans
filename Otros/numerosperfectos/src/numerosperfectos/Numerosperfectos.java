/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosperfectos;

import java.util.Scanner;


public class Numerosperfectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int np=1,suma=0,n=1,op;
        String numerosp="";
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("Ingrese los numeros perfectos que desea ver");
            op=s.nextInt();
        } while (op<5||op>=20);
        while(np<op)
        {
            n++;
            for(int x=1;x<n;x++)
            {
                if(n%x==0)
                {
                   suma=suma+x;
                }
            }
            if(suma==n)
            {
                np=np+1;
                numerosp=numerosp+suma+",";
                suma=0;
            }
            else
                suma=0;
        }
        System.out.println("No. Perfecto: "+numerosp);//+"8589869056"
    
    }
    
}
