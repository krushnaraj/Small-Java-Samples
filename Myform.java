import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myform extends JFrame implements ActionListener
{
  JLabel lbllist,lblnew,lblold;
  JTextField txtnew,txtold;
  JComboBox cbolist;
  JButton btnadd,btnrem;

  Myform()
 {
   lbllist=new JLabel("LIST");
   lblnew=new JLabel("NEW");
   lblold=new JLabel("OLD");
   txtnew=new JTextField(10); 
   txtold=new JTextField(10);
   cbolist=new JComboBox();
   btnadd= new JButton("ADD");
   btnrem=new JButton("REMOVE");
   
   Container c=getContentPane();
   c.setLayout(new GridLayout(4,2));
   c.add(lbllist);
   c.add(cbolist);
   c.add(lblnew);
   c.add(txtnew);
   c.add(lblold);
   c.add(txtold);
   c.add(btnadd);
   c.add(btnrem);
   setSize(400,400);
   setVisible(true);
   show();
  btnadd.addActionListener(this);
  btnrem.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==btnadd)
  {
   String strnew=txtnew.getText();
   int i,n,flag=1;
   n=cbolist.getItemCount();

   for(i=0;i<n;i++)
   {
    String strold=(String)cbolist.getItemAt(i);
    if(strold.equals(strnew))
     {
      flag=0;
     }
   }

   if(flag==1)
   {
    cbolist.addItem(strnew);
    txtnew.setText("");
   }
   else
   {
    JOptionPane.showMessageDialog(null,"Element already exist");
   }
}
else if(ae.getSource()==btnrem)
 {
   int pos=Integer.parseInt(txtold.getText());
  
   int n=cbolist.getItemCount();
  
   if(pos>0&&pos<n)
   {
    cbolist.removeItemAt(pos);
    txtold.setText("");
   }
   else
   {
    JOptionPane.showMessageDialog(null,"Invalid index");
   }
  }
 }

  public static void main(String args[])
  {
   Myform f=new Myform();
  }
}