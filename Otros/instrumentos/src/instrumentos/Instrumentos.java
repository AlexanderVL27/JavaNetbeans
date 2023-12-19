/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author villa
 */
public class Instrumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstrumentoMusical i1 = new Viento();
        InstrumentoMusical i2 = new Cuerda();
        InstrumentoMusical i3 = new Percusion();
        InstrumentoMusical i4 = new Saxofon();
        InstrumentoMusical i5 = new Clarinete();
        InstrumentoMusical i6 = new Trompeta();
        InstrumentoMusical i7 = new Guitarra();
        InstrumentoMusical i8 = new Arpa();
        InstrumentoMusical i9 = new Violin();
        InstrumentoMusical i10 = new Timbal();
        InstrumentoMusical i11 = new Tambor();
        InstrumentoMusical i12 = new Platillos();
        
        i1.tocarMelodia();
        i4.tocarMelodia();
        i5.tocarMelodia();
        i6.tocarMelodia();
        i2.tocarMelodia();
        i7.tocarMelodia();
        i8.tocarMelodia();
        i9.tocarMelodia();
        i3.tocarMelodia();
        i10.tocarMelodia();
        i11.tocarMelodia();
        i12.tocarMelodia();
    }
    
}
