import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int digitCount=0;
        System.out.println("Enter an integer:");
        num=input.nextInt();
        while (num!=0){
            num/=10;
            digitCount++;
        }
        System.out.println("This number has "+digitCount+" digits.");
    }
}
