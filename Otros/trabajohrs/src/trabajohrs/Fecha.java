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
public class Fecha {
    private int dia,mes,año,dian,añon,mesn;

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getDian() {
        return dian;
    }

    public int getAñon() {
        return añon;
    }

    public int getMesn() {
        return mesn;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDian(int dian) {
        this.dian = dian;
    }

    public void setAñon(int añon) {
        this.añon = añon;
    }

    public void setMesn(int mesn) {
        this.mesn = mesn;
    }
    public Fecha (final Fecha l){
        añon=l.añon;
        mesn=l.mesn;
        dian=l.dian;
    }
}
