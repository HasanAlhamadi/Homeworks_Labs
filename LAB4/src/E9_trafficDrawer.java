import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class E9_trafficDrawer extends JComponent {
    public void paint(Graphics g){
        Rectangle r=new Rectangle(100,100,100,250);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.black);
        g2.fill(r);

        Ellipse2D.Double circle1= new Ellipse2D.Double(130,110,50,50);
        g2.setColor(Color.green);
        g2.fill(circle1);

        Ellipse2D.Double circle2= new Ellipse2D.Double(130,180,50,50);
        g2.setColor(Color.yellow);
        g2.fill(circle2);

        Ellipse2D.Double circle3= new Ellipse2D.Double(130,250,50,50);
        g2.setColor(Color.red);
        g2.fill(circle3);

    }
}
