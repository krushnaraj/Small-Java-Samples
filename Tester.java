import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Tester extends JFrame implements ActionListener
{
 JLabel lbl1,lbl2;
 JComboBox cbo1,cbo2;
 JButton btnright,btnleft;

 
 Tester()
 {
  lbl1=new JLabel("    squad");
  lbl2=new JLabel("    players 11");
  cbo1=new JComboBox();
  cbo2=new JComboBox();
  
  btnright=new JButton(">-->>");
  btnleft=new JButton("<--<<");
  
  Container c=getContentPane();
  c.setLayout(new GridLayout(3,3));
 
  c.add(lbl1);c.add(lbl2);
  c.add(cbo1);c.add(cbo2);
  c.add(btnright);c.add(btnleft);
  cbo1.addItem("DHAWAN");
  
  cbo1.addItem("SHARMA");
  
  cbo1.addItem("KOHLI");
  
  cbo1.addItem("DHONI");
  cbo1.addItem("JADEJA");
  cbo1.addItem("ASHWIN");
  cbo1.addItem("RAINA");

  setSize(500,300);
  setVisible(true);
  show();
  
  btnright.addActionListener(this);
  btnleft.addActionListener(this);

 }
  
 public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==btnright)
   {
    String str=(String)cbo1.getSelectedItem();
    cbo2.addItem(str);
    cbo1.removeItem(str);
   }

   else if(ae.getSource()==btnleft)
   {
                                                        
    String str=(String)cbo2.getSelectedItem();
    cbo1.addItem(str);
    cbo2.removeItem(str);
   }
  
 }  
  
  public static void main(String args[])
 {
   Tester tt=new Tester();
 }
} 