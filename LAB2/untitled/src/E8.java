import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        int num;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num= input.nextInt();
        System.out.println("The Square= "+num*num);
        System.out.println("The cube= "+num*num*num);
        System.out.println("To the power of 4= "+ Math.pow(num,4));
    }
}
