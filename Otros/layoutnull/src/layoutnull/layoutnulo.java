
package layoutnull;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author villa
 */
    public class layoutnulo extends JFrame implements ActionListener {
        private JTextField a,b,c,x1,x2,x3,x4;
        private JButton solu,l;
        private JLabel t,i,t2,i2;
        
        public layoutnulo(){
            super("Ecuaciones cuadraticas");
            getContentPane().setLayout(null);
            
            t=new JLabel("a");
            t.setBounds(10,10,100,30);
            t.setVisible(true);
            add(t);
            a=new JTextField(5);
            a.setBounds(50,10,100,30);
            add(a);
            t=new JLabel("b");
            t.setBounds(180,10,100,30);
            add(t);
            b=new JTextField(5);
            b.setBounds(200,10,100,30);
            add(b);
            t=new JLabel("c");
            t.setBounds(320,10,100,30);
            add(t);
            c=new JTextField(5);
            c.setBounds(350,10,100,30);
            add(c);
        
            solu=new JButton("Solucion");
            solu.setBounds(100,70,100,30);
            solu.addActionListener(this);
            add(solu);
            
            t=new JLabel("X1");
            t.setBounds(10,110,100,30);
            add(t);
            x1=new JTextField(10);
            x1.setBounds(50,110,100,30);
            add(x1);
            t=new JLabel("X2");
            t.setBounds(180,110,100,30);
            add(t);
            x2=new JTextField(10);
            x2.setBounds(200,110,100,30);
            add(x2);
            i=new JLabel("i");
            i.setBounds(300,110,100,30);
            i.setVisible(false);
            add(i);
            
        
            t2=new JLabel("X1");
            t2.setBounds(10, 170, 100, 30);
            t2.setVisible(false);
            add(t2);
            x3=new JTextField(10);
            x3.setVisible(false);
            x3.setBounds(50, 170, 100, 30);
            add(x3);
            t=new JLabel("X2");
            t.setVisible(false);
            t.setBounds(180, 170, 100, 30);
            add(t);
            x4=new JTextField(10);
            x4.setVisible(false);
            x4.setBounds(200, 170, 100, 30);
            add(x4);
            i2=new JLabel("i");
            i2.setBounds(300, 170, 100, 30);
            add(i2);
            i2.setVisible(false);
            
            l=new JButton("Limpiar campos");
            l.setBounds(220,70,150,30);
            l.addActionListener(this);
            add(l);
        }
        
        

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==solu) {calcular cal = new calcular(a,b,c,x1,x2,x3,x4,t,i,t2,i2);
        cal.cal();}
        else if(e.getSource()==l){calcular l = new calcular(a,b,c,x1,x2,x3,x4,t,i,t2,i2);
        l.limpiar();}
        }
    }
