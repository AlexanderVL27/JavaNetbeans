
package Equitech;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AMProductos extends javax.swing.JFrame {
    Conexion cc = new Conexion(); //CREACION DE UN OBJETO DE LA CLASE CONEXION
    Connection con = cc.getConexion();//CREACION DE UNA VARIABLE DE TIPO CONNECTION

    public AMProductos() {
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
        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JTextField();
        CostoProducto = new javax.swing.JTextField();
        CategoriaProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AltaB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IDProducto = new javax.swing.JTextField();

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

        atras.setBackground(new java.awt.Color(51, 51, 51));
        atras.setForeground(new java.awt.Color(51, 51, 51));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta/Cambio de producto.");

        NombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProductoActionPerformed(evt);
            }
        });

        CostoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoProductoActionPerformed(evt);
            }
        });

        CategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaProductoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del producto.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo del producto.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoria del producto.");

        AltaB.setBackground(new java.awt.Color(102, 0, 0));
        AltaB.setForeground(new java.awt.Color(255, 255, 255));
        AltaB.setText("Alta.");
        AltaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaBActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cambios.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID del producto.");

        IDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(12, 12, 12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(AltaB)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(AltaB))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        
    }//GEN-LAST:event_atrasActionPerformed

    private void NombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProductoActionPerformed

    private void CostoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoProductoActionPerformed

    private void CategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaProductoActionPerformed

    private void IDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDProductoActionPerformed

    private void AltaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaBActionPerformed
        metodoAlta();//LLAMADA AL METODOALTA
        mostrarDatos();//LLAMADA AL METODO MOSTRAR DATOS
    }//GEN-LAST:event_AltaBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        metodoCambios();//LLAMADA AL METODOCAMBIOS
        mostrarDatos();//LLAMADA AL METODO MOSTRAR DATOS
    }//GEN-LAST:event_jButton1ActionPerformed

    public void mostrarDatos() {
        String[] titulos = {"IDproducto", "Nombre", "Costo", "Categoria"};

        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from Productos";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ID_producto");
                registros[1] = rs.getString("Nombre_producto");
                registros[2] = rs.getString("Costo_producto");
                registros[3] = rs.getString("Categoria");
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
            CallableStatement insert = (CallableStatement) con.prepareCall("{Call Alta_Productos(?, ?, ?)}");          
            insert.setString(1, NombreProducto.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, CostoProducto.getText());
            insert.setString(3, CategoriaProducto.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar el producto " + e);

        }
    }

    public void metodoCambios() {
        try {
            //SE LLAMA AL PROCEDIMIENTO ALMACENADO
            CallableStatement insert = (CallableStatement) con.prepareCall("{call Cambios_Productos(?, ?, ?, ?)}");
            insert.setString(1, IDProducto.getText());//SE INGRESAN LOS PARAMETROS QUE EL USUARIO INGRESÓ AL PROCEDIMIENTO
            insert.setString(2, NombreProducto.getText());
            insert.setString(3, CostoProducto.getText());
            insert.setString(4, CategoriaProducto.getText());
            insert.execute();//EJECUTA EL PROCEDIMIENTO ALMACENADO QUE LLAMAMOS

        } catch (Exception e) {//EN CASO DE QUE HAYA UN ERROR SE MANDA UN MENSAJE
            JOptionPane.showMessageDialog(null, "Error, no se pudo modificar al producto " + e);

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
            java.util.logging.Logger.getLogger(AMProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AMProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AMProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AMProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AMProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaB;
    private javax.swing.JTextField CategoriaProducto;
    private javax.swing.JTextField CostoProducto;
    private javax.swing.JTextField IDProducto;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
