/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author villa
 */
public class circulo1 {

    private final static double pi = 3.141592;
    public static int numCirculos;
    private punto centro; // coordenadas del centro
    private double radio; // radio del círculo

    circulo1(double d, double d0, double d1) {
    }


    protected void msgEsNegativo() {
        System.out.println("El radio es negativo. Se convierte a positivo");
    }

    public circulo1() { // constructor sin parámetros
        this(100.0, 100.0, 100.0); // llama a ejecución al constructor con argumentos
    }

    public void circulo1(double cx, double cy, double r) { // constructor
        centro = new punto(cx, cy);
        if (r < 0) {
            msgEsNegativo();
            r *=-1;
        }
        radio = r;
        numCirculos++;
    }

    public double longCircunferencia() {
        return 2 * pi * radio;
    }

    public double areaCirculo() {
        return pi * radio * radio;
    }
}
