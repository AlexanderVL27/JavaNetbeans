package figura;

import java.util.Scanner;
public class Circulo extends Figura {
    Scanner t = new Scanner(System.in);

    public Circulo() {
    }
    
    public void llenar(){
        System.out.println("Ingrese el lado el radio");
        setDato(t.nextInt());
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(getDato(), 2);
    }
    @Override
    public double perimetro(){
        return 2*Math.PI*getDato();
    }
    @Override
    public void im(){
        System.out.println("##########Circulo#############");
        System.out.println("El area es: "+area());
        System.out.println("El perimetro es: "+perimetro());
    }
}
