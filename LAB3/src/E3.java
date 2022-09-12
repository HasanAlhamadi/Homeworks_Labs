import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num=input.nextInt();
        if(num==0)
            System.out.println("zero");
        else if (num>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

    }
}
