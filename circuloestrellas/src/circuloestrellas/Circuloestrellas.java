/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuloestrellas;

import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author villa
 */
public class Circuloestrellas {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Drawing 2D Shapes" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        estrella shapes2JPanel = new estrella();
        frame.add( shapes2JPanel );
        frame.setBackground( Color.WHITE ); 
        frame.setSize( 315, 330 );
        frame.setVisible( true );
    }

}
