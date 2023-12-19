package figura;
import java.util.Scanner;
public class Cubo extends Cuadrado {
    Scanner t = new Scanner(System.in);

    public Cubo() {
    }
    @Override
    public void llenar(){
        System.out.println("Ingrese el lado");
        setDato(t.nextInt());
    }
    @Override
    public double area(){
        return (Math.pow(getDato(), 2))*6;
    }
    @Override
    public double perimetro(){
        return getDato()*12;
    }
    public double volumen(){
        return Math.pow(getDato(), 3);
    }
    @Override
    public void im(){
        System.out.println("##########Cubo#############");
        System.out.println("El area es: "+area());
        System.out.println("El perimetro es: "+perimetro());
        System.out.println("El volumen es: "+volumen());
    }
}
