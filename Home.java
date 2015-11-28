import java.awt.*;
import java.applet.*;

public class Home extends Applet
{
 public void paint(Graphics g)
 {
   g.setColor(Color.green);
   g.fillRect(100,100,200,130);
   g.setColor(Color.blue);
   g.fillRect(180,180,40,50);
   g.setColor(Color.red);
   g.fillRect(130,140,30,30);
   g.fillRect(240,140,30,30);
   g.drawLine(100,100,200,50);
   g.drawLine(200,50,300,100);
 }
}

/* <applet code="Home.class" height=300 width=300></applet>*/