/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author villa
 */
public class Articulos {
    private String clave=("xxxxxxxxx"),desc=("Bonito,grande,impresionante,barato"),nombre=("Papel");
    private double precio =(1);

    public Articulos() {
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public String getDesc() {
        return desc;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
}
