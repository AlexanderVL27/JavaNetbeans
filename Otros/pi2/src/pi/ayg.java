/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author villa
 */
public class ayg implements Serializable {

    paintnew p2;

    public void serializar(paintnew p) {
        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\paint.txt"));
            archivo.writeObject(p);
            archivo.close();
        } catch (Exception e) {

        }
    }

    public void abrir() {
        try {
            ObjectInputStream vuelta = new ObjectInputStream(new FileInputStream("C:\\Users\\villa\\OneDrive\\Escritorio\\Topicos\\paint.txt"));
            p2 = (paintnew) vuelta.readObject();
            vuelta.close();
        } catch (Exception e) {

        }
    }
}
