/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohrs;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Trabajohrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hra,min,seg,dia,mes,año,id;
        String nombre;
        Fecha f = new Fecha();
        Hora h = new Hora();
        System.out.println("Id del trabajador");
        id=s.nextInt();
        System.out.println("Nombre del trabajador");
        nombre=s.next();
        System.out.print("Dia de nacimiento: ");
        dia=s.nextInt();
        System.out.print("Mes de nacimiento: ");
        mes=s.nextInt();
        System.out.print("Año de nacimineto: ");
        año=s.nextInt();
        
        System.out.print("Hora de entrada: ");
        hra=s.nextInt();
        System.out.print("Minuto de entrada: ");
        min=s.nextInt();
        System.out.print("Segundo de entrada: ");
        seg=s.nextInt();
    }
    
}
