
package Equitech;

import java.awt.Image;
import java.awt.Toolkit;


public class EleccionServicio extends javax.swing.JFrame {


    public EleccionServicio() {
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

        ABServicio = new javax.swing.JButton();
        BCServicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ABServicio.setText("Alta/Cambios.");
        ABServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABServicioActionPerformed(evt);
            }
        });

        BCServicio.setText("Baja/Consultas.");
        BCServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ABServicio)
                .addGap(18, 18, 18)
                .addComponent(BCServicio)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABServicio)
                    .addComponent(BCServicio))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ABServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABServicioActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        AMServicio AMServ = new AMServicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        AMServ.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_ABServicioActionPerformed

    private void BCServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCServicioActionPerformed
        this.setVisible(false);//CIERRA LA PESTAÑA AL PRESIONAR EL BOTON ATRAS
        BCServicio BCServ = new BCServicio();//SE CREA EL OBJETO DE LA VENTANA A LA CUAL SE VA A DIRIGIR
        BCServ.setVisible(true);//SE MANDA A LLAMAR AL METODO QUE MANTENDRÁ ABIERTA LA NUEVA PESTAÑA
    }//GEN-LAST:event_BCServicioActionPerformed


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
            java.util.logging.Logger.getLogger(EleccionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleccionServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABServicio;
    private javax.swing.JButton BCServicio;
    // End of variables declaration//GEN-END:variables
}
