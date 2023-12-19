/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import javax.swing.JFrame;

/**
 *
 * @author villa_xaz9a7o
 */
public class Letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        checkBoxFrame.setSize( 275, 100 ); // set frame size
        checkBoxFrame.setVisible( true );
    }
    
}
