/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.pkg2.pkg0;

/**
 *
 * @author villa
 */
public class F2 {
    public F2(){
        
    }
    public int fibonacci(int n){
        if((n==1)||(n==2))
            return 1;
        else
            return fibonacci(n-2)+fibonacci(n-1);
    }
}
