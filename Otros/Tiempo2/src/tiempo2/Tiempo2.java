package tiempo2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tiempo2 extends JFrame  {

    private tiempoc tiempo;
   private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
   private JTextField horaCampo, minutoCampo, segundoCampo,pantallaCampo;

    public Tiempo2(){
        super ( "Demostración de clase interna anónima" );  
      tiempo = new tiempoc ( );
      crearGUI ( );
      registrarManejadoresDeEventos ( );
    }
    private void crearGUI ( ) {
      Container contenedor = getContentPane ( );
      contenedor.setLayout ( new FlowLayout ( ) );

      horaEtiqueta = new JLabel ( "Ajuste hora" );
      horaCampo = new JTextField ( 10 );
      contenedor.add ( horaEtiqueta );
      contenedor.add ( horaCampo );

      minutoEtiqueta = new JLabel ( "Ajuste minuto" );
      minutoCampo = new JTextField ( 10 );
      contenedor.add ( minutoEtiqueta );
      contenedor.add ( minutoCampo );
      segundoEtiqueta = new JLabel ( "Ajuste segundo" );
      segundoCampo = new JTextField ( 10 );
      contenedor.add ( segundoEtiqueta );
      contenedor.add ( segundoCampo );

      pantallaCampo = new JTextField ( 30 );
      pantallaCampo.setEditable( false );
      contenedor.add ( pantallaCampo );

   } 
    private void registrarManejadoresDeEventos ( ) {
        horaCampo.addActionListener ( new ActionListener ( ) {
            public void actionPerformed ( ActionEvent evento ) {
                tiempo.establecerHora ( Integer.parseInt (evento.getActionCommand ( ) ) );
                horaCampo.setText ( "" );
                mostrarTiempo ( );
            }
          }
        );  
        minutoCampo.addActionListener (new ActionListener ( ) {
            public void actionPerformed ( ActionEvent evento ) {
                tiempo.establecerMinuto ( Integer.parseInt (evento.getActionCommand ( ) ) );
                minutoCampo.setText ( "" );
                mostrarTiempo ( );
                    }
                }
        );
        segundoCampo.addActionListener (new ActionListener ( ) {
                    public void actionPerformed ( ActionEvent evento ) {
                        tiempo.establecerSegundo ( Integer.parseInt (evento.getActionCommand ( ) ) );
                        segundoCampo.setText ( "" );
                        mostrarTiempo ( );
                    }
                });
    }
    public void mostrarTiempo ( ) {
        pantallaCampo.setText ( "La hora es: " + tiempo );
    }
    public static void main(String[] args) {
        Tiempo2 ventana = new Tiempo2 ( );
        ventana.addWindowListener (new WindowAdapter ( ) {
            public void windowClosing ( WindowEvent evento ) {
                System.exit ( 0 );
            }
        }
     );
        ventana.setSize ( 400, 105 );
        ventana.setVisible ( true );
    } 
}
