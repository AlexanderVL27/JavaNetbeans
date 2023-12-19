
package proyecto1;

import java.util.Scanner;
public class Proyecto1 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        System.out.print("Introduce los grados Farenheit ");
        double f =s.nextDouble();
        double c= 5/9.0*(f-32);
        System.out.println("Los grados Cetigrados equivalentes son "+ c +"°");
    }
    
}
