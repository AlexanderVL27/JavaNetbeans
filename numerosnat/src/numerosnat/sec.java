/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosnat;

/**
 *
 * @author villa
 */
public class sec {

    public sec() {
    }
    
     public int par(int n){
           if (n>0) {
            System.out.println(n);
            return par(n-1);
        }else 
            return 0;
     }
}
