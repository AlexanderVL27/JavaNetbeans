package ejedeitel;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JComponent;

public class bola extends JComponent implements Runnable {

    Random r1= new Random();
    int posX, posY;
    int velocidadx = r1.nextInt(50);
    int velocidady = r1.nextInt(50);
    Color color;

    public bola(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.color = color();
    }

    public void mover() {
        if (posX < 0) {
            velocidadx = -velocidadx;
        } else if (posX > 475) {
            velocidadx = -velocidadx;
        }

        if (posY < 0) {
            velocidady = -velocidady;
        } else if (posY > 475) {
            velocidady = -velocidady;
        }
        posX += velocidadx;
        posY += velocidady;

    }

    private static Color color() {
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        Color rColor = new Color(r,g,b);
        return rColor;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval(posX, posY, 50, 50);
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            mover();
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
            }
        }

    }
}
