
package practica.pkg7.u4;

import java.util.Scanner;

public class Practica7U4 {

    public static void main(String[] args) {
       String frase="Hola a todos los estudiantes del ITCM";
        System.out.println(frase);
        System.out.println("Tamaño de la frase "+frase.length());
        frase=frase.toUpperCase();
        boolean contains = frase.contains("ITCM");
        if(contains){
            System.out.println("Si contiene ITCM");
        }
            else
            System.out.println("No contiene ITCM");
        boolean a = frase.contains("ALUMNOS");
        if(a){
            System.out.println("Si contiene ALUMNOS");
        }
        else
            System.out.println("No contiene ALUMNOS");
        String sSubCadena = frase.substring(10,11);
        System.out.println("El caracter en la posicion 10 es "+sSubCadena);
    }
    
}
