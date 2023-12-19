/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejosp;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Complejosp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op;
        Scanner s = new Scanner(System.in);
        Complejos z = new Complejos();
        z.llenar();
        System.out.println("Que operacion quiere hacer");
        op=s.next();
        if (op.equals("suma")||op.equals("Suma")) {
            z.suma();
        }
        else if(op.equals("resta")||op.equals("Resta")){
            z.resta();
        }
        z.Imprimir();
    }
    
}
