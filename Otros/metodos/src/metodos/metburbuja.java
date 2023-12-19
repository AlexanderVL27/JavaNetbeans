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
public class metburbuja {
    public static void metburbuja (int[]a){
        boolean inter=true;
        int aux;
        for (int i = 0; i < a.length-1&&inter; i++) {
            inter=false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    inter=true;
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
    }
}
