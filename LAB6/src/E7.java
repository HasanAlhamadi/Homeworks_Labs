import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        int num;
        int binary_arry[] = new int[32];
        int counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        System.out.println("The number in binary");
        while (num>0){
            binary_arry[counter]=num%2;
            num/=2;
            counter++;
        }
        for (int i = counter-1; i >=0 ; i--) {
            System.out.print(binary_arry[i]);
        }
    }
}
