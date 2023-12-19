/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication118;
import javax.swing.JOptionPane;

/**
 *
 * @author villa
 */
public class JavaApplication118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,x2,x3;
        String ex= JOptionPane.showInputDialog("Ingresar la expresion");
        
        String a=ex.split(",")[0];
        String b=ex.split(",")[1];
        String c=ex.split(",")[2];
        
        double a1=Double.parseDouble(a);
        double b1=Double.parseDouble(b);
        double c1=Double.parseDouble(c);
        
        
        if ((b1*b1)>=(4*a1*b1)) {
            x1 =((-b1)+Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)))/(2*a1);
            x2 =((-b1)-Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)))/(2*a1);
            JOptionPane.showMessageDialog(null, "El resultado de x1 es: "+x1);
            JOptionPane.showMessageDialog(null, "El resultado de x2 es: "+x2);
        }
        else{
            x1 = (Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)*-1))/(2*a1);
            x2 = -(Math.sqrt(Math.pow(b1, 2)-(4*a1*c1)*-1))/(2*a1);
            
            x3=(-b1)/(2*a1);
            
            JOptionPane.showMessageDialog(null, "El resultado de x1 es: "+x3+" + "+x1+" i");
            JOptionPane.showMessageDialog(null, "El resultado de x2 es: "+x3+" "+x2+" i");
        }
    }
    
}
