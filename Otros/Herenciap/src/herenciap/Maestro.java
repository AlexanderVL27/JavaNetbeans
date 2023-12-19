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
public class Maestro extends Persona {
    private String materia;

    public Maestro() {
        super();
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
    public void llenarm(){
        Scanner s = new Scanner(System.in);
        System.out.println("Que materia imparte");
        materia=s.nextLine();
    }
    public void imprimirm(){
        System.out.println("La materia que imparte es");
    } 
}
