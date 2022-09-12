import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char letter;
        int number;
        boolean wrong = true;
        String color = "";
        System.out.println("Enter a letter from 'a' to 'h' :");
        letter = input.next().charAt(0);
        System.out.println("Enter a number from '1' to '8' :");
        number = input.nextInt();

        for (int i = 0; i < 8; i++)
            if (letter == (letters[i])) {
                wrong = false;
                break;
            }
        if (wrong) {
            System.out.println("Invalid letter");
            return;
        }

        if (number < 1 | number > 8) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (letter == letters[i]) {
                if (i % 2 == 0) {
                    if (number % 2 != 0)
                        color = "Black";
                    else
                        color = "White";
                    break;
                } else {
                    if (number % 2 == 0)
                        color = "Black";
                    else
                        color = "White";
                    break;
                }

            }
        }
        System.out.println(letter + "" + number + " is " + color);
    }
}
