/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author villa
 */
public class Tareas {

    static DataOutputStream out;

    public static void main(String[] args) {
        ServerSocket ser = null;
        Socket sc = null;
        final int puerto = 4000;
        DataInputStream in;
        File alumnos[] = new File[3];
        alumnos[0] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Alexander.txt");
        alumnos[1] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Jaime.txt");
        alumnos[2] = new File("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\Pancho.txt");
        try {
            ser = new ServerSocket(puerto);
            while (true) {
                sc = ser.accept();
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                String nombre = in.readUTF();
                encontrar(nombre,alumnos);
                sc.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Tareas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void encontrar(String nombre, File[] alumnos) {
        String nombrep = nombre + ".txt";
        String informacion;
        String nombrear;
        String t;
        for (File datos : alumnos) {
            nombrear = datos.getName();
            if (nombrep.equals(nombrear)) {
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(datos));
                    while ((informacion = leer.readLine()) != null) {
                        t = informacion;
                        out.writeUTF(t);
                        t="";
                    }
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Tareas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
            }
        }
    }

}
