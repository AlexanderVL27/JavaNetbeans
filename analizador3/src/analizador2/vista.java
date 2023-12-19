/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java_cup.runtime.Symbol;


public class vista extends javax.swing.JFrame {

    TablaSimbolos ts;

    public vista() {
        initComponents();
        setLocationRelativeTo(null);
        ts= new TablaSimbolos();
        setTitle("Analizador Alexandervl");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaLexico = new javax.swing.JTextArea();
        botonAnalizarL = new javax.swing.JButton();
        botonLimpiarL = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonLimpiarS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaSintactico = new javax.swing.JTextArea();
        botonAnalizarS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SkelPrototype");
        setBackground(new java.awt.Color(255, 255, 255));

        panelPrincipal.setBackground(new java.awt.Color(0, 255, 246));
        panelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        areaCodigo.setColumns(20);
        areaCodigo.setLineWrap(true);
        areaCodigo.setRows(5);
        jScrollPane1.setViewportView(areaCodigo);

        jLabel1.setBackground(new java.awt.Color(0, 20, 255));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 20, 255));
        jLabel1.setText("Código");

        areaLexico.setEditable(false);
        areaLexico.setColumns(20);
        areaLexico.setRows(5);
        jScrollPane4.setViewportView(areaLexico);

        botonAnalizarL.setBackground(new java.awt.Color(0, 231, 255));
        botonAnalizarL.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        botonAnalizarL.setText("Analizar");
        botonAnalizarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarLActionPerformed(evt);
            }
        });

        botonLimpiarL.setBackground(new java.awt.Color(0, 231, 255));
        botonLimpiarL.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        botonLimpiarL.setText("Limpiar");
        botonLimpiarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarLActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 20, 255));
        jLabel4.setText("Léxico");

        botonLimpiarS.setBackground(new java.awt.Color(0, 231, 255));
        botonLimpiarS.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        botonLimpiarS.setText("Limpiar");
        botonLimpiarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarSActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 20, 255));
        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 20, 255));
        jLabel3.setText("Sintáctico");

        areaSintactico.setEditable(false);
        areaSintactico.setColumns(20);
        areaSintactico.setRows(5);
        jScrollPane3.setViewportView(areaSintactico);

        botonAnalizarS.setBackground(new java.awt.Color(0, 231, 255));
        botonAnalizarS.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        botonAnalizarS.setText("Analizar");
        botonAnalizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(botonAnalizarS)
                            .addGap(18, 18, 18)
                            .addComponent(botonLimpiarS)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel3)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(438, 438, 438)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAnalizarL)
                            .addComponent(botonLimpiarL))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(botonAnalizarL)
                                .addGap(78, 78, 78)
                                .addComponent(botonLimpiarL))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)))
                        .addGap(67, 67, 67)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAnalizarS)
                            .addComponent(botonLimpiarS)
                            .addComponent(jLabel3)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonLimpiarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarLActionPerformed
        areaLexico.setText("");
    }//GEN-LAST:event_botonLimpiarLActionPerformed

    private void botonAnalizarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarLActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(areaCodigo.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexico lexer = new Lexico(lector);
            String resultado = "";
            while (true) {
                MyTokens tokens = lexer.yylex();
                if (tokens == null) {
                    areaLexico.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no encontrado\n";
                        break;
                    case Identificador: case Numero: case Clase: case NumeroDecimal: case Texto:
                    case Import: case MetodoVacio: case MetodoRetorno: case Retorno:
                        resultado += lexer.lexeme + " : Pertenece a " + tokens + "\n";
                        break;
                    default:
                        resultado += lexer.yytext() + " : Simbolo de " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            System.out.println("Error de entrada");
        }
    }//GEN-LAST:event_botonAnalizarLActionPerformed

    private void botonAnalizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarSActionPerformed
        String codigo = areaCodigo.getText();
       Sintaxis s = new Sintaxis(new analizador2.LexicoCup(new StringReader(codigo)));
       
       try{
           s.parse();
           areaSintactico.setText("Sintaxis Correcta");
            
           
       }catch (Exception ex){
           Symbol sym = s.getS();
           areaSintactico.setText("Error de sintaxis: Linea "+(sym.right + 1));
       }
    }//GEN-LAST:event_botonAnalizarSActionPerformed

    private void botonLimpiarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarSActionPerformed
        areaSintactico.setText("");
    }//GEN-LAST:event_botonLimpiarSActionPerformed

    

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaLexico;
    private javax.swing.JTextArea areaSintactico;
    private javax.swing.JButton botonAnalizarL;
    private javax.swing.JButton botonAnalizarS;
    private javax.swing.JButton botonLimpiarL;
    private javax.swing.JButton botonLimpiarS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
