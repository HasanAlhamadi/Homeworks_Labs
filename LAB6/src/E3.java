import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        String text;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text: ");
        text=in.next();
        for (int i = 0; i <text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
