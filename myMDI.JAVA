import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class frmemp extends JInternalFrame
{
 frmemp()
 {
  super("Employee",true,true,true,true);
  setSize(200,200);
 }
}

class frmcust extends JInternalFrame
{
  frmcust()
  {
   super("Customer",true,true,true,true);
   setSize(200,200);
  }
}
class frmdept extends JInternalFrame
{
 frmdept()
 {
  super("Department",true,true,true,true);
  setSize(200,200);
 }
}


class myMDI extends JFrame implements ActionListener
{
 JDesktopPane jdsk;
 frmemp e;
 frmcust c;
 frmdept d;
 
 JMenuBar mb;
 JMenu mnumaster;
 JMenuItem mnuemp,mnucust,mnudept;

 myMDI()
 {
  super("MDI FORM");
  mb=new JMenuBar();
  mnumaster=new JMenu("Master");
  mnuemp=new JMenuItem("Emp");
  mnucust=new JMenuItem("Cust");
  mnudept=new JMenuItem("Dept");
  mnumaster.add(mnuemp);
  mnumaster.add(mnucust);
  mnumaster.add(mnudept);
  mb.add(mnumaster);

  setJMenuBar(mb);
  jdsk=new JDesktopPane();
  e=new frmemp();
  c=new frmcust();
  d=new frmdept();

  jdsk.add(e);
  jdsk.add(c);
  jdsk.add(d);

  Container c=getContentPane();
  c.add(jdsk);
 setSize(800,700);
  setVisible(true);
  show();

  mnuemp.addActionListener(this);
  mnucust.addActionListener(this);
  mnudept.addActionListener(this);
 
}

 public void actionPerformed (ActionEvent ae)
 {
  if(ae.getSource()==mnuemp)
  {
   e.setVisible(true);
   c.setVisible(false);
   d.setVisible(false);
   e.show();
  }

  else if(ae.getSource()==mnucust)
  {
   c.setVisible(true);
   e.setVisible(false);
   d.setVisible(false);
   c.show();
  }
  else if(ae.getSource()==mnudept)
  {
   d.setVisible(true);
   e.setVisible(false);
   c.setVisible(false);
   d.show();
  }
}
  public static void main(String args[])
 {
  myMDI m=new myMDI();
 }
                                                                                                                                                                                                             }