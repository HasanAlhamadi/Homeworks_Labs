import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder text;
        System.out.println("Enter a text");
        text= new StringBuilder(in.next());
        text.reverse();
        System.out.println(text);
    }
}
