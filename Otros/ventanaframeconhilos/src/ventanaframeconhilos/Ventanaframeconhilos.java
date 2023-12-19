/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaframeconhilos;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author villa
 */
public class Ventanaframeconhilos {

    public static void createWindow ( ) {
        JFrame aWindow = new JFrame ( "Título de la ventana" );
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds ( 50, 100,windowWidth, windowHeight );
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible ( true );
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater ( new Runnable ( ) {
            public void run ( ) {
                createWindow ( );
            }
        });
    }  
}
