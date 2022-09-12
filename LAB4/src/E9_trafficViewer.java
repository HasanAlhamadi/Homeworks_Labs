import javax.swing.*;

public class E9_trafficViewer {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Traffic light");
        frame.setSize(500,500);
        E9_trafficDrawer draw= new E9_trafficDrawer();
        frame.add(draw);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
