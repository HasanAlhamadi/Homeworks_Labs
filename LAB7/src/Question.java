public class Question {
        protected String text;
        protected String answer;

        public Question() {
            text=null;
            answer=null;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
        public void display()
        {
            System.out.println(text);
        }
        public boolean checkAnswer(String response)
        {
            return answer.toUpperCase().equals(response.toUpperCase());
        }

}
