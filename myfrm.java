import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myfrm extends JFrame
{
 JTable jt;
 myfrm()
 {
  String cols[]={"NAME","ADDRESS","TELL.NO"};
  Object data[][]={{"KRUSHNARAJ","DADAR","37168"},{"ADITYA","SION","48754"},{"SIDDHESH","THANE","8556569"}};
  jt =new JTable(data,cols);
 
  Container con=getContentPane();
  con.setLayout(new BorderLayout());
  con.add(jt,BorderLayout.CENTER);
  
  con.add(jt.getTableHeader(),BorderLayout.NORTH);
  setSize(600,450);
  setVisible(true);
  
  show();
 }
 public static void main(String args[])
 {
   myfrm mf=new myfrm();
 }
}
  