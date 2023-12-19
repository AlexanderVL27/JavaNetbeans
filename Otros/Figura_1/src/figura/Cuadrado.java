
package figura;

import java.util.Scanner;
public class Cuadrado extends Figura {
    Scanner t = new Scanner(System.in);

    public Cuadrado() {
    }
    
    public void llenar(){
        System.out.println("Ingrese el lado");
        setDato(t.nextInt());
    }
    
    @Override
    public double area(){
        return Math.pow(getDato(), 2);
    }
    @Override
    public double perimetro(){
        return getDato()*4;
    }
    @Override
    public void im(){
        System.out.println("##########Cuadrado#############");
        System.out.println("El area es: "+area());
        System.out.println("El perimetro es: "+perimetro());
    }
}
