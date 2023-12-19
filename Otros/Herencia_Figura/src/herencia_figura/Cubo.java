/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_figura;

/**
 *
 * @author villa
 */
public class Cubo extends Cuadrado {
    public Cubo() {
        super();
    }

    @Override
    public double area(){
        return (Math.pow(lado, 2))*6;
    }
    @Override
    public double perimetro(){
        return lado*12;
    }
    public double volumen(){
        return Math.pow(lado, 3);
    }
}
