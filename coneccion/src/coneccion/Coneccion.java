/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa_xaz9a7o
 */
public class Coneccion {

         private final String base = "cienti";
    private final String user = "root";
    private final String password = "alexander50";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url,this.user,this.password);
        } catch (SQLException ex) {
            System.err.print(ex);
        }catch (ClassNotFoundException e){
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE,null,e);
        }return con;
    }
    
    public void cerrar_conexion() throws SQLException{
        if (con!=null){
            con.close();
        }
    }
    
}
