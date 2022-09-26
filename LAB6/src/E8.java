import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        int limit;
        int counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a limit number:");
        limit=in.nextInt();
        for (int i = 2; i <=limit ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%j==0)
                    counter++;
            }
            if (counter==2)
                System.out.println(i);
            counter=0;
        }
    }
}
