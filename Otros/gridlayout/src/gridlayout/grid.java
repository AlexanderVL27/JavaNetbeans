/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayout;

import java.awt.GridLayout;
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
      public class grid extends JFrame implements ActionListener {
        private JTextField a,b,c,x1,x2,x3,x4;
        private JButton solu,l;
        private JLabel t,i,t2,i2;
        
        public grid(){
            super("Ecuaciones");
            setLayout(new GridLayout(3,6));
            
            t=new JLabel("a");
            add(t);
            a=new JTextField(5);            
            add(a);
            t=new JLabel("b");            
            add(t);
            b=new JTextField(5);            
            add(b);
            t=new JLabel("c");            
            add(t);
            c=new JTextField(5);            
            add(c);
            
            
            solu=new JButton("Solucion");           
            solu.addActionListener(this);
            add(solu);
            l=new JButton("Limpiar campos");
            l.addActionListener(this);            
            add(l);
            
            
            t=new JLabel("X1");            
            add(t);
            x1=new JTextField(10);            
            add(x1);
            t=new JLabel("X2");           
            add(t);
            x2=new JTextField(10);           
            add(x2);
            i=new JLabel("i");            
            i.setVisible(false);
            add(i);
                   
            t2=new JLabel("X1");
            t2.setVisible(false);            
            add(t2);
            x3=new JTextField(10);
            x3.setVisible(false);            
            add(x3);
            t=new JLabel("X2");            
            t.setVisible(false);
            add(t);
            x4=new JTextField(10);
            x4.setVisible(false);           
            add(x4);
            i2=new JLabel("i");            
            add(i2);
            i2.setVisible(false);
            
        }
        
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==solu) {calcular cal = new calcular(a,b,c,x1,x2,x3,x4,t,i,t2,i2);
        cal.cal();}
        else if(e.getSource()==l){calcular l = new calcular(a,b,c,x1,x2,x3,x4,t,i,t2,i2);
        l.limpiar();}
        }
}
