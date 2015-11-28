import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Res extends JFrame implements ActionListener
{
  JLabel lbltype,lblfac,lblno,lblcharge;
  JTextField txtno,txtcharge;
  JRadioButton rbac,rbnonac;
  JCheckBox chklun,chkdin,chktea;
  JButton btncal,btnclr;

  Res()
 {
   txtno=new JTextField(10);
   txtcharge=new JTextField(10);
   lbltype=new JLabel("TYPE OF ROOM");
   lblfac=new JLabel("FACIOLITIES");
   lblno=new JLabel("NO OF ROOMS");
   lblcharge=new JLabel("TOTAL CHARGE");
   btncal=new JButton ("calculate");
   btnclr=new JButton("clear");
   rbac=new JRadioButton("A/C");
   rbnonac=new JRadioButton("non A/C");
   chklun=new JCheckBox("LUNCH");
   chkdin=new JCheckBox("DINNER");
   chktea=new JCheckBox("TEA");
   JPanel p1=new JPanel();
   JPanel p2=new JPanel();
   p1.add(rbac);
   p1.add(rbnonac);
   p2.add(chklun);
   p2.add(chkdin);
   p2.add(chktea);
   
   Container c=getContentPane();
   c.setLayout(new GridLayout(5,2));
   c.add(lbltype);
   c.add(p1);
   c.add(lblfac);
   c.add(p2);
   c.add(lblno);
   c.add(txtno);
   c.add(lblcharge);
   c.add(txtcharge); 
   c.add(btncal);
   c.add(btnclr);
   setSize(400,300);
   setVisible(true);
   show();
   
   btncal.addActionListener(this);
   btnclr.addActionListener(this);
   ButtonGroup bg=new ButtonGroup();
   bg.add(rbac);
   bg.add(rbnonac);
  }
  public void actionPerformed(ActionEvent ae)
  {
   if(ae.getSource()==btncal)
   {
    double charge=0;
    int n=Integer.parseInt(txtno.getText());
    if(rbac.isSelected())
     {
       charge=800;
     }
     else if(rbnonac.isSelected())
   {
    charge=500;
   }
   if(chklun.isSelected())
    {
     charge=charge+150;
    }
   if(chkdin.isSelected())
   {
    charge=charge+250;
   }
   if(chktea.isSelected())
   {
    charge=charge+50;
   }
   charge=charge*n;
   txtcharge.setText(charge+"");
  }
  else if(ae.getSource()==btnclr)
  {
   chklun.setSelected(false);
   chkdin.setSelected(false);
   chktea.setSelected(false);
   rbnonac.setSelected(false);
   rbac.setSelected(false);
   txtno.setText("");
   txtcharge.setText("");
  }
}
public static void main(String args[])
 {
   Res f=new Res();
 }
}
