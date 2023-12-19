/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author villa
 */
public class cliente implements ActionListener {

    static JTextField busqueda, datos;
    static JLabel a;
    static JButton b,lim;
    String host = "127.0.0.1";
    int puerto = 4000;

    public void go() {
        JFrame frame = new JFrame("Cliente");
        JPanel mainPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
        a = new JLabel();
        a.setText("Ingrese el nombre");
        mainPanel.add(a);
        busqueda = new JTextField(100);
        mainPanel.add(busqueda);
        datos = new JTextField(100);
        mainPanel.add(datos);
        b = new JButton("Enviar");
        mainPanel.add(b);
        b.addActionListener(this);
        lim=new JButton("Limpiar");
        mainPanel.add(lim);
        lim.addActionListener(this);
    }

    public static void main(String[] args) {
        cliente c = new cliente();
        c.go();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String host = "127.0.0.1";
            int puerto = 4000;
            DataOutputStream out;
            DataInputStream in;
            try {
                Socket sc = new Socket(host,puerto);
                 in = new DataInputStream(sc.getInputStream());
                 out = new DataOutputStream(sc.getOutputStream());
                 out.writeUTF(busqueda.getText());
                 String mensaje = in.readUTF();
                 datos.setText(mensaje);
                 sc.close();
            } catch (IOException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource()==lim) {
            busqueda.setText("");
            datos.setText("");
            busqueda.setFocusable(true);
        }
    }

}
