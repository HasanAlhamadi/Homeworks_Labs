import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        String text;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text");
        text=in.next();
        for (int i = text.length()-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
