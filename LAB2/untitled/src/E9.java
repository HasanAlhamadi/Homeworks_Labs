import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two integers: ");
        num1= input.nextInt();
        num2= input.nextInt();
        System.out.println("Sum:  "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+num1*num2);
        System.out.println("Average: "+(num1+num2)/2.0);
        System.out.println("Distance: "+ Math.abs(num1-num2));
        System.out.println("Maximum: "+Math.max(num1,num2));
        System.out.println("Minimum: "+ Math.min(num1,num2));
    }
}
