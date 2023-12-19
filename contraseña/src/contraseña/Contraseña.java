/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        String clave="segura", contraseña;
        int nveces=0;
        do{
            System.out.print("Introdusca la contraseña: ");
            contraseña=s.next();
            nveces++;
        }
        while(!clave.equals(contraseña)&&nveces<3);
        
        if (nveces==3&&!clave.equals(contraseña)){
            System.out.println("Se equivoco");
        }
        else
            System.out.println("Clave correcta :)");
    }
    
}
