package composicioncirculo;
import java.util.Scanner;
public class Cilindro {
    private double a,r;
    public Cilindro() {
    }
    public Cilindro(double radio) {
        this.r=radio;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public double getA() {
        return a;
    }
    
    public void llenarc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        a = s.nextDouble();
    }
    public double volumen(){
        return Circulo.pi*(Math.pow(this.r, 2)*a);
    }
    public void imprimirc(){
        System.out.println("El volumen del cilindro es "+volumen()+r);
        
    }
}
