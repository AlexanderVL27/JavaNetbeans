package pi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;

public class frame extends JFrame implements ActionListener {

    JMenuBar menu = new JMenuBar();
    JMenu arc = new JMenu("Archivo");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    paintpanel p = new paintpanel();
    JMenuItem guardar = new JMenuItem("Guardar");
    JMenuItem abrir = new JMenuItem("Abrir");
    JMenuItem limpiar = new JMenuItem("Limpiar");
    JMenuItem cambiarc = new JMenuItem("Cambiar color");
    ayg g = new ayg();

    public frame() {
        super("Paint");
        setLayout(new BorderLayout());
        p.setPreferredSize(new Dimension(600, 200));
        p1.add(p);
        arc.add(guardar);
        arc.add(abrir);
        arc.add(limpiar);
        arc.add(cambiarc);
        menu.add(arc);
        p2.add(menu);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.EAST);
        limpiar.addActionListener(this);
        abrir.addActionListener(this);
        guardar.addActionListener(this);
        cambiarc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == limpiar) {
            p.repaint();
            showMessageDialog(null, "Borrado");
        }
        if (e.getSource() == cambiarc) {
            new colir(p);
            
        }
        if (e.getSource() == abrir) {
            g.abrir();
        }
        if (e.getSource() == guardar) {
            g.serializar();
        }
    }
}
