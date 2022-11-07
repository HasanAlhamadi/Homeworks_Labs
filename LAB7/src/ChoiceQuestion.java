import java.util.ArrayList;

public class ChoiceQuestion extends Question {
        private ArrayList<String> choices;

        public ChoiceQuestion()
        {
            choices=new ArrayList<>();
        }
        public void addChoice(String ch,boolean correct)
        {
            choices.add(ch);
            if (correct)
                setAnswer(choices.size()+"");
        }
        public void display()
        {
            super.display();
            for (int i = 0; i <choices.size() ; i++) {
                System.out.println((i+1)+" "+choices.get(i));
            }
        }


}
