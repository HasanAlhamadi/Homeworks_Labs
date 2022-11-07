import java.awt.*;

public class BetterRectangular extends Rectangle {
    private double parameter;
    private double area;

    public BetterRectangular(int width, int height) {
        super(width, height);
        parameter=2*(width+height);
        area=width*height;
    }

    public double getParameter() {
        return parameter;
    }

    public double getArea() {
        return area;
    }
}
