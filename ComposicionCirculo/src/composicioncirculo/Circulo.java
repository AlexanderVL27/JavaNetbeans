/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncirculo;

/**
 *
 * @author villa
 */
public class Circulo {
    protected double radio;
    private String r;
    static final double pi=3.1416;
    private Cilindro c = null;
    
    public Circulo(double r){
        this.radio=r;
        c = new Cilindro(r);
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public static double getPi() {
        return pi;
    }
    public double area(){
        return pi*Math.pow(radio,2);
    }
    public void imprimir(){
        System.out.println("El area del circulo es: "+area());
    }
    public void mostrarv(){
        if (c!=null) {
            c.llenarc();
            c.imprimirc();
        }
        else
            System.out.println("No hay cilindro");
    }
}
