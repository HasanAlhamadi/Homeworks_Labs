import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        int num1,temp,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1= input.nextInt();
        num2= input.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The number after Swapping: \n"+num1+"\n"+num2);
    }
}
