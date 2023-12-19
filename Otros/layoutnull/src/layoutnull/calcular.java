/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutnull;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 *
 * @author villa
 */
public class calcular {
    
    private JTextField a,b,c,x1,x2,x3,x4;
    private JLabel t,i,t2,i2;

    public calcular(JTextField a, JTextField b, JTextField c, JTextField x1, JTextField x2, JTextField x3, JTextField x4, JLabel t, JLabel i, JLabel t2, JLabel i2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.t = t;
        this.i = i;
        this.t2 = t2;
        this.i2 = i2;
    }
    
    public void cal(){
         if (validar(a.getText())==true&&validar(b.getText())==true&&validar(c.getText())==true) {
                         String w=a.getText();
                         String s=b.getText();
                         String r=c.getText();
                         double a1=Double.parseDouble(w);
                         double b1=Double.parseDouble(s);
                         double c1=Double.parseDouble(r);
                         if (a1==0) {
                             Toolkit.getDefaultToolkit().beep();
                             showMessageDialog(null,"No se puede dividir entre 0");
                             
                         }
                         else if ((b1*b1)>=(4*a1*b1)) {
                             double f1 =((-b1)+Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)))/(2*a1);
                             double f2 =((-b1)-Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)))/(2*a1);
                             String r1 = String.valueOf(f1);
                             String r2 = String.valueOf(f2);  
                             x1.setText(r1);
                             x2.setText(r2);
                         }
                         else{
                             DecimalFormat df = new DecimalFormat("#.####");
                             double fi = (Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)*-1))/(2*a1);
                             double fi2 = -(Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)*-1))/(2*a1);
                             double fi3 =(-b1)/(2*a1);
                         
                             String p1=String.valueOf(df.format(fi));
                             String p2=String.valueOf(df.format(fi2));
                             String pi=String.valueOf(df.format(fi3));
                         
                             x1.setVisible(true);
                             x2.setVisible(true);
                             x3.setVisible(true);
                             x4.setVisible(true);
                             t.setVisible(true);
                             t2.setVisible(true);
                             x1.setText(pi);
                             x2.setText(p1);
                             i.setVisible(true);
                             x3.setText(pi);
                             x4.setText(p2);
                             i2.setVisible(true);
                         }
                     }
                     else{
                         Toolkit.getDefaultToolkit().beep();
                         showMessageDialog(null,"Error al introducir algun dato");
                     }
    }
    
    public void limpiar(){
        a.setText("");
                     b.setText("");
                     c.setText("");
                     x1.setText("");
                     x2.setText("");
                     x3.setText("");
                     x4.setText("");
                     x3.setVisible(false);
                     x4.setVisible(false);
                     t.setVisible(false);
                     t2.setVisible(false);
                     i.setVisible(false);
                     i2.setVisible(false);
                     a.requestFocus();
    }
    
    public boolean validar (String a){
         double num;
         try{
             num=Double.parseDouble(a);
             return true;
         }
         catch(Exception e){
             return false;
         }
     }
}
