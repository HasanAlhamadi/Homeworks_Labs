import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double PI =22.0/7;
        double r,area,perimeter;
        System.out.println("Enter the Radius of the circle: ");
        r=input.nextDouble();
        area=PI*Math.pow(r,2);
        perimeter=2*PI*r;
        System.out.println("Area= "+area);
        System.out.println("Perimeter= "+perimeter);

    }
}
