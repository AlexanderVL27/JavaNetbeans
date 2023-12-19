package ejercicio1;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author villa_xaz9a7o
 */
class ope extends JFrame implements ActionListener {

    private JTextField a, b, c;
    private JButton sum, l, res, mul;
    private JLabel t;

    public ope() {
        super("Ecuaciones cuadraticas");

        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p.setPreferredSize(new Dimension(350, 30));
        p.setBackground(Color.CYAN);

        t = new JLabel("a");
        p.add(t);
        a = new JTextField(5);
        p.add(a);
        t = new JLabel("b");
        p.add(t);
        b = new JTextField(5);
        p.add(b);
        add(p);

        t = new JLabel("Resultado");
        p1.add(t);
        c = new JTextField(5);
        p1.add(c);
        add(p1);

        p2.setPreferredSize(new Dimension(350, 40));
        p2.setBackground(Color.CYAN);
        sum = new JButton("Suma");
        sum.addActionListener(this);
        p2.add(sum);
        p2.setPreferredSize(new Dimension(350, 40));
        p2.setBackground(Color.CYAN);
        res = new JButton("Resta");
        res.addActionListener(this);
        p2.add(res);
        p2.setPreferredSize(new Dimension(350, 40));
        p2.setBackground(Color.CYAN);
        mul = new JButton("Multiplicacion");
        mul.addActionListener(this);
        p2.add(mul);
        add(p2);

        p3.setPreferredSize(new Dimension(350, 40));
        p3.setBackground(Color.CYAN);
        l = new JButton("Limpiar campos");
        l.addActionListener(this);
        p3.add(l);
        add(p3);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sum) {
            if (validar(a.getText()) == true && validar(b.getText()) == true) {
                String w = a.getText();
                String s = b.getText();

                double a1 = Double.parseDouble(w);
                double b1 = Double.parseDouble(s);

                double suma = a1 + b1;
                String rs = String.valueOf(suma);
                c.setText(rs);
            }
        } else if (e.getSource() == res) {
            if (validar(a.getText()) == true && validar(b.getText()) == true) {
                String w = a.getText();
                String s = b.getText();

                double a1 = Double.parseDouble(w);
                double b1 = Double.parseDouble(s);

                double res = a1 - b1;
                String rr = String.valueOf(res);
                c.setText(rr);
            }
        } else if (e.getSource() == mul) {
            if (validar(a.getText()) == true && validar(b.getText()) == true) {
                String w = a.getText();
                String s = b.getText();

                double a1 = Double.parseDouble(w);
                double b1 = Double.parseDouble(s);

                double mult = a1 * b1;
                String rm = String.valueOf(mult);
                c.setText(rm);
            }

        } else if (e.getSource() == l) {
            a.setText("");
            b.setText("");
            c.setText("");
        }
    }

    public boolean validar(String a) {
        if (a.equals("")) {
            getToolkit().beep();
            showMessageDialog(null, "Ingrese algun numero");
            return false;
        } else {
            return true;
        }
    }
}
