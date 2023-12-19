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
public class Persona {
    private String direccion,nombre;

    public Persona() {
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void llenarp()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre=s.nextLine();
        System.out.println("Ingrese el direccion");
        direccion=s.nextLine();
    }
    public void imprimirp(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La direccion es: "+direccion);
    }
}
