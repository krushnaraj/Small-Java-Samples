import java.awt.*;
import javax.swing.*;
class myform4 extends JFrame
{
JPanel p1;
JScrollPane jsp;
myform4()
{

p1=new JPanel();
p1.setLayout(new GridLayout(20,20));
for(int i=1;i<=20;i++)
{
for(int j=1;j<=20;j++)
{
p1.add(new JButton(i+" "+j));
}
}
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
jsp=new JScrollPane(p1,v,h);
Container c=getContentPane();
c.add(jsp);
setSize(300,300);
setVisible(true);
show();
}
public static void main(String args[])
{
  myform4 f=new myform4();
}
}
