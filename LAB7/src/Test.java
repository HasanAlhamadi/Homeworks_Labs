import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Question> all= new ArrayList<>();

        Question q1=new Question();
        q1.setText("Whats your name?");
        q1.setAnswer("Hasan");

        ChoiceQuestion  q2=new ChoiceQuestion();
        q2.setText("Who are you?");
        q2.addChoice("Hasan",true);
        q2.addChoice("Akram",false);
        q2.addChoice("Abas",false);

        Question q3=new Question();
        q3.setText("How are you?");
        q3.setAnswer("Bad");

        FillingQuestion q4=new FillingQuestion();
        q4.setText("The inventor of Java is _______");
        q4.setAnswer("James gosling");

        all.add(q1);
        all.add(q2);
        all.add(q3);
        all.add(q4);


        for (int i = 0; i <all.size() ; i++) {
            presentQuestion(all.get(i));
        }
    }
    public static void presentQuestion(Question q)
    {
        q.display();
        Scanner in = new Scanner(System.in);
        String r=in.next();
        System.out.println(q.checkAnswer(r));
    }

}