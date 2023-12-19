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
public class Estudiantedeintercambio extends Estudiante {
    private String paisdeorigen;

    public Estudiantedeintercambio() {
        super();
    }

    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }

    public String getPaisdeorigen() {
        return paisdeorigen;
    }
    public void llenares(){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cual es el pais de origen?");
        paisdeorigen=s.nextLine();
    }
    public void imprimires(){
        System.out.println("El pais de origen es: "+ paisdeorigen);
    }
}
