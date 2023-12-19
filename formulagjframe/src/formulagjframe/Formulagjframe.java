
package formulagjframe;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Formulagjframe extends JFrame implements ActionListener {

    private JTextField a,b,c,x1,x2,x3,x4;
    private JButton solu,l;
    private JLabel t,i,t2,i2;
    
    public Formulagjframe(){
        super("Ecuaciones cuadraticas");
        this.setIconImage(new ImageIcon(getClass().getResource("charmander.png")).getImage());
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p.setPreferredSize(new Dimension(350,30));
        p.setBackground(Color.CYAN);
        
        t=new JLabel("a");
        p.add(t);
        a=new JTextField(5);
        p.add(a);
        t=new JLabel("b");
        p.add(t);
        b=new JTextField(5);
        p.add(b);
        t=new JLabel("c");
        p.add(t);
        c=new JTextField(5);
        p.add(c);
        add(p);
        
        p1.setPreferredSize(new Dimension(350,40));
        p1.setBackground(Color.CYAN);
        solu=new JButton("Solucion");
        solu.addActionListener(this);
        p1.add(solu);
        add(p1);
        
        p2.setPreferredSize(new Dimension(300,65));
        p2.setBackground(Color.CYAN);
        t=new JLabel("X1");
        p2.add(t);
        x1=new JTextField(10);
        
        p2.add(x1);
        
        t=new JLabel("X2");
        p2.add(t);
        x2=new JTextField(10);
        
        p2.add(x2);
        
        i=new JLabel("i");
        p2.add(i);
        i.setVisible(false);
        
        t2=new JLabel("X1");
        t2.setVisible(false);
        p2.add(t2);
        x3=new JTextField(10);
        x3.setVisible(false);
        p2.add(x3);
        
        t=new JLabel("X2");
        t.setVisible(false);
        p2.add(t);
        x4=new JTextField(10);
        x4.setVisible(false);
        p2.add(x4);
        i2=new JLabel("i");
        p2.add(i2);
        i2.setVisible(false);
        add(p2);
        
        p3.setPreferredSize(new Dimension(350,40));
        p3.setBackground(Color.CYAN);
        l=new JButton("Limpiar campos");
        l.addActionListener(this);
        p3.add(l);
        add(p3);
    } 
     public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==solu) {
                     if (validar(a.getText())==true&&validar(b.getText())==true&&validar(c.getText())==true) {
                         String w=a.getText();
                         String s=b.getText();
                         String r=c.getText();
                         double a1=Double.parseDouble(w);
                         double b1=Double.parseDouble(s);
                         double c1=Double.parseDouble(r);
                         if (a1==0) {
                             getToolkit().beep();
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
                         getToolkit().beep();
                         showMessageDialog(null,"Error al introducir algun dato");
                     }
                 }else if(e.getSource()==l){
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
