import java.awt.*;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(10,5);
        double p= rectangle.getHeight()*rectangle.getWidth();
        System.out.println("The perimeter is "+p);

    }
}
