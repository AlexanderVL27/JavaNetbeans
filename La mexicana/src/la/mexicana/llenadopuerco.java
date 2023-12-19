/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.mexicana;

import clases.listapuerco;
import clases.puerco;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static la.mexicana.llenado.fechaActual;

/**
 *
 * @author villa_xaz9a7o
 */
public class llenadopuerco extends javax.swing.JFrame {

    /**
     * Creates new form llenadopuerco
     */
    public llenadopuerco() {
        initComponents();
        this.setExtendedState(6);
        cargarcombonombre(combonom);
        txt_fecha.setText(fechaActual());
        logo2.setIcon(seticon("/imagenes/logo2.jpg",logo2));
    }
public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        return formato.format(fecha);
    }

    public Icon seticon(String url, JLabel boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_inicio = new javax.swing.JTextField();
        txt_entro = new javax.swing.JTextField();
        txt_merma = new javax.swing.JTextField();
        txt_venta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_disponible = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        combonom = new javax.swing.JComboBox<>();
        logo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(214,0,0));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel1.setText("Producto");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel2.setText("Precio");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setText("Entrada de mercancia Pollo:");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel4.setText("Inicio");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel5.setText("Entro");

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel6.setText("Merma");

        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel7.setText("Ventas");

        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel8.setText("Disponible");

        txt_id.setEditable(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        txt_precio.setEditable(false);
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        txt_inicio.setEditable(false);
        txt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inicioActionPerformed(evt);
            }
        });
        txt_inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inicioKeyTyped(evt);
            }
        });

        txt_entro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_entroActionPerformed(evt);
            }
        });
        txt_entro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_entroKeyTyped(evt);
            }
        });

        txt_merma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mermaActionPerformed(evt);
            }
        });
        txt_merma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mermaKeyTyped(evt);
            }
        });

        txt_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ventaActionPerformed(evt);
            }
        });
        txt_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ventaKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_disponible.setEditable(false);
        txt_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_disponibleActionPerformed(evt);
            }
        });
        txt_disponible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_disponibleKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel9.setText("Id Producto");
        jLabel9.setToolTipText("");

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setText("Generar reporte");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_fecha.setText("AA/MM/DD");
        txt_fecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_fecha.setEnabled(false);
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel10.setText("Fecha del dia:");

        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jButton4.setText("Cerrar sesion");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        combonom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combonom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combonomMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combonomMousePressed(evt);
            }
        });
        combonom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combonomActionPerformed(evt);
            }
        });

        logo2.setBackground(new java.awt.Color(144, 128, 128));
        logo2.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combonom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_entro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_merma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)))))
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_entro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_merma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combonom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed

    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inicioActionPerformed

    private void txt_inicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inicioKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_inicioKeyTyped

    private void txt_entroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_entroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entroActionPerformed

    private void txt_entroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_entroKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_entroKeyTyped

    private void txt_mermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mermaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mermaActionPerformed

    private void txt_mermaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mermaKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_mermaKeyTyped

    private void txt_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ventaActionPerformed

    private void txt_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ventaKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_ventaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (!"".equals(txt_id.getText())) {
            PreparedStatement ps = null;
            String id ="",entro="",merma="",ventas="";
            try{
                LaMexicana objCon = new LaMexicana();
                Connection conn = objCon.getConexion();
                id = txt_id.getText();
                entro = txt_entro.getText();
                merma = txt_merma.getText();
                ventas = txt_venta.getText();

                String sql = "CALL edit_puerco("+id+",'"+entro+"',"+merma+",'"+ventas+"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Informacion agregada correctamente");
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al ingresar la informacion del usuario");
                System.out.println(ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error al ingresar la informacion del usuario");
        }
        txt_merma.setText("");
        txt_entro.setText("");
        txt_venta.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_disponibleActionPerformed

    private void txt_disponibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_disponibleKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')&&(c<'.'||c>'.'))evt.consume();
    }//GEN-LAST:event_txt_disponibleKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document doc = new Document();

        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Downloads/Reporte_Puerco.pdf"));
            doc.open();

            PdfPTable tabla = new PdfPTable(10); 
            tabla.addCell("ID");
            tabla.addCell("PRODUCTO");
            tabla.addCell("PRECIO");
            tabla.addCell("INICIO");
            tabla.addCell("ENTRO CARNE");
            tabla.addCell("MERMA");
            tabla.addCell("VENTA");
            tabla.addCell("DISPONIBLE");
            tabla.addCell("VENTAS TOTAL");
            tabla.addCell("FECHA");
           
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:/Lamexicana","root","alexander50");
                PreparedStatement pat = con.prepareStatement("select * from puerco;");
                ResultSet re = pat.executeQuery();

                if (re.next()) {

                    do{
                        tabla.addCell(re.getString(1));
                        tabla.addCell(re.getString(2));
                        tabla.addCell(re.getString(3));
                        tabla.addCell(re.getString(4));
                        tabla.addCell(re.getString(5));
                        tabla.addCell(re.getString(6));
                        tabla.addCell(re.getString(7));
                        tabla.addCell(re.getString(8));
                        tabla.addCell(re.getString(9));
                        tabla.addCell(re.getString(10));
                    }while(re.next());
                    doc.add(tabla);

                }
            } catch (SQLException ex) {
                System.err.print(ex);
            }catch (ClassNotFoundException e){
                Logger.getLogger(LaMexicana.class.getName()).log(Level.SEVERE,null,e);
            }
            doc.close();
            JOptionPane.showMessageDialog(null,"Reporte creado");
        }catch(DocumentException | HeadlessException | FileNotFoundException e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        dispose();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        dispose();
        Panel1 panelp = new Panel1();
        panelp.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combonomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combonomActionPerformed
        LaMexicana objcon = new LaMexicana();
            Connection conn = objcon.getConexion();
            
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = conn.prepareStatement("Select * FROM puerco where nombre = ? ");
            ps.setString(1, (String) combonom.getSelectedItem());
            rs = ps.executeQuery();
            if (rs.next()) {
                txt_id.setText(rs.getString("dni"));
                txt_precio.setText(rs.getString("precio"));
                txt_merma.setText("");
                txt_entro.setText("");
                txt_venta.setText("");
                txt_inicio.setText(rs.getString("stock"));
                txt_disponible.setText(rs.getString("result"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(llenadopuerco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combonomActionPerformed

    private void combonomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combonomMouseClicked

    }//GEN-LAST:event_combonomMouseClicked

    private void combonomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combonomMousePressed
        
    }//GEN-LAST:event_combonomMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(llenadopuerco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(llenadopuerco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(llenadopuerco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(llenadopuerco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new llenadopuerco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combonom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo2;
    private javax.swing.JTextField txt_disponible;
    private javax.swing.JTextField txt_entro;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_inicio;
    private javax.swing.JTextField txt_merma;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_venta;
    // End of variables declaration//GEN-END:variables

            class Imagenfondo2 extends JPanel{
        private Image img;
        public void paint(Graphics g){
            img = new ImageIcon(getClass().getResource("fondo11.jpg")).getImage();
            g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
        private void cargarcombonombre(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
        listapuerco listadoc = new listapuerco();
        LaMexicana objcon = new LaMexicana();
        Connection conn = objcon.getConexion();
        try{
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "";
            sql ="CALL consultadnipuerco()";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                puerco puerco = new puerco();
                puerco.setNombre(rs.getString(1));
                listadoc.agregar(puerco);
                combo.addElement(puerco.getNombre());
            }
        }catch(Exception e){
            System.out.println("Error, no se puede mostrar"+e);
        }
    }            
}