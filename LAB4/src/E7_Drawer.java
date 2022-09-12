import javax.swing.*;
import java.awt.*;

public class E7_Drawer extends JComponent {
    public void paint(Graphics g){
        Rectangle square=new Rectangle(50,50,100,100);
        Rectangle square2=new Rectangle(50,200,100,100);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.black);
        g2.fill(square);
//        g2.draw(square);
        g2.setColor(Color.green);
        g2.fill(square2);
    }

}
