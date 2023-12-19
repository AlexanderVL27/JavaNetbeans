package tiempo2;
import java.text.DecimalFormat;
public class tiempoc {
    private int hora;
    private int minuto;
    private int segundo;
        private static DecimalFormat dosDigitos = new DecimalFormat ( "00" );
    public tiempoc ( ) {
        this ( 0, 0, 0 );
    }
    public tiempoc ( int h ) {
        this ( h, 0, 0 );
    }
    public tiempoc ( int h, int m ) {
        this ( h, m, 0 );
    }
    public tiempoc ( int h, int m, int s ) {
        establecerTiempo ( h, m, s );
    }
    public void establecerHora ( int h ) { 
        hora = ( ( h >= 0 && h < 24 ) ? h : 0 );
    }
    public void establecerMinuto ( int m ) {
        minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
    }
    public void establecerSegundo ( int s ) {
        segundo = ( ( s >= 0 && s < 60 ) ? s : 0 );
    }
    public int obtenerHora ( ) {
        return hora;
    }

     public int obtenerMinuto ( ) {
        return minuto;
    }

    public int obtenerSegundo ( ) {
        return segundo;
    }
    public tiempoc ( tiempoc tiempoo ) {
        this (tiempoo.obtenerHora(),tiempoo.obtenerMinuto(),tiempoo.obtenerSegundo() );
    }
        private void establecerTiempo ( int h, int m, int s ) {
        establecerHora ( h );
        establecerMinuto ( m );
        establecerSegundo ( s );
    }
    public String aStringUniversal ( ) {
        return dosDigitos.format (obtenerHora()) + ":"+ dosDigitos.format ( obtenerMinuto ( ) ) + ":"+ dosDigitos.format ( obtenerSegundo ( ) );
    }
    public String toString ( ) {
        return (( obtenerHora ( ) == 12 || obtenerHora ( ) == 0) ? 12 : obtenerHora ( ) % 12 ) + ":" +
                       dosDigitos.format ( obtenerMinuto ( ) )
                       + ":" + dosDigitos.format ( obtenerSegundo ( ) )
                       + ( obtenerHora ( ) < 12 ? " AM" : " PM" );
    }
}