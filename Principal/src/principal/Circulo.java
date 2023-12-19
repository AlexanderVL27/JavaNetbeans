/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author villa
 */
public class Circulo {

    private double radio;
    private Punto centro;

    public Circulo() {
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public Circulo(Punto centro, double radio){
        this.centro=centro;
        this.radio=radio;
    }
    public double Perimetro() {
        return 2 * Math.PI  * radio;
    }
    public double Area(){
        return Math.PI * Math.pow(radio, 2);
    }

    public Circulo(Punto centro) {
        this.centro = centro;
    }
    
}
