import java.applet.Applet;
import java.awt.*;
public class flag extends Applet
{
    public void paint(Graphics g)
    {

         g.drawRect(40,40,10,250);   //pole

         g.setColor(Color.orange);   //upper rectangle
         g.fillRect(50,40,90,20);

         g.setColor(Color.white);    //center rectangle
         g.fillRect(50,60,90,20);

         g.setColor(Color.black);    //center circle
         g.drawOval(85,60,20,20);

         g.setColor(Color.green);    //lower rectangle
         g.fillRect(50,80,90,20);

         g.setColor(Color.black);    //base
         g.drawRect(10,290,70,20);

         g.setColor(Color.black);    // border to upper, center & lower rect
	     g.drawRect(50,40,90,20);
	     g.drawRect(50,60,90,20);
         g.drawRect(50,80,90,20);
    }
}