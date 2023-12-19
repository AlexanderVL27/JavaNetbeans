/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercia;

/**
 *
 * @author villa
 */
public class Tercia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,res=0,j=0;
        System.out.println("La lista de enteros de tres en tres es:");
        for (i = 2; i < 100; ++i) {
            
            if((i %5)==0)
            {
                res=res+i;
                
            }
            if((i%3)==0){
            
                j=i;
                System.out.println(j);
            }
        }
        
        System.out.println("La suma de los divisores de 5 es "+res);
    }
    
}
