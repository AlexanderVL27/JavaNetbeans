
package Equitech;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class AgendarServicio extends javax.swing.JFrame {
    Conexion cc = new Conexion();
    Connection con = cc.getConexion();
 
    public AgendarServicio() {
        initComponents();
        this.setResizable(false);//CANCELA EL BOTON DE MAXIMIZAR PANTALLA
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//SIRVE PARA QUE AL CERRAR LA VENTANA SE CIERRE SOLO LA VENTANA Y NO TODO EL PROGRAMA
        setIconImage(getIconImage());//SE LE CAMBIA EL ICONO A LA VENTANA LLAMANDO AL METODO "GETICONIMAGE"
        setTitle("Equitech System");//SE LE DA NOMBRE A LA VENTANA
        mostrarDatos();//LLAMADA AL METODO MOSTRAR DATOS
        setLocationRelativeTo(null);//MANTIENE EL JFRAME EN EL CENTRO DE LA PANTALLA
        this.getContentPane().setBackground(Color.BLACK);//CAMBIA EL COLORE DEL JFRAME
    }

    //METODO PARA EL ICONO DEL JFRAME
    @Override //SOBREECRIBIMOS EL METODO DEL JFRAME
    public Image getIconImage() {//INSTANCIAMOS UN OBJETO DE TIPO IMAGE QUE SE LLAME RETVALUE
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/ET.jpeg"));//ENTRE LOS PARENTESIS SE BUSCA LA RUTA DE LA IMAGEN QUE VA A SER EL NUEVO ICONO
        return retValue;//CUANDO SE UTILIZA EL METODO "GETSYSTEMRESOURCE" NO SE NECESITA PONER TODA LA URL DONDE SE ENCUENTRA LA IMAGEN, CUANDO SE UTILIZA SOLO SE PONE EL PAQUETE Y EL ARCHIVO QUE VAMOS A CARCAR
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        atras2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Fecha = new javax.swing.JTextField();
        IDServicio = new javax.swing.JTextField();
        IDservicio = new javax.swing.JTextField();
        IDCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AltaB = new javax.swing.JButton();
        CambiosB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ServicioB = new javax.swing.JButton();
        ClienteB = new javax.swing.JButton();
        ConsultaB = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras2.setBackground(new java.awt.Color(51, 51, 51));
        atras2.setForeground(new java.awt.Color(51, 51, 51));
        atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras2ActionPerformed(evt);
            }
        });

        Tabla.setBackground(new java.awt.Color(126, 185, 219));
        Tabla.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID servicio agendado.");

        AltaB.setBackground(new java.awt.Color(102, 0, 0));
        AltaB.setForeground(new java.awt.Color(255, 255, 255));
        AltaB.setText("Alta.");
        AltaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaBActionPerformed(evt);
            }
        });

        CambiosB.setBackground(new java.awt.Color(102, 0, 0));
        CambiosB.setForeground(new java.awt.Color(255, 255, 255));
        CambiosB.setText("Cambios.");
        CambiosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiosBActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID del cliente.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID del servicio.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha.");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agendar Servicios.");

        ServicioB.setBackground(new java.awt.Color(102, 0, 0));
        ServicioB.setForeground(new java.awt.Color(255, 255, 255));
        ServicioB.setText("Servicio.");
        ServicioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioBActionPerformed(evt);
            }
        });

        ClienteB.setBackground(new java.awt.Color(102, 0, 0));
        ClienteB.setForeground(new java.awt.Color(255, 255, 255));
        ClienteB.setText("Cliente.");
        ClienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteBActionPerformed(evt);
            }
        });

        ConsultaB.setBackground(new java.awt.Color(102, 0, 0));
        ConsultaB.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaB.setText("Busqueda.");
        ConsultaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(224, 224, 224)
                        .addComponent(atras2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(IDservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CambiosB)
                            .addComponent(ConsultaB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(IDServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClienteB)
                    .addComponent(ServicioB)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(AltaB)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atras2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AltaB)
                                .addGap(18, 18, 18)
                                .addComponent(ClienteB)
                                .addGap(18, 18, 18)
                                .addComponent(ServicioB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(CambiosB)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultaB)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(IDservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras2ActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS

    }//GEN-LAST:event_atras2ActionPerformed

    private void CambiosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiosBActionPerformed
        metodoCambios();
        mostrarDatos();
    }//GEN-LAST:event_CambiosBActionPerformed

    private void AltaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaBActionPerformed
        metodoAlta();
        mostrarDatos();
    }//GEN-LAST:event_AltaBActionPerformed

    private void ClienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteBActionPerformed
        BCCliente BCClien = new BCCliente();
        BCClien.setVisible(true);
    }//GEN-LAST:event_ClienteBActionPerformed

    private void ServicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioBActionPerformed
        BCServicio BCServ = new BCServicio();
        BCServ.setVisible(true);
    }//GEN-LAST:event_ServicioBActionPerformed

    private void ConsultaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBActionPerformed
        metodoConsulta();
    }//GEN-LAST:event_ConsultaBActionPerformed

 public void mostrarDatos() {
        String[] titulos = {"ID Servicio Dado", "ID Cliente", "ID Servicio", "Fecha"};

        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from ClienteServicio";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_CS");
                registros[1] = rs.getString("ID_clienteCS");
                registros[2] = rs.getString("ID_ServicioCS");
                registros[3] = rs.getString("FechaCS");
                modelo.addRow(registros);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR DATOS" + e.getMessage());

        }
    }
    
 public void metodoAlta() {
        try {
            //SE LLAMA AL PROCEDIMIENTO ALMACENADO
            CallableStatement insert = (CallableStatement) con.prepareCall("{Call Alta_ClienteServicio(?, ?, ?)}");
            insert.setString(1, IDCliente.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, IDServicio.getText());
            insert.setString(3, Fecha.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS
        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo agendar el servicio " + e);

        }
    }

    public void metodoCambios() {
        try {
            //SE LLAMA AL PROCEDIMIENTO ALMACENADO
            CallableStatement insert = (CallableStatement) con.prepareCall("{call Cambios_ClienteServicio(?, ?, ?, ?)}");
            insert.setString(1, IDservicio.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, IDCliente.getText());
            insert.setString(3, IDServicio.getText());
            insert.setString(4, Fecha.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo modificar el servicio agendado " + e);

        }
    }
 
 public void metodoConsulta() {
        String[] titulos = {"ID Servicio Dado", "ID Cliente", "ID Servicio", "Fecha"};

        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String sql = "";
        if (IDCliente.getText().equals("")) {
             sql = "select * from ClienteServicio";
        }else{
          sql = "select * from ClienteServicio where ID_clienteCS =" + IDCliente.getText();   
        }

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_CS");
                registros[1] = rs.getString("ID_clienteCS");
                registros[2] = rs.getString("ID_ServicioCS");
                registros[3] = rs.getString("FechaCS");
                modelo.addRow(registros);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR DATOS" + e.getMessage());

        }
    }
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaB;
    private javax.swing.JButton CambiosB;
    private javax.swing.JButton ClienteB;
    private javax.swing.JButton ConsultaB;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField IDCliente;
    private javax.swing.JTextField IDServicio;
    private javax.swing.JTextField IDservicio;
    private javax.swing.JButton ServicioB;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton atras2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
