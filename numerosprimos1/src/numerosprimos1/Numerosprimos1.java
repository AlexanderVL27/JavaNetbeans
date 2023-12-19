/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos1;
import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Numerosprimos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,j,cotp=0,div=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Limite de los numeros primos");
        n=s.nextInt();
        for(i=1;i>0;i++)
        {
            for(j=1;j<=i;++j)
                if(i%j==0){
                    div++;
                }
                if(div==2||div==1){
                    System.out.println(i);
                    cotp++;
                }
                div=0;
                if(cotp==n){
                    break;
                }
            
        }
         int i=1, suma,n,cotp,mx=0,c=0,x=0;
        
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("Ingrese los numeros perfectos que desea ver");
            n=s.nextInt();
        } while (n<=5||n>=20);
    }
    
}
