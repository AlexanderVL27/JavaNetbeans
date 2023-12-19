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
public class Estudiante extends Persona {
    private String escuela, grado;

    public Estudiante() {
        super();
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getGrado() {
        return grado;
    }
    public void llenare(){
        Scanner s = new Scanner(System.in);
        System.out.println("¿En que escuela estudia?");
        escuela=s.nextLine();
        System.out.println("¿Que grado estudia?");
        grado=s.nextLine();
    }
    public void imprimire(){
        System.out.println("La escuela en la que estudia es: "+escuela);
        System.out.println("El grado que cursa es: "+grado);
    }
}
