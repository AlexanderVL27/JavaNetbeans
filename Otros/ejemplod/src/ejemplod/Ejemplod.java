/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplod;
import javax.swing.JFrame;


/**
 *
 * @author villa
 */
public class Ejemplod {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "Drawing 2D shapes" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        panel p = new panel();
        frame.add(p);
        frame.setSize( 425, 200 );
        frame.setVisible( true );

    }

}
