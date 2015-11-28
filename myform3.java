import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class myform3 extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu mnuFile,mnuEdit;
JMenuItem mnuOpen,mnuClose,mnuCopy;
myform3()
{
mb=new MenuBar();
mnuFile=new JMenu("File");
mnuEdit=new JMenu("Edit");
mnuOpen=new JMenuItem("Open");
mnuClose=new JMenuItem("Close");
mnuCopy=new JMenuItem("Copy");
mnuFile.add(mnuOpen);
mnuFile.addSeperator();
mnuFile.add(mnuClose);
mnuFile.add(mnuCopy);
setSize(200,200);
setVisible(true);
show();
mnuFile.setMnemonic('F');
mnuEdit.setMnemonic('E');
mnuOpen.addActionListener(this);
mnuClose.addActionListener(this);
mnuCopy.addActionListener(this);
}
public static void main(String args[])
{
myform2 f=new myform2();
}
}