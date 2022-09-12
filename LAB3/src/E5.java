import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        float x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        x=in.nextFloat();
        y= in.nextFloat();
        z= in.nextFloat();

        if(x==z & z==y)
            System.out.println("All the same");
        else if (x!=z & x!=y & z!=y)
            System.out.println("All different");
        else
            System.out.println("Neither");

    }
}
