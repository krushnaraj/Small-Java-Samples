import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApp extends Applet implements MouseListener
{
   int x1,y1,x2,y2;
   public void init()
   {
      x1=0;
      y1=0;
      addMouseListener(this);
      x2=0;
      y2=0;
      
     
   }
   public void mousePressed(MouseEvent me)
   {
      
      x1=me.getX();
      y1=me.getY();
   }
   public void mouseClicked(MouseEvent me){}
   public void mouseExited(MouseEvent me){}
   public void mouseEntered(MouseEvent me){}
   public void mouseReleased(MouseEvent me)
   {
      
      x2=me.getX();
      y2=me.getY();
      repaint();
      
   }
   public void paint(Graphics g)
   {
      g.drawLine(x1,y1,x2,y2);
   }
   public void stop(Graphics g)
    {
     
     }
}                      
/* <applet code="MyApp.class" height="400" width="400">
   </applet>
*/
