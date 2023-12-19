/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaservior;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.*;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa
 */
public class Tareaservior {

    public static byte buffer[] = new byte[1024];
    public static void main(String[] args) {
        int puerto = 4243;
        File alumnos[] = new File[3];
        alumnos[0] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Alexander.txt");
        alumnos[1] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Jaime.txt");
        alumnos[2] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Pancho.txt");

        try {
            DatagramSocket socket = new DatagramSocket(puerto);
            while (true) {
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                socket.receive(peticion);
                System.out.println("recivi");
                String nombrep = new String(peticion.getData());
                encontrar(nombrep,alumnos);
                int puertocliente = peticion.getPort();
                InetAddress dire = peticion.getAddress();

                DatagramPacket res = new DatagramPacket(buffer, buffer.length, dire, puertocliente);
                socket.send(res);
            }
        } catch (SocketException ex) {
            Logger.getLogger(Tareaservior.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tareaservior.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void encontrar(String nombre, File[] alumnos) {
                String nombrep = nombre + ".txt";
                String informacion;
                String nombrear;
                String t;
                StringBuffer sbuffer = new StringBuffer();
                for (File datos:alumnos) {
                    nombrear=datos.getName();
                    if (true) {
                        try {
                            BufferedReader leer = new BufferedReader(new FileReader(datos));
                            while ((informacion = leer.readLine()) != null) {
                                sbuffer.append(informacion);
                                t=sbuffer.toString();
                                buffer=t.getBytes();
                            }
                            leer.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Tareaservior.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        System.out.println("No encontrado");
                    }
                }
    }

}
