package carrera;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;

public class dibujacarro extends JPanel {

    int x = 40, l = 570, y = 70;
    Color c = new Color(255, 0, 0);
    private final static Random generator = new Random();

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public dibujacarro() {

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(c);
        g2.fillRoundRect(x, y, 90, 50, 30, 30);
        g2.setColor(new Color(0, 0, 255));
        g2.fillArc(x + 15, y - 25, 50, 50, 0, 180);
        g2.setColor(new Color(0, 0, 0));
        g2.fillOval(x - 5, y + 30, 30, 30);
        g2.fillOval(x + 65, y + 30, 30, 30);
        g2.drawRect(l, 0, 30, 500);
    }

    public void mover() {

        if (x < l) {
            x = (int) (x + (Math.random()*50)) ;
        }
    }
}
