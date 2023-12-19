
package Equitech;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BCCliente extends javax.swing.JFrame {
    Conexion cc = new Conexion(); //CREACION DE UN OBJETO DE LA CLASE CONEXION
    Connection con = cc.getConexion();//CREACION DE UNA VARIABLE DE TIPO CONNECTION
 
    public BCCliente() {
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
    public Image getIconImage(){//INSTANCIAMOS UN OBJETO DE TIPO IMAGE QUE SE LLAME RETVALUE
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/ET.jpeg"));//ENTRE LOS PARENTESIS SE BUSCA LA RUTA DE LA IMAGEN QUE VA A SER EL NUEVO ICONO
        return retValue;//CUANDO SE UTILIZA EL METODO "GETSYSTEMRESOURCE" NO SE NECESITA PONER TODA LA URL DONDE SE ENCUENTRA LA IMAGEN, CUANDO SE UTILIZA SOLO SE PONE EL PAQUETE Y EL ARCHIVO QUE VAMOS A CARCAR
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IDCliente = new javax.swing.JTextField();
        BajaB = new javax.swing.JButton();
        ConsultaB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Baja/Consulta del cliente.");

        atras.setBackground(new java.awt.Color(51, 51, 51));
        atras.setForeground(new java.awt.Color(51, 51, 51));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID del Cliente.");

        IDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClienteActionPerformed(evt);
            }
        });

        BajaB.setBackground(new java.awt.Color(102, 0, 0));
        BajaB.setForeground(new java.awt.Color(255, 255, 255));
        BajaB.setText("Baja.");
        BajaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaBActionPerformed(evt);
            }
        });

        ConsultaB.setBackground(new java.awt.Color(102, 0, 0));
        ConsultaB.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaB.setText("Consulta.");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(286, 286, 286)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atras)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(BajaB)
                        .addGap(82, 82, 82)
                        .addComponent(ConsultaB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BajaB)
                    .addComponent(ConsultaB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClienteActionPerformed

    private void BajaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaBActionPerformed
        metodoBaja();
        mostrarDatos();
    }//GEN-LAST:event_BajaBActionPerformed

    private void ConsultaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBActionPerformed
        metodoConsulta();
    }//GEN-LAST:event_ConsultaBActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        
    }//GEN-LAST:event_atrasActionPerformed
    
    public void mostrarDatos() {
        String[] titulos = {"IDcliente", "Nombre", "Apellidos", "Direccion", "Telefono", "Correo"};

        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
            String sql = "select * from cliente";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_cliente");
                registros[1] = rs.getString("Nombre_cliente");
                registros[2] = rs.getString("Apellidos_cliente");
                registros[3] = rs.getString("Direccion_Cliente");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Correo");
                modelo.addRow(registros);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR DATOS" + e.getMessage());

        }
    }

        public void metodoBaja() {
        try {
            //SE LLAMA AL PROCEDIMIENTO ALMACENADO
            CallableStatement insert = (CallableStatement) con.prepareCall("{call Baja_Cliente(?)}");
            insert.setString(1, IDCliente.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo dar de baja al cliente " + e);

        }
    }
        
        public void metodoConsulta() {
        String[] titulos = {"IDcliente", "Nombre", "Apellidos", "Direccion", "Telefono", "Correo"};

        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String sql = "";
        if (IDCliente.getText().equals("")) {
             sql = "select * from cliente";
        }else{
          sql = "select * from cliente where ID_Cliente =" + IDCliente.getText();   
        }

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_cliente");
                registros[1] = rs.getString("Nombre_cliente");
                registros[2] = rs.getString("Apellidos_cliente");
                registros[3] = rs.getString("Direccion_Cliente");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Correo");
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
            java.util.logging.Logger.getLogger(BCCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BCCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BCCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BCCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BCCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BajaB;
    private javax.swing.JButton ConsultaB;
    private javax.swing.JTextField IDCliente;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
