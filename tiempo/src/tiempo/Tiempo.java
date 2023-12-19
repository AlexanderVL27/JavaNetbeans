package tiempo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tiempo extends JFrame {
    private tiempoc tiempo;
    private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
    private JTextField horaCampo, minutoCampo, segundoCampo,pantallaCampo;
    private JButton salirBoton;
        public Tiempo ( ) {
        super ( "Demostración de clase interna" );
        tiempo = new tiempoc ( );  // crear objeto Tiempo
        Container contenedor = getContentPane ( );
        contenedor.setLayout ( new FlowLayout ( ) );

        // preparar horaEtiqueta y horaCampo
        horaEtiqueta = new JLabel ( "Ajuste hora" );
        horaCampo = new JTextField ( 10 );
        contenedor.add(horaEtiqueta);
        contenedor.add(horaCampo);
        minutoEtiqueta = new JLabel ( "Ajuste minuto" );
        minutoCampo = new JTextField ( 10 );
        contenedor.add ( minutoEtiqueta );
        contenedor.add ( minutoCampo );
        segundoEtiqueta = new JLabel ( "Ajuste segundo" );
        segundoCampo = new JTextField ( 10 );
        contenedor.add ( segundoEtiqueta );
        contenedor.add ( segundoCampo );

        pantallaCampo = new JTextField ( 30 );
        pantallaCampo.setEditable ( false );
        contenedor.add ( pantallaCampo );
        salirBoton = new JButton ( "Salir" );
        contenedor.add ( salirBoton );
        
        ActionEventHandler manejador = new ActionEventHandler ( );
        horaCampo.addActionListener ( manejador );
        minutoCampo.addActionListener ( manejador );
        segundoCampo.addActionListener ( manejador );
        salirBoton.addActionListener ( manejador );
        }
        public void mostrarTiempo ( ) {
        pantallaCampo.setText ( "La hora es: " + tiempo );
    }
    public static void main(String[] args) {
        Tiempo ventana = new Tiempo ( );
        ventana.setSize ( 400, 140 );
        ventana.setVisible ( true );
    }
        private class ActionEventHandler implements ActionListener {
        // método para manejar eventos de acción 
        public void actionPerformed ( ActionEvent evento ) {
            // el usuario oprimió salirBoton
            if ( evento.getSource ( ) == salirBoton ) {
                System.exit (0);
            }
            else if ( evento.getSource ( ) == horaCampo ) {
                         tiempo.establecerHora ( Integer.parseInt (evento.getActionCommand ( ) ) );
                         horaCampo.setText ( "" );
            }
                        else if ( evento.getSource ( ) == minutoCampo ) {
                          tiempo.establecerMinuto ( Integer.parseInt (
                                                         evento.getActionCommand ( ) ) );
                          minutoCampo.setText ( "" );
            }
            else if ( evento.getSource ( ) == segundoCampo ) {
                          tiempo.establecerSegundo ( Integer.parseInt (
                                                        evento.getActionCommand ( ) ) );
                          segundoCampo.setText ( "" );
            }
            mostrarTiempo ( );
        }
    } 
}
