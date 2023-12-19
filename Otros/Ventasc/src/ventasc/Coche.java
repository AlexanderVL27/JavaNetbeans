/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasc;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Coche {
    private String marca,modelo,color,matricula;
    private int precio;
    static double desc;

    public Coche() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public static double getDesc() {
        return desc;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void setDesc(double desc) {
        Coche.desc = desc;
    }
    public void llenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la marca del coche");
        marca=s.next();
        System.out.println("Ingrese el modelo del coche");
        modelo=s.next();
        System.out.println("Ingrese el color del coche");
        color=s.next();
        System.out.println("Ingrese la matricula del coche");
        matricula=s.next();
        System.out.println("Ingrese el precio del coche");
        precio=s.nextInt();
    }
    public void imprimir(){
        System.out.println("La marca del coche es "+marca);
        System.out.println("El modelo del coche es "+modelo);
        System.out.println("El color del coche es "+color);
        System.out.println("La matricula del coche es "+ matricula);
        System.out.println("El precio de coche es "+precio);
        double pd=precio-(precio*(desc/100));
        System.out.println("El precio con el descuento del dia %"+desc+" es de $"+pd);
    }
}
