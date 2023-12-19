package figura;
import java.util.Scanner;
public class Rectangulo extends Figura {
    Scanner t = new Scanner(System.in);
    private int a;

    public Rectangulo() {
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }    
    public void llenar(){
        System.out.println("Ingrese la base");
        setDato(t.nextInt());
        System.out.println("Ingrese la altura");
        a=t.nextInt();
    }    
    @Override
    public double area(){
        return getDato()*a;
    }
    @Override
    public double perimetro(){
        return 2*getDato()+2*a;
    }
    @Override
    public void im(){
        System.out.println("##########Rectangulo#############");
        System.out.println("El area es: "+area());
        System.out.println("El perimetro es: "+perimetro());
    }
}
