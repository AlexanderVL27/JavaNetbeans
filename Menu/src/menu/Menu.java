
package menu;
import javax.swing.*;
import java.awt.*;

public class Menu {
    public static void main(String[] args) {
                SwingUtilities.invokeLater ( new Runnable ( ) {
            public void run ( ) {
                createWindow ( );
            }
        });
    }
    public static void createWindow ( ) {
        window = new m1 ( "Menu" ); 
        Toolkit theKit = window.getToolkit ( );  
        Dimension wndSize = theKit.getScreenSize ( );  
        window.setSize ( wndSize.width / 2, wndSize.height / 2 ); 
        window.setLocationRelativeTo ( null );     
        window.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        window.setVisible ( true );
    }
    private static m1 window;
}
