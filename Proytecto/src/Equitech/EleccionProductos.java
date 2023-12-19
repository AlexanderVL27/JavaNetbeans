
package Equitech;

import java.awt.Image;
import java.awt.Toolkit;


public class EleccionProductos extends javax.swing.JFrame {

  
    public EleccionProductos() {
        initComponents();
        this.setResizable(false);//CANCELA EL BOTON DE MAXIMIZAR PANTALLA
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//SIRVE PARA QUE AL CERRAR LA VENTANA SE CIERRE SOLO LA VENTANA Y NO TODO EL PROGRAMA
        setIconImage(getIconImage());//SE LE CAMBIA EL ICONO A LA VENTANA LLAMANDO AL METODO "GETICONIMAGE"
        setTitle("Equitech System");//SE LE DA NOMBRE A LA VENTANA
        setLocationRelativeTo(null);
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

        ABProducto = new javax.swing.JButton();
        BCProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ABProducto.setText("Alta/Cambios.");
        ABProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABProductoActionPerformed(evt);
            }
        });

        BCProducto.setText("Baja/Consultas.");
        BCProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ABProducto)
                .addGap(18, 18, 18)
                .addComponent(BCProducto)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABProducto)
                    .addComponent(BCProducto))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ABProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABProductoActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        AMProductos AMProduc = new AMProductos();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        AMProduc.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_ABProductoActionPerformed

    private void BCProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCProductoActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        BCProductos BCProduc = new BCProductos();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        BCProduc.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_BCProductoActionPerformed


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
            java.util.logging.Logger.getLogger(EleccionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleccionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABProducto;
    private javax.swing.JButton BCProducto;
    // End of variables declaration//GEN-END:variables
}
