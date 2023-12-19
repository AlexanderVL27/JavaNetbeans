
package Equitech;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AMProveedor extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection con = cc.getConexion();
    
    public AMProveedor() {
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

        atras = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        atras1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TelefonoProveedor = new javax.swing.JTextField();
        NombreProveedor = new javax.swing.JTextField();
        ApellidosProveedor = new javax.swing.JTextField();
        DireccionProveedor = new javax.swing.JTextField();
        CorreoProveedor = new javax.swing.JTextField();
        AltaB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CambiosB = new javax.swing.JButton();
        EmpresaProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        atras.setBackground(new java.awt.Color(51, 51, 51));
        atras.setForeground(new java.awt.Color(51, 51, 51));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras1.setBackground(new java.awt.Color(51, 51, 51));
        atras1.setForeground(new java.awt.Color(51, 51, 51));
        atras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras1ActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta/Cambios de proveedores.");

        AltaB.setBackground(new java.awt.Color(102, 0, 0));
        AltaB.setForeground(new java.awt.Color(255, 255, 255));
        AltaB.setText("Alta.");
        AltaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaBActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del proveedor.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos del proveedor.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID del proveedor.");

        CambiosB.setBackground(new java.awt.Color(102, 0, 0));
        CambiosB.setForeground(new java.awt.Color(255, 255, 255));
        CambiosB.setText("Cambios.");
        CambiosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiosBActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Empresa del proveedor.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)
                        .addComponent(atras1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmpresaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ApellidosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(NombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AltaB)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(CambiosB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmpresaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(AltaB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CambiosB)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(IDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        Inicio atras = new Inicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        atras.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_atrasActionPerformed

    private void atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras1ActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
       
    }//GEN-LAST:event_atras1ActionPerformed

    private void CambiosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiosBActionPerformed
        metodoCambios();//LLAMADA AL METODOCAMBIOS
        mostrarDatos();//LLAMADA AL METODO MOSTRARDATOS
    }//GEN-LAST:event_CambiosBActionPerformed

    private void AltaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaBActionPerformed
        metodoAlta();//LLAMADA AL METODO ALTA
        mostrarDatos();//LLAMADA AL METODO MOSTRARDATOS
    }//GEN-LAST:event_AltaBActionPerformed

    public void mostrarDatos() {
        String[] titulos = {"IDproveedor", "Nombre", "Apellidos", "Empresa", "Direccion",  "Correo", "Telefono"};

        String[] registros = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from Proveedores";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_proveedor");
                registros[1] = rs.getString("Nombre_proveedor");
                registros[2] = rs.getString("Apellidos_proveedor");
                registros[3] = rs.getString("Empresa_proveedor");
                registros[4] = rs.getString("Direccion_proveedor");
                registros[5] = rs.getString("Correo_proveedor");
                registros[6] = rs.getString("Telefono_proveedor");
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
            CallableStatement insert = (CallableStatement) con.prepareCall("{Call Alta_Proveedores(?, ?, ?, ?, ?, ?)}");
            insert.setString(1, NombreProveedor.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, ApellidosProveedor.getText());
            insert.setString(3, EmpresaProveedor.getText());
            insert.setString(4, DireccionProveedor.getText());
            insert.setString(5, CorreoProveedor.getText());
            insert.setString(6, TelefonoProveedor.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar el proveedor " + e);

        }
    }

    public void metodoCambios() {
        try {
            //SE LLAMA AL PROCEDIMIENTO ALMACENADO
            CallableStatement insert = (CallableStatement) con.prepareCall("{call Cambios_Proveedores(?, ?, ?, ?, ?, ?, ?)}");
            insert.setString(1, IDProveedor.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, NombreProveedor.getText());
            insert.setString(3, ApellidosProveedor.getText());
            insert.setString(4, EmpresaProveedor.getText());
            insert.setString(5, DireccionProveedor.getText());
            insert.setString(6, CorreoProveedor.getText());
            insert.setString(7, TelefonoProveedor.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo modificar al proveedor " + e);

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
            java.util.logging.Logger.getLogger(AMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AMProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaB;
    private javax.swing.JTextField ApellidosProveedor;
    private javax.swing.JButton CambiosB;
    private javax.swing.JTextField CorreoProveedor;
    private javax.swing.JTextField DireccionProveedor;
    private javax.swing.JTextField EmpresaProveedor;
    private javax.swing.JTextField IDProveedor;
    private javax.swing.JTextField NombreProveedor;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TelefonoProveedor;
    private javax.swing.JButton atras;
    private javax.swing.JButton atras1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
