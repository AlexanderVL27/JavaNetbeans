/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosn1;

/**
 *
 * @author villa
 */
public class Metodosn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=7,may,k,i=0;
        boolean b;
        int a[]={80,60,75,100,50,55,85};
        
        for (int j = 0; j <= n-1; j++) {
            may=a[j];
            k=j;
            for (i = j+1; i < n; i++) {
                if (a[i]>may) {
                    may=a[i];
                    k=i;
                }
            }
            a[k]=a[j];
            a[j]=may;
           System.out.println(a[j]); 
        }
        
    }
    
}
