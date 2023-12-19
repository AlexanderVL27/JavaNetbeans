package ejedeitel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author villa
 */
public class crearb extends JPanel {

    private ArrayList<bola> bola;


    public crearb() {
        bola = new ArrayList<bola>();
        this.setPreferredSize(new Dimension(500, 500));
        this.addMouseListener(new clic());
    }

    private class clic extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            bola a = new bola(e.getX(), e.getY());
            bola.add(a);
            repaint();
            Thread b = new Thread(a);
            b.start();
            
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        for (bola a : bola) {
            a.draw(g2);
        }
        
        
    }

}
