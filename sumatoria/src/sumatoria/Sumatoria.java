/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

/**
 *
 * @author villa
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,j,sum,xd;
        for (i = 2; i <= 13; i++) {
            sum=0;
            for (j = 2; j < 100; j+=i) {
                
                sum+=j;
            }
            System.out.println(sum);
        }
    }
    
}
