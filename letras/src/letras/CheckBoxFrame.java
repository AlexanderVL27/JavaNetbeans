/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

/**
 *
 * @author villa_xaz9a7o
 */
public class CheckBoxFrame extends JFrame {

    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;
    private JCheckBox ArialJCheckBox;
    private JCheckBox TahomaJCheckBox;
    private JCheckBox TimesNRJCheckBox;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        ArialJCheckBox = new JCheckBox("PLAIN");
        TahomaJCheckBox = new JCheckBox("ROMAN BASELINE");
        TimesNRJCheckBox = new JCheckBox("TYPE1 FONT");
        add(boldJCheckBox);
        add(italicJCheckBox);
        add(ArialJCheckBox);
        add(TahomaJCheckBox);
        add(TimesNRJCheckBox);
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
        ArialJCheckBox.addItemListener(handler);
        TahomaJCheckBox.addItemListener(handler);
        TimesNRJCheckBox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

            } else if (boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else if(ArialJCheckBox.isSelected()){
                font = new Font("Serif", Font.PLAIN, 14);
            }
            else if(TahomaJCheckBox.isSelected()){
                font = new Font("Serif", Font.ROMAN_BASELINE, 14);
            }else if(TimesNRJCheckBox.isSelected()){
                font = new Font("Serif", Font.TYPE1_FONT, 14);
            }
            textField.setFont(font);
        }
    }
}
