import javax.swing.*;

public class E7_Viewer {
    public static void main(String[] args) {
        E7_Drawer myDraw=new E7_Drawer();
        JFrame frame=new JFrame("The Drawing");
        frame.setSize(500,500);
        frame.add(myDraw);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
