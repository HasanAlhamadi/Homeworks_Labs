import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num1,num2,num3,avg;
        System.out.println("Enter three numbers: ");
        num1= input.nextFloat();
        num2= input.nextFloat();
        num3= input.nextFloat();
        avg=(num1+num2+num3)/3;
        System.out.println("Average= "+avg);

    }


}
