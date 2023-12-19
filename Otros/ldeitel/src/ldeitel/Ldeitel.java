/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldeitel;

import java.awt.*;
import javax.swing.*;

public class Ldeitel extends JFrame {

    JPanel panel;
    private Box box1, box2, box5, box6, box7;
    private JComboBox combo;

    String names[] = {"High"};

    public Ldeitel() {
        super("Impresora");
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        box1 = Box.createVerticalBox();
        box1.add(new JCheckBox("Image"));
        box1.add(new JCheckBox("Text"));
        box1.add(new JCheckBox("Code"));
        box2 = Box.createVerticalBox();
        box2.add(new JRadioButton("Selection"));
        box2.add(new JRadioButton("All", true));
        box2.add(new JRadioButton("Applet"));
        Component radioc[] = box2.getComponents();
        ButtonGroup radiobutton = new ButtonGroup();
        for (int i = 0; i < radioc.length; i++) {
            radiobutton.add((AbstractButton) (radioc[i]));
        }
        JPanel box3 = new JPanel();
        box3.setLayout(new GridLayout(4, 1, 5, 5));
        box3.add(new JButton("Ok"));
        box3.add(new JButton("Cancel"));
        box3.add(new JButton("Setup..."));
        box3.add(new JButton("Help"));
        Dimension size = box3.getPreferredSize();
        box3.setMaximumSize(size);
        JPanel box4 = new JPanel();
        box4.setLayout(new FlowLayout());
        box4.add(new JLabel("Print Quality: "));
        box4.add(new JComboBox(names));
        box4.add(new JCheckBox("Print to File"));
        box5 = Box.createHorizontalBox();
        box5.add(Box.createHorizontalGlue());
        box5.add(box1);
        box5.add(Box.createHorizontalStrut(20));
        box5.add(box2);
        box5.add(Box.createHorizontalGlue());
        box6 = Box.createHorizontalBox();
        box6.add(new JLabel("Printer: MyPrinter"));
        box6.add(Box.createHorizontalGlue());
        box7 = Box.createVerticalBox();
        box7.add(Box.createVerticalGlue());
        box7.add(box6);
        box7.add(box5);
        box7.add(box4);
        container.add(box7);
        container.add(box3);
        setSize(400, 165);
        setVisible(true);
    }

    public static void main(String args[]) {
        Ldeitel application = new Ldeitel();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
