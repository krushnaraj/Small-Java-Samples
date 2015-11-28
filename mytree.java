import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

class mytree extends JFrame
{
 JTree jt;
 DefaultMutableTreeNode root,node1,node2,node3,node4;
 mytree()
 {
  root=new DefaultMutableTreeNode("B.SC");
  node1=new DefaultMutableTreeNode("I.T");
  node2=new DefaultMutableTreeNode("C.S");
  node3=new DefaultMutableTreeNode("JAVA");
  node4=new DefaultMutableTreeNode("TESTING");
  node2.add(node3);
  node2.add(node4);
  root.add(node1);
  root.add(node2);
  
  jt=new JTree(root);
 
  Container con=getContentPane();
  
  con.add(jt);
  setSize(500,400);
  setVisible(true);
  show();
 }

 public static void main(String args[])
  {
   mytree mt=new mytree();
  }
}