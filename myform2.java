import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class myform2 extends JFrame implements ActionListener
{
JLabel lblName,lblSal;
JTextField txtName,txtSal;
JButton btnShow;
JPanel p1,p2;
JTabbedPane jtb;
myform2()
{
lblName=new JLabel("Name");
lblSal=new JLabel("Salary");
txtName=new JTextField(10);
txtSal=new JTextField(10);
btnShow=new JButton("Show");
jtb=new JTabbedPane();
p1=new JPanel();
p2=new JPanel();
p1.add(lblName);
p1.add(txtName);
p2.add(lblSal);
p2.add(txtSal
);
p2.add(btnShow);
jtb.addTab("Personal",p1);
jtb.addTab("Official",p2);
Container c=getContentPane();
c.add(jtb);
setSize(300,300);
setVisible(true);
show();
btnShow.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==btnShow)
{
String str;
str="Name:"+txtName.getText();
str=str+"Salary:"+txtSal.getText();
JOptionPane.showMessageDialog(null,str);
}
}
public static void main(String args[])
{
myform2 f=new myform2();
}
}