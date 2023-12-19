/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciap;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Herenciap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Persona p1 = new Persona();
        Estudiante e1 = new Estudiante();
        Maestro m1 = new Maestro();
        Estudiantedeintercambio ei1= new Estudiantedeintercambio();
        System.out.println("Persona:");
        p1.llenarp();
        System.out.println("Estudiante:");
        e1.llenarp();
        e1.llenare();
        System.out.println("Maestro:");
        m1.llenarp();
        m1.llenarm();
        System.out.println("Estudiante de intercambio");
        ei1.llenarp();
        ei1.llenare();
        ei1.llenares();
        System.out.println("Persona");
        System.out.println("=================================================");
        p1.imprimirp();
        System.out.println("Estudiante");
        System.out.println("=================================================");
        e1.imprimirp();
        e1.imprimire();
        System.out.println("Maestro");
        System.out.println("=================================================");
        m1.imprimirp();
        m1.imprimirm();
        System.out.println("Estudiante de intercambio");
        System.out.println("=================================================");
        ei1.imprimirp();
        ei1.imprimire();
        ei1.imprimires();
    }
    
}
