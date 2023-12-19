package pi;

import javax.swing.JFrame;

/**
 *
 * @author villa
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frame f = new frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 250);
        f.setVisible(true);
        f.setResizable(false);
    }
    
}
