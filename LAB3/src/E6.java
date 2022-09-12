import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        float x,y,z;
        System.out.println("Enter three numbers");
        x=in.nextFloat();
        y= in.nextFloat();
        z= in.nextFloat();

        if(x<y & y<z)
            System.out.println("Increasing");
        else if (x>y & y>z)
            System.out.println("Decreasing");
        else
            System.out.println("Neither");
    }
}
