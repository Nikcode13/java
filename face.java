import java.applet.Applet;
import java.awt.*;
public class face extends Applet
{
    public void paint(Graphics g)
    {
         g.setColor(Color.red);

         g.drawOval(40,40,200,200);
		 g.drawOval(80,80,30,20);
	     g.drawOval(170,80,30,20);
         g.drawLine(140,100,140,160);

		 //g.drawArc(80,150,120,60,180,180);
		 g.drawOval(80,150,120,20);

    }
}