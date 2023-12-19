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
public class Cliente {
    private String nombre;
    private int edad;
    static int cc=0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setCc(int cc) {
        Cliente.cc = cc;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static int getCc() {
        return cc;
    }

    public static void incrementarcontador(){
        cc++;
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del cliente:");
        nombre=s.next();
        System.out.println("Edad del cliente: ");
        edad=s.nextInt();
    }
    public void imprimir (){
        System.out.println(nombre+"Tiene la edad de "+edad);
    }
}
