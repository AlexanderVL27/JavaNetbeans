/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaservior;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.net.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author villa
 */
public class cliente implements ActionListener {

    static JTextField busqueda, datos;
    static JLabel a;
    static JButton b;

    public void go() {
        JFrame frame = new JFrame("Hola");
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
        b = new JButton("Send");
        mainPanel.add(b);
        b.addActionListener(this);
    }

    public static void main(String[] args) {
        cliente c = new cliente();
        c.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int puertoser = 4243;
            byte buffer[] = new byte[1024];
            try {
                System.out.println("Entre");
                InetAddress direccionser = InetAddress.getByName("localhost");
                DatagramSocket socket = new DatagramSocket();
                System.out.println("Entre2");
                String nom = busqueda.getText();
                buffer = nom.getBytes();
                DatagramPacket res = new DatagramPacket(buffer, buffer.length, direccionser, puertoser);
                socket.send(res);
                System.out.println("Envie");
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                socket.receive(peticion);
                System.out.println("recibi");
                String dato = new String(peticion.getData());
                datos.setText(dato);

                socket.close();

            } catch (SocketException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
