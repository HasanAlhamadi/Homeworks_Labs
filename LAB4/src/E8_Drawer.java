import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class E8_Drawer extends JComponent {
    public void paint(Graphics g){
        Rectangle r=new Rectangle(100,150,200,80);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fill(r);

        g2.setColor(Color.red);
        g2.drawString("Hasan",150,200);
    }
}
