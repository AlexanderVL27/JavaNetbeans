/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float ndj,prec,des,tot,sub;
        Scanner s= new Scanner (System.in);
        System.out.println("Numero de Jerseys a comprar");
        ndj=s.nextFloat();
        System.out.println("Costo de cada Jersey");
        prec=s.nextFloat();
        sub=prec*ndj;
        des=sub*20/100;
        tot=sub-des;
        System.out.println("Pago final: "+tot);
    }
    
}
