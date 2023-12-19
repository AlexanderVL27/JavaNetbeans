/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercia1;

/**
 *
 * @author villa
 */
public class Tercia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i,sum=0;
        for (i = 2; i < 100; i+=3){
            
            System.out.println(" + "+i);
            sum=sum+i;
        }
        System.out.println("La suma es "+sum);
    }
    
}
