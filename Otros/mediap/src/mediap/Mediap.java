/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediap;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Mediap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        double f,x,xm=0;
        int n,i;
        System.out.println("Valor de n");
        n=s.nextInt();
        for (i = 1; i <= n; ++i) {
            
            System.out.println("Valor de F");
            f=s.nextDouble();
            while(!(f>0&&f<1)){
                System.out.println("Valor de f");
                f=s.nextInt();
            }
            System.out.println("Valor de x");
            x=s.nextDouble();
            xm=xm+(f*x);
        }
        xm=xm/n;
        System.out.println("La media ponderada es "+xm);
    }
    
}
