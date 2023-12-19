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
public class Complejos {
    private Zs z1,z2;

    public Complejos() {
        z1=new Zs();
        z2=new Zs();
    }

    public Zs getZ1() {
        return z1;
    }

    public Zs getZ2() {
        return z2;
    }

    public void setZ1(Zs z1) {
        this.z1 = z1;
    }

    public void setZ2(Zs z2) {
        this.z2 = z2;
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("◘◘◘◘◘◘◘◘-Z1-◘◘◘◘◘◘◘◘");
        System.out.println("Ingrese el numero real");
        z1.setReal(s.nextInt());
        System.out.println("Ingrese la parte imaginaria");
        z1.setImaginario(s.nextInt());
        System.out.println("◘◘◘◘◘◘◘◘-Z2-◘◘◘◘◘◘◘◘");
        System.out.println("Ingrese el numero real");
        z2.setReal(s.nextInt());
        System.out.println("Ingrese la parte imaginaria");
        z2.setImaginario(s.nextInt());
    }
    private int resr,resi;
    public void suma(){
        
        resr=z1.getReal()+z2.getReal();
        resi=z1.getImaginario()+z2.getImaginario();
    }
    public void resta(){
        resr=z1.getReal()-z2.getReal();
        resi=z1.getImaginario()-z2.getImaginario();
    }
    public void Imprimir(){
        System.out.println("El resultado de la operacion es");
        System.out.println(resr+" "+resi+"i");
    }
}
