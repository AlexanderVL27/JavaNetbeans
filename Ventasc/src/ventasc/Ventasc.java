/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasc;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Ventasc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos modelos de coche hay en inventario");
        int n = s.nextInt();
        Coche c[] = new Coche[n];
        System.out.println("El descuento del dia de hoy es de: ");
        Coche.desc = s.nextDouble();
        for (int i = 0; i < c.length; i++) {
            c[i] = new Coche();
            c[i].llenar();
        }
        Cliente cl[] = new Cliente[10];
        String a = "";
        System.out.println("¿Algun cliente?");
        a = s.next();
        int i = 0;
        int k=0;
        int ac = 0, an = 0;
        if (a.equals("si") || a.equals("Si")) {
            do {
                Cliente.incrementarcontador();
                cl[i] = new Cliente();
                cl[i].llenar();
                System.out.println("COCHES");
                for (k = 0; k < c.length; k++) {
                    c[k].imprimir();
                }
                String re;
                System.out.println("¿Le intereso algun coche?");
                re = s.next();
                System.out.println("¿Algun otro cliente?");
                a = s.next();
                i++;
                if (re.equals("Si") || re.equals("si")) {
                    ac++;
                } else {
                    an++;
                }
                k=0;
            } while (a.equals("si") || a.equals("Si"));
        } else {
            System.out.println("Sigamos trabajando");
        }
        System.out.println("Los clientes del dia de hoy fueron");
        for (int j = 0; j < (ac+an); j++) {
            cl[j].imprimir();
        }
        System.out.println("Los clientes del dia de hoy fueron "+Cliente.cc);
        System.out.println("Los clientes interesados fueron " + ac);
    }
}
