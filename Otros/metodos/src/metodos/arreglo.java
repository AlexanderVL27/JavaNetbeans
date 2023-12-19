/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author villa
 */
public class arreglo {
    public static void arreglo(int []a){
        System.out.println("Numeros generados");
        for (int i = 0; i <a.length ; i++) {
            a[i]=(int) (Math.random()*100);
            System.out.println(" "+a[i]);
            
        }
    }
}
