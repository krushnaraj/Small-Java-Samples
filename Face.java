import java.awt.*;
import java.applet.*;

public class Face extends Applet
{
  int x,y;
  public void init()
  {
   x=20;
   y=20;
  }

  public void paint(Graphics g)
  {
   g.setColor(Color.blue);
   g.fillOval(100,100,80,80);
   g.setColor(Color.green);
   g.fillOval(110,120,20,20);
   g.fillOval(150,120,x,y);
   g.fillOval(135,140,8,15);
   g.fillOval(130,160,15,8);
  }
}

/* <applet code="Face.class" height=300 width=300></applet>*/