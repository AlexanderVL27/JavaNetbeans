
package Equitech;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setResizable(false);//CANCELA EL BOTON DE MAXIMIZAR PANTALLA
        setIconImage(getIconImage());//SE LE CAMBIA EL ICONO A LA VENTANA LLAMANDO AL METODO "GETICONIMAGE"
        setTitle("Equitech System");//SE LE DA NOMBRE A LA VENTANA
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);//CAMBIA EL COLORE DEL JFRAME
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

        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        ClienteB = new javax.swing.JButton();
        ServicioB = new javax.swing.JButton();
        EmpleadoB = new javax.swing.JButton();
        ProveedoresB = new javax.swing.JButton();
        ProductosB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ProductosProveedores = new javax.swing.JButton();

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado1.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú.");

        atras.setBackground(new java.awt.Color(51, 51, 51));
        atras.setForeground(new java.awt.Color(51, 51, 51));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        ClienteB.setBackground(new java.awt.Color(51, 51, 51));
        ClienteB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente1.png"))); // NOI18N
        ClienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteBActionPerformed(evt);
            }
        });

        ServicioB.setBackground(new java.awt.Color(51, 51, 51));
        ServicioB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio1.png"))); // NOI18N
        ServicioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioBActionPerformed(evt);
            }
        });

        EmpleadoB.setBackground(new java.awt.Color(51, 51, 51));
        EmpleadoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado1.png"))); // NOI18N
        EmpleadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoBActionPerformed(evt);
            }
        });

        ProveedoresB.setBackground(new java.awt.Color(51, 51, 51));
        ProveedoresB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor1.png"))); // NOI18N
        ProveedoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresBActionPerformed(evt);
            }
        });

        ProductosB.setBackground(new java.awt.Color(51, 51, 51));
        ProductosB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos1.png"))); // NOI18N
        ProductosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosBActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Servicio.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Productos.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedores.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empleado.");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agendar servicio.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ProductosProveedores.setBackground(new java.awt.Color(51, 51, 51));
        ProductosProveedores.setForeground(new java.awt.Color(255, 255, 255));
        ProductosProveedores.setText("Productos proveedores.");
        ProductosProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosProveedoresActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(292, 292, 292)
                        .addComponent(atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(ClienteB)
                                .addGap(18, 18, 18)
                                .addComponent(ServicioB)
                                .addGap(18, 18, 18)
                                .addComponent(ProductosB)
                                .addGap(18, 18, 18)
                                .addComponent(ProveedoresB)
                                .addGap(18, 18, 18)
                                .addComponent(EmpleadoB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProductosProveedores)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmpleadoB)
                    .addComponent(ServicioB)
                    .addComponent(ClienteB)
                    .addComponent(ProductosB)
                    .addComponent(ProveedoresB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ProductosProveedores))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        Inicio atras = new Inicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        atras.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_atrasActionPerformed

    private void ClienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteBActionPerformed
        EleccionCliente EleCliente = new EleccionCliente();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        EleCliente.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
        
    }//GEN-LAST:event_ClienteBActionPerformed

    private void ServicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioBActionPerformed
        EleccionServicio EleServicio = new EleccionServicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        EleServicio.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_ServicioBActionPerformed

    private void EmpleadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoBActionPerformed
        EleccionEmpleado EleEmpleado = new EleccionEmpleado();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        EleEmpleado.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_EmpleadoBActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ProveedoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresBActionPerformed
        EleccionProveedores EleProveedor = new EleccionProveedores();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        EleProveedor.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_ProveedoresBActionPerformed

    private void ProductosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosBActionPerformed
        EleccionProductos EleProduct = new EleccionProductos();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        EleProduct.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_ProductosBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgendarServicio Agen = new AgendarServicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        Agen.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProductosProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosProveedoresActionPerformed
        ProductosProveedores PP = new ProductosProveedores();
        PP.setVisible(true);
    }//GEN-LAST:event_ProductosProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClienteB;
    private javax.swing.JButton EmpleadoB;
    private javax.swing.JButton ProductosB;
    private javax.swing.JButton ProductosProveedores;
    private javax.swing.JButton ProveedoresB;
    private javax.swing.JButton ServicioB;
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
