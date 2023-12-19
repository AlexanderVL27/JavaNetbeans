/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosracionales;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class NumerosRacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String op;
        Racional r = new Racional();
        Racional r2 = new Racional();
        r.llenar();
        System.out.println("Ingrese el radical para hacer la operacion");
        r2.llenar();
        Racional resultado = new Racional();
        System.out.println("Que operacion desea realizar");
        op=s.next();
        if (op.equals("Suma")||op.equals("suma")) {
            resultado=Racional.suma(r,r2);
        }
        else if (op.equals("Resta")||op.equals("resta")) {
            resultado=Racional.resta(r,r2);
        }
        else if (op.equals("Multiplicacion")||op.equals("multiplicacion")) {
            resultado=Racional.mult(r,r2);
        }
        else if (op.equals("Division")||op.equals("division")) {
            resultado=Racional.div(r,r2);
            
        }
        resultado.imprimir();
    }
    
}
