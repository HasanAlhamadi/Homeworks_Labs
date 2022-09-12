import javax.swing.*;

public class E8_nameViewer {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Draw");
        frame.setSize(500,500);
        E8_Drawer name= new E8_Drawer();
        frame.add(name);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
