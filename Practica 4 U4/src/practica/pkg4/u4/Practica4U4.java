
package practica.pkg4.u4;

import java.util.Scanner;


public class Practica4U4 {

    public static void main(String[] args) {
        int n,i,j,cotp=0,div=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Limite de los numeros primos");
        n=s.nextInt();
        int im[]=new int[n];
        for(i=1;i>0;i++)
        {
            for(j=1;j<=i;++j)
                if(i%j==0){
                    div++;
                }
                if(div==2||div==1){
                    im[cotp]=i;
                    cotp++;
                }
                div=0;
                if(cotp==n){
                    for (int k = 0; k < im.length; k++) {
                        System.out.println(im[k]);
                    }
                    break;
                }
            
        }
    }
    
}
