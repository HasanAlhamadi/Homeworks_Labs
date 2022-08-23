import javax.swing.JOptionPane;
public class E10 {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("What's your name?");
        String wish=JOptionPane.showInputDialog("Hello, I'm Hal.\nWhat would you like me to do?");
        JOptionPane.showMessageDialog(null,"Sorry,"+name+". I can't do that");
    }
}
