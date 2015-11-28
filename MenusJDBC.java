import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MenusJDBC extends JFrame implements ActionListener
{
 JMenuBar mb;
 JMenu mnunav;
 JMenuItem mnunext,mnuprev,mnuabs,mnurel,mnufirst,mnulast;
 JTextField txtname,txtsal;
 JLabel lblname,lblsal;

 ResultSet rs;
 MenusJDBC()
 {
   mb=new JMenuBar();
   mnunav=new JMenu("NAVIGATION");
   mnunext=new JMenuItem("NEXT");
   mnuabs=new JMenuItem("ABSOLUTE");mnurel=new JMenuItem("RELATIVE");
   mnufirst=new JMenuItem("FIRST");
   mnulast=new JMenuItem("LAST");
   
   mnuprev=new JMenuItem("PREV");
   txtname=new JTextField(10);
   txtsal=new JTextField(10);
   lblname =new JLabel("Name");
   lblname.setHorizontalAlignment(JLabel.CENTER);
   lblsal=new JLabel("Salary");
   lblsal.setHorizontalAlignment(JLabel.CENTER);
   mnunav.add(mnunext);mnunav.addSeparator();
   mnunav.add(mnuabs);mnunav.addSeparator();
   mnunav.add(mnurel);mnunav.addSeparator();
   mnunav.add(mnuprev);mnunav.addSeparator();
   mnunav.add(mnufirst);mnunav.addSeparator();
   mnunav.add(mnulast);
   mb.add(mnunav);
   
   Container c=getContentPane();
   c.setLayout(new GridLayout(2,2));
   c.add(lblname);c.add(txtname);
   c.add(lblsal);c.add(txtsal);

   c.add(mb);
   
   setJMenuBar(mb);
   setSize(400,400);
   setVisible(true);
   show();
   
   mnunext.addActionListener(this);
   mnuprev.addActionListener(this);
   mnurel.addActionListener(this);
   mnufirst.addActionListener(this);
   mnuabs.addActionListener(this);
   mnulast.addActionListener(this);
   try
   {
     
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:DSN");
     Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     //String str="select * from emp order by ename";
       String str="select * from emp ";
         rs=stm.executeQuery(str);
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null,e.toString()); 
  }
 }

 public void actionPerformed(ActionEvent ae)
 {
  
   try{
    if(ae.getSource()==mnunext)
   {
     if(rs.next())
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
   else  if(ae.getSource()==mnuprev)
   {
     if(rs.previous())
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
   else  if(ae.getSource()==mnuabs)
   {
     int n;
     n=Integer.parseInt(JOptionPane.showInputDialog(null,"enter record no"));
   
     if(rs.absolute(n))
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
  else  if(ae.getSource()==mnurel)
   {
     int n;
     n=Integer.parseInt(JOptionPane.showInputDialog(null,"enter record no"));
   
     if(rs.relative(n))
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
  else  if(ae.getSource()==mnufirst)
   {
     
     if(rs.first())
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
  else  if(ae.getSource()==mnulast)
   {
     
     if(rs.last())
     {
             txtname.setText(rs.getString(1));
             txtsal.setText(rs.getString(2));
     }
  }
  
 }
  
  
  catch(Exception e){
  JOptionPane.showMessageDialog(null,e.toString()); 
  }
 }
 public static void main(String args[])
 {
   MenusJDBC mnu=new MenusJDBC();
 }

}