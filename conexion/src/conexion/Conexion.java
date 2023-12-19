package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private final String base = "conec";
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
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);
        }return con;
    }
    
    public void cerrar_conexion() throws SQLException{
        if (con!=null){
            con.close();
        }
    }
    
    
}
