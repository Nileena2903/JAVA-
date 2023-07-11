/*<applet code="Applets.class" width="300"height="300">
</applet>*/
import java.applet.*;
import java.awt.*;
public class Applets extends Applet
{
public void paint(Graphics g)
{
g.drawLine(20,50,150,50);
g.drawRect(20,60,160,40);
g.drawOval(20,120,160,160);
g.drawString("hello friends",40,90);
}
}

