
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LabelTest{
    public static void createWindow ( ) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize( 260, 180 ); 
        labelFrame.setVisible( true );
        Toolkit theKit = labelFrame.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        labelFrame.setSize(wndSize.width/2, wndSize.height/2);
        labelFrame.setLocationRelativeTo(null);
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        labelFrame.getContentPane().setBackground(Color.PINK);
        labelFrame.setVisible(true);
    }
    public static void main( String[] args){
        SwingUtilities.invokeLater ( new Runnable ( ) {
            public void run ( ) {
                createWindow ( );
            }
        });
    }
}
