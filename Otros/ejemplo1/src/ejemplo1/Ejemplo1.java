/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
import java.io.*;
import java.net.*;  
/**
 *
 * @author villa
 */
public class Ejemplo1 {
    public void go ( ) {
        try {
            Socket s = new Socket ( "127.0.0.1", 4242 );

            InputStreamReader streamReader = new 
                                  InputStreamReader ( s.getInputStream ( ) );
            BufferedReader reader = new  BufferedReader ( 
                                                       streamReader );
                        String advice = reader.readLine ( );
                        System.out.println ( "Today you should: " + advice );
            reader.close ( ); 
            } catch ( IOException ex ) {
            ex.printStackTrace ( );
        }
    }

    public static void main(String[] args) {
        Ejemplo1 client = new Ejemplo1 ( );
        client.go ( );

    }
    
}
