/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

public class T1 {
    public static void createWindow ( ) {
        JFrame aWindow = new JFrame ( "Ejercicio" );
        Toolkit theKit = aWindow.getToolkit ( );
        Dimension wndSize = theKit.getScreenSize ( );
        aWindow.setSize ( wndSize.width / 2, wndSize.height / 2 ); 
        aWindow.setLocationRelativeTo ( null );   
        aWindow.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        FlowLayout ﬂow = new FlowLayout ( );
        Container content = aWindow.getContentPane ( ); 
        content.setLayout ( ﬂow );
        for ( int i = 1; i <= 6; ++i ) {
            content.add ( new JButton ( "Presione " + i ) );
            aWindow.setVisible ( true );
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater ( new Runnable ( ) {
            public void run ( ) {
                createWindow ( );
            }
        });
    }
    
}
