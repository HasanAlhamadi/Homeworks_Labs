import javax.swing.*;
import java.awt.*;

public class E10 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(200,200);
        frame.setSize(400,400);

        JLabel label= new JLabel("Hello,world");
        label.setText("HASAN");

        label.setIcon(new ImageIcon("1.jpg"));
        Dimension size=label.getPreferredSize();
        label.setBounds(50,30,size.width,size.height);


        label.setOpaque(true);
        label.setBackground(Color.pink);
        label.setBackground(Color.gray);

        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
