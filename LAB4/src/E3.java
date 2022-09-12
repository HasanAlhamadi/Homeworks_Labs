import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        String text;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a text");
        text=in.next();
        text=text.replaceAll("i","!");
        text=text.replace("s","$");
        System.out.println(text);
    }
}
