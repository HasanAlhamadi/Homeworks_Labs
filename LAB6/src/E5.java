import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        String text;
        char vowls []={'a','i','o','u','y'};
        int vowls_num=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter text: ");
        text=in.next();
        for (int i = 0; i < text.length() ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (text.charAt(i)==vowls[j])
                    vowls_num++;
            }
        }
        System.out.println(text+" has "+vowls_num+" vowls letters");
    }
}
