import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float length,width,area,perimeter;
        System.out.println("Enter the length of the rectangular: ");
        length= input.nextFloat();
        System.out.println("Enter the width: ");
        width= input.nextFloat();
        area=length*width;
        perimeter=2*(length+width);
        System.out.println("Area= "+area);
        System.out.println("Perimeter= "+perimeter);
    }
}
