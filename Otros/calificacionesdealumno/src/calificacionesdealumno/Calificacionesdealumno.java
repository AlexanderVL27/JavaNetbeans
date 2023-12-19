/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesdealumno;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Calificacionesdealumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        double prom,cal,sum=0,d=0,nm1=0,sum2=0;
        int i,o,nm,na;
        
        System.out.println("Ingrese el numero de alumnos ");
        na=s.nextInt();
        System.out.println("Ingrese el numero de materias ");
        nm=s.nextInt();
        
        for(o=1;o<=na;++o){
            
            System.out.println("Ingrese la calificacion del alumno "+o);
            
            for(i=1;i<=nm;++i)
            {
                System.out.println("Ingrese la calificacion de la materia numero "+i);
                cal=s.nextDouble();
                sum+=cal;
                sum2+=cal;
            }
            System.out.println("La calificacion del alumno "+o+" es igual a "+(sum2/nm));
            d=nm*na;
        }
            prom=sum/d;
            System.out.println("El promedio de "+na+" alumnos fue "+prom);
    }
    
}
