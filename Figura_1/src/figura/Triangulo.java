package figura;
import java.util.Scanner;
public class Triangulo extends Figura {
    Scanner t = new Scanner(System.in);
    private int a;
    public Triangulo() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    
    public void llenar(){
        System.out.println("Ingrese la base");
        setDato(t.nextInt());
        System.out.println("Ingrese la altura");
        a=t.nextInt();
    }
    
    @Override
    public double area(){
        return (getDato()*a)/2;
    }
    @Override
    public double perimetro(){
        return getDato() + (2 * Math.sqrt((Math.pow(getDato(), 2)+Math.pow(a, 2))));
    }
    @Override
    public void im(){
        System.out.println("##########Triangulo#############");
        System.out.println("El area es: "+area());
        System.out.println("El perimetro es: "+perimetro());
    }
}
