package composicioncirculo;
import java.util.Scanner;
public class ComposicionCirculo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        System.out.println("Primer CIRCULO");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=s.nextDouble();
        Circulo circ1 = new Circulo(radio);
        circ1.area();
        circ1.imprimir();
        circ1.mostrarvolumen();
        System.out.println("Seundo CIRCULO");
        radio=0;
        System.out.println("Ingrese el radio");
        radio=s.nextDouble();
        Circulo circ2 = new Circulo(radio);
        circ2.area();
        circ2.imprimir();
        circ2.mostrarvolumen();
    }
}
