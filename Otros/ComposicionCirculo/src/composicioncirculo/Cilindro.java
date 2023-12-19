/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncirculo;
import java.util.Scanner;
/**
 *
 * @author villa
 */
public class Cilindro {
    private double altura,r;
    public Cilindro() {
    }

    public Cilindro(double radio) {
        this.r=radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void llenarc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        altura = s.nextDouble();
    }
    public double volumen(){
        return Circulo.pi*(Math.pow(this.r, 2)*altura);
    }
    public void imprimirc(){
        System.out.println("El volumen del cilindro es "+volumen()+r);
        
    }
}
