/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohrs;

/**
 *
 * @author villa
 */
public class Trabajadores {
    private int id,salario;
    private String nombre;
    private Fecha fechaingreso,fechanac;
    private Hora horaentrada,horasalida;

    public Trabajadores() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaingreso(Fecha fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public void setFechanac(Fecha fechanac) {
        this.fechanac = fechanac;
    }

    public void setHoraentrada(Hora horaentrada) {
        this.horaentrada = horaentrada;
    }

    public void setHorasalida(Hora horasalida) {
        this.horasalida = horasalida;
    }

    public int getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaingreso() {
        return fechaingreso;
    }

    public Fecha getFechanac() {
        return fechanac;
    }

    public Hora getHoraentrada() {
        return horaentrada;
    }

    public Hora getHorasalida() {
        return horasalida;
    }
}
